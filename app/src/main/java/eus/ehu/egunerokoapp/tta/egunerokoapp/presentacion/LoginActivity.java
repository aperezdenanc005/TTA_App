package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import eus.ehu.egunerokoapp.tta.egunerokoapp.modelo.RestClient;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;

public class LoginActivity extends AppCompatActivity {

    RestClient restClient=new RestClient("http://u017633.ehu.eus:28080/EgunerokoApp/rest/App");
    String resultadoGETLogin;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void lanzarMenu(View view)
    {
        final String login =((EditText)findViewById(R.id.login_edit_text)).getText().toString();
        final String passwd =((EditText)findViewById(R.id.login_contrasena_edit_text)).getText().toString();
        new AsyncTask<Void,Void,Void>()
        {
            @Override
            protected Void doInBackground(Void... voids)
            {
                try{
                    //restClient.setHttpBasicAuth(dni,passwd);
                    resultadoGETLogin=restClient.getString(String.format("iniciarSesion?contrasena=%s",passwd+"&login="+login));
                //} catch (JSONException e) {
                    //e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //String ok=resultadoGETLogin;

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid)
            {
                if(login.matches("") || passwd.matches(""))
                {
                    Toast.makeText(getApplicationContext(),R.string.campos,Toast.LENGTH_LONG).show();
                }else
                {
                    if(resultadoGETLogin.matches("OK"))
                    {
                        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
                        startActivity(intent);

                        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
                        SharedPreferences.Editor editor=prefs.edit();

                        String login=((EditText) findViewById(R.id.login_edit_text)).getText().toString();;
                        editor.putString("login",login);
                        editor.commit();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), R.string.usuario_incorrecto,Toast.LENGTH_LONG).show();
                    }
                }
            }
        }.execute();
    }
}
