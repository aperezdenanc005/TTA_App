package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import android.view.View;
import android.content.Intent;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void lanzarlogin(View view)
    {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
