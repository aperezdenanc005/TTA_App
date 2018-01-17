package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import eus.ehu.egunerokoapp.tta.egunerokoapp.modelo.RestClient;

import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.json.JSONException;
import org.json.JSONObject;

public class RegistroActivity extends AppCompatActivity
{
    RestClient restClient=new RestClient("http://u017633.ehu.eus:28080/EgunerokoApp/rest/App");
    String resultadoPOSTRegistro;
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
        new AsyncTask<Void,Void,Void>()
        {
            final String nombre =((EditText)findViewById(R.id.nombre_edit_text)).getText().toString();
            final String dni =((EditText)findViewById(R.id.dni_edit_text)).getText().toString();
            final String contrasena =((EditText)findViewById(R.id.contrasena_edit_text)).getText().toString();
            @Override
            protected Void doInBackground(Void... voids)
            {
                try{
                    JSONObject json=new JSONObject();
                    json.put("nombre",nombre);
                    json.put("contrasena",contrasena);
                    json.put("dni",dni);
                    resultadoPOSTRegistro=restClient.postJSON(json,String.format("registrarUsuario"));
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String visualizar=resultadoPOSTRegistro;
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid)
            {
                if(nombre.matches("") || dni.matches("") || contrasena.matches(""))
                {
                    Toast.makeText(getApplicationContext(),R.string.campos,Toast.LENGTH_LONG).show();
                }else
                {
                    if(resultadoPOSTRegistro.matches("ERROR"))
                    {
                        Toast.makeText(getApplicationContext(),R.string.error_registro,Toast.LENGTH_LONG).show();
                    }
                    else{
                        String mostrarLogin=String.format("El registro se ha realizado correctamente!! Para jugar primero tienes que logearte. Tu login es: %s",resultadoPOSTRegistro);
                        Toast.makeText(getApplicationContext(), mostrarLogin,Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(intent);
                    }

                }
            }
        }.execute();

    }

    public void lanzarloginYaResgistrado(View view)
    {
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
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
            switch(requestCode)
            {
                case PICTURE_REQUEST_CODE:
                    //Toast.makeText(this,String.valueOf(pictureUri),Toast.LENGTH_SHORT).show();
                    //Bitmap bitmap = BitmapFactory.decodeFile(String.valueOf(pictureUri));
                    break;
            }
        }
    }
}
