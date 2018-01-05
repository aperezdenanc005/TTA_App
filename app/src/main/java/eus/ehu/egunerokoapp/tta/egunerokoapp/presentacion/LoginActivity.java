package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void lanzarMenu(View view)
    {
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();

        String login=((EditText) findViewById(R.id.login_edit_text)).getText().toString();;
        editor.putString("login",login);
        editor.commit();
    }
}
