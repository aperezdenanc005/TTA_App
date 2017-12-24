package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;

public class GoizeanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goizean);
    }
    public void lanzarGozoGozoa(View view)
    {
        Intent intent=new Intent(this,GozogozoaActivity.class);
        startActivity(intent);
    }
    public void lanzarBagoaz(View view)
    {
        Intent intent=new Intent(this,PuntuazioaActivity.class);
        startActivity(intent);
    }
}
