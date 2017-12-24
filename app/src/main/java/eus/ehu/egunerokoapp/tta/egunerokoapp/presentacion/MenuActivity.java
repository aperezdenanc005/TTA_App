package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
