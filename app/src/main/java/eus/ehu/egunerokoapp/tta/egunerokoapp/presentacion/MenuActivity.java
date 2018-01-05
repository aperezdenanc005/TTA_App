package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import java.io.File;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private final static int READ_REQUEST_CODE=0;
    private Uri pictureUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        TextView login=findViewById(R.id.login_menu_text);
        String prefLogin=prefs.getString("login","");
        login.setText("LOGIN: "+prefLogin);
        login.setGravity(Gravity.CENTER);

        ImageView imagePerfil=findViewById(R.id.imagePerfil);
        String imagenPath=prefs.getString("imagenPath","");
        //Toast.makeText(this,imagenPath,Toast.LENGTH_LONG).show();

        if(imagenPath=="")
        {
            imagePerfil.setImageResource(R.drawable.usuario);
        }
        else
        {
            String toRemove="file://";
            String path=imagenPath.replace(toRemove,"");
            //Toast.makeText(this,path,Toast.LENGTH_LONG).show();
            Bitmap bitmap = BitmapFactory.decodeFile(path);
            imagePerfil.setImageBitmap(bitmap);
        }
    }
    public void lanzarGoizean(View view)
    {
        Intent intent=new Intent(this,GoizeanActivity.class);
        startActivity(intent);
    }
    public void lanzarZerDiozu(View view)
    {
        Intent intent=new Intent(this,ZerdiozuActivity.class);
        startActivity(intent);
    }
    public void lanzarJolastekoEkintzak(View view)
    {
        Intent intent=new Intent(this,EkintzakActivity.class);
        startActivity(intent);
    }
    public void lanzarPuntuazioa(View view)
    {
        Intent intent=new Intent(this,PuntuazioaActivity.class);
        startActivity(intent);
    }
}
