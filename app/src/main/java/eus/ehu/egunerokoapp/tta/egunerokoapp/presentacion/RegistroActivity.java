package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class RegistroActivity extends AppCompatActivity
{
    private final static int PICTURE_REQUEST_CODE=1;
    private Uri pictureUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();
        editor.clear();
        editor.commit();
    }
    public void lanzarlogin(View view)
    {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

    public void sacarFoto(View view)
    {
        if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
        {
            Toast.makeText(this,R.string.no_camera,Toast.LENGTH_SHORT).show();
        }else
        {
            Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if(intent.resolveActivity(getPackageManager())!=null)
            {
                //Obtengo el path
                File dir= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                try
                {
                    //File file=new File(dir,"argazkia.jpg");
                    File file=File.createTempFile("tta",".jpg",dir);
                    pictureUri= Uri.fromFile(file);
                    intent.putExtra(MediaStore.EXTRA_OUTPUT,pictureUri);
                    startActivityForResult(intent,PICTURE_REQUEST_CODE);
                }catch (IOException es)
                {
                    es.printStackTrace();
                }
            }else
            {
                Toast.makeText(this,R.string.no_app,Toast.LENGTH_SHORT).show();
            }
        }

        String imagenURL= String.valueOf(pictureUri);
        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();
        editor.putString("imagenPath",imagenURL);
        editor.commit();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        //Si el resultado de la ejecucion (Subir fichero, sacar foto, grabar video u audio) no es exitoso
        if(resultCode!= Activity.RESULT_OK)
        {
            return;
        }
        else
        {
            switch(resultCode)
            {
                case PICTURE_REQUEST_CODE:
                    //Toast.makeText(this,String.valueOf(pictureUri),Toast.LENGTH_SHORT).show();
                    //Bitmap bitmap = BitmapFactory.decodeFile(String.valueOf(pictureUri));
                    break;
            }
        }
    }
}
