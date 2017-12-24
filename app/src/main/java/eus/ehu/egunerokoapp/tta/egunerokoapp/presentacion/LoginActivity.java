package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
    }
}
