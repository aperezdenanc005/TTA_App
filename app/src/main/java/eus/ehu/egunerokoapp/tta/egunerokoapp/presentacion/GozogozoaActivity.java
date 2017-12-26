package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;


public class GozogozoaActivity extends AppCompatActivity {

    String[] respuestasTest1={"SAGARRA","GOZOKIAK","AZENARIO","GAZTA"};
    int clickado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gozogozoa);

        ImageView idImagenGozoGozoa=(ImageView)findViewById(R.id.image_gozoGozoa);
        idImagenGozoGozoa.setImageResource(R.drawable.sagarra);

        String[] respuestasTest1menzcladas=Randomize(respuestasTest1);
        final Button respuesta1=(Button)findViewById(R.id.gozogozoa_aukera1);
        respuesta1.setText(respuestasTest1menzcladas[0]);
        final Button respuesta2=(Button)findViewById(R.id.gozogozoa_aukera2);
        respuesta2.setText(respuestasTest1menzcladas[1]);
        final Button respuesta3=(Button)findViewById(R.id.gozogozoa_aukera3);
        respuesta3.setText(respuestasTest1menzcladas[2]);
        final Button respuesta4=(Button)findViewById(R.id.gozogozoa_aukera4);
        respuesta4.setText(respuestasTest1menzcladas[3]);

        respuesta1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                respuesta2.setEnabled(false);
                respuesta3.setEnabled(false);
                respuesta4.setEnabled(false);
                clickado=1;
                findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.VISIBLE);
            }

        });
        respuesta2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                respuesta1.setEnabled(false);
                respuesta3.setEnabled(false);
                respuesta4.setEnabled(false);
                clickado=2;
                findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.VISIBLE);
            }

        });
        respuesta3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                respuesta1.setEnabled(false);
                respuesta2.setEnabled(false);
                respuesta4.setEnabled(false);
                clickado=3;
                findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.VISIBLE);
            }

        });
        respuesta4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                respuesta1.setEnabled(false);
                respuesta3.setEnabled(false);
                respuesta2.setEnabled(false);
                clickado=4;
                findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.VISIBLE);
            }

        });
    }

    public static String[] Randomize(String[] arr)
    {
        String[] randomizedArray = new String[arr.length];
        System.arraycopy(arr, 0, randomizedArray, 0, arr.length);
        Random rgen = new Random();

        for (int i = 0; i < randomizedArray.length; i++) {
            int randPos = rgen.nextInt(randomizedArray.length);
            String tmp = randomizedArray[i];
            randomizedArray[i] = randomizedArray[randPos];
            randomizedArray[randPos] = tmp;
        }

        return randomizedArray;
    }

    public void konprobatuGozoGozoa(View view)
    {
        final String correct="SAGARRA";
        int puntuazioaGozoGoza=0;
        Toast toast =Toast.makeText(this,R.string.test_opcion_correcta,Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        Button res1=(Button)findViewById(R.id.gozogozoa_aukera1);
        Button res2=(Button)findViewById(R.id.gozogozoa_aukera2);
        Button res3=(Button)findViewById(R.id.gozogozoa_aukera3);
        Button res4=(Button)findViewById(R.id.gozogozoa_aukera4);

        if(clickado==1 && res1.getText()==correct)
        {
            toast.show();
            puntuazioaGozoGoza++;
        }
        else if(clickado==2 && res2.getText()==correct)
        {
            toast.show();
            puntuazioaGozoGoza++;
        }
        else if(clickado==3 && res3.getText()==correct)
        {
            toast.show();
            puntuazioaGozoGoza++;
        }
        else if(clickado==4 && res4.getText()==correct)
        {
            toast.show();
            puntuazioaGozoGoza++;
        }
        else
        {
            Toast toastIncorrecto=Toast.makeText(this,R.string.test_opcion_incorrecta,Toast.LENGTH_LONG);
            toastIncorrecto.show();
            //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            //toast.getView().setBackgroundColor(Color.DKGRAY);
        }
        findViewById(R.id.footer).setVisibility(View.VISIBLE);
        TextView emaitzak=(TextView)findViewById(R.id.emaitzak_gozoGozoa);
        emaitzak.setText("LORTUTAKO PUNTUAK: " + puntuazioaGozoGoza + "/12");
    }
}
