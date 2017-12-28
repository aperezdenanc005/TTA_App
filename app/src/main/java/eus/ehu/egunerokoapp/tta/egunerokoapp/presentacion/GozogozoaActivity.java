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
    String[] respuestasTest2={"ARRAINA","OGIA","ARROZA","SAGARRA"};
    String[] respuestasTest3={"SAGARRA","ESNEA","GAZTA","TXOKOLATEA"};
    String[] respuestasTest4={"ARROZA","GATZA","GAZTA","AZUKREA"};
    String[] respuestasTest5={"HARAGIA","AZUKREA","ARROZA","GAZTA"};
    String[] respuestasTest6={"GATZA","GAZTA","OGIA","GOZOKIAK"};
    String[] respuestasTest7={"HARAGIA","ARROZA","ARRAINA","SAGARRA"};
    String[] respuestasTest8={"GOZOKIAK","ARRAINA","AZUKREA","ARROZA"};
    String[] respuestasTest9={"SAGARRA","ARROZA","GAZTA","AZENARIOA"};
    String[] respuestasTest10={"AZENARIOA","TXOKOLATEA","GAZTA","ARRAINA"};
    String[] respuestasTest11={"TXOKOLATEA","GOZOKIAK","AZENARIOA","ARRAINA"};
    String[] respuestasTest12={"SAGARRA","AZENARIOA","TXOKOLATEA","GOZOKIAK"};
    int clickado=0;
    int[] numeroTest={1,2,3,4,5,6,7,8,9,10,11,12};
    int numeroTestActual=0;
    int puntuazioaGozoGoza=0;
    int[] testsAleatorios=RandomizeIntArray(numeroTest);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gozogozoa);

        cargarTest(testsAleatorios);
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

    public static int[] RandomizeIntArray(int[] array){
        Random rgen = new Random();  // Random number generator

        for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
    public void cargarTest(int[] testsAleatorios)
    {
        ImageView idImagenGozoGozoa=(ImageView)findViewById(R.id.image_gozoGozoa);
        String[] respuestasTest1menzcladas=Randomize(respuestasTest1);
        String[] respuestasTest2menzcladas=Randomize(respuestasTest2);
        String[] respuestasTest3menzcladas=Randomize(respuestasTest3);
        String[] respuestasTest4menzcladas=Randomize(respuestasTest4);
        String[] respuestasTest5menzcladas=Randomize(respuestasTest5);
        String[] respuestasTest6menzcladas=Randomize(respuestasTest6);
        String[] respuestasTest7menzcladas=Randomize(respuestasTest7);
        String[] respuestasTest8menzcladas=Randomize(respuestasTest8);
        String[] respuestasTest9menzcladas=Randomize(respuestasTest9);
        String[] respuestasTest10menzcladas=Randomize(respuestasTest10);
        String[] respuestasTest11menzcladas=Randomize(respuestasTest11);
        String[] respuestasTest12menzcladas=Randomize(respuestasTest12);
        final Button respuesta1=(Button)findViewById(R.id.gozogozoa_aukera1);
        final Button respuesta2=(Button)findViewById(R.id.gozogozoa_aukera2);
        final Button respuesta3=(Button)findViewById(R.id.gozogozoa_aukera3);
        final Button respuesta4=(Button)findViewById(R.id.gozogozoa_aukera4);


        switch(testsAleatorios[numeroTestActual])
        {
            case 1:
                idImagenGozoGozoa.setImageResource(R.drawable.sagarra);
                respuesta1.setText(respuestasTest1menzcladas[0]);
                respuesta2.setText(respuestasTest1menzcladas[1]);
                respuesta3.setText(respuestasTest1menzcladas[2]);
                respuesta4.setText(respuestasTest1menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 2:
                idImagenGozoGozoa.setImageResource(R.drawable.ogia);
                respuesta1.setText(respuestasTest2menzcladas[0]);
                respuesta2.setText(respuestasTest2menzcladas[1]);
                respuesta3.setText(respuestasTest2menzcladas[2]);
                respuesta4.setText(respuestasTest2menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 3:
                idImagenGozoGozoa.setImageResource(R.drawable.esnea);
                respuesta1.setText(respuestasTest3menzcladas[0]);
                respuesta2.setText(respuestasTest3menzcladas[1]);
                respuesta3.setText(respuestasTest3menzcladas[2]);
                respuesta4.setText(respuestasTest3menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 4:
                idImagenGozoGozoa.setImageResource(R.drawable.azukrea);
                respuesta1.setText(respuestasTest4menzcladas[0]);
                respuesta2.setText(respuestasTest4menzcladas[1]);
                respuesta3.setText(respuestasTest4menzcladas[2]);
                respuesta4.setText(respuestasTest4menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 5:
                idImagenGozoGozoa.setImageResource(R.drawable.arroza);
                respuesta1.setText(respuestasTest5menzcladas[0]);
                respuesta2.setText(respuestasTest5menzcladas[1]);
                respuesta3.setText(respuestasTest5menzcladas[2]);
                respuesta4.setText(respuestasTest5menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 6:
                idImagenGozoGozoa.setImageResource(R.drawable.gatza);
                respuesta1.setText(respuestasTest6menzcladas[0]);
                respuesta2.setText(respuestasTest6menzcladas[1]);
                respuesta3.setText(respuestasTest6menzcladas[2]);
                respuesta4.setText(respuestasTest6menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 7:
                idImagenGozoGozoa.setImageResource(R.drawable.haragia);
                respuesta1.setText(respuestasTest7menzcladas[0]);
                respuesta2.setText(respuestasTest7menzcladas[1]);
                respuesta3.setText(respuestasTest7menzcladas[2]);
                respuesta4.setText(respuestasTest7menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 8:
                idImagenGozoGozoa.setImageResource(R.drawable.arraina);
                respuesta1.setText(respuestasTest8menzcladas[0]);
                respuesta2.setText(respuestasTest8menzcladas[1]);
                respuesta3.setText(respuestasTest8menzcladas[2]);
                respuesta4.setText(respuestasTest8menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 9:
                idImagenGozoGozoa.setImageResource(R.drawable.gazta);
                respuesta1.setText(respuestasTest9menzcladas[0]);
                respuesta2.setText(respuestasTest9menzcladas[1]);
                respuesta3.setText(respuestasTest9menzcladas[2]);
                respuesta4.setText(respuestasTest9menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 10:
                idImagenGozoGozoa.setImageResource(R.drawable.txokolatea);
                respuesta1.setText(respuestasTest10menzcladas[0]);
                respuesta2.setText(respuestasTest10menzcladas[1]);
                respuesta3.setText(respuestasTest10menzcladas[2]);
                respuesta4.setText(respuestasTest10menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 11:
                idImagenGozoGozoa.setImageResource(R.drawable.gozokiak);
                respuesta1.setText(respuestasTest11menzcladas[0]);
                respuesta2.setText(respuestasTest11menzcladas[1]);
                respuesta3.setText(respuestasTest11menzcladas[2]);
                respuesta4.setText(respuestasTest11menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 12:
                idImagenGozoGozoa.setImageResource(R.drawable.azenarioa);
                respuesta1.setText(respuestasTest12menzcladas[0]);
                respuesta2.setText(respuestasTest12menzcladas[1]);
                respuesta3.setText(respuestasTest12menzcladas[2]);
                respuesta4.setText(respuestasTest12menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
        }
    }

    public void inhabilitarBotonestest(final Button respuesta1,final Button respuesta2,final Button respuesta3,final Button respuesta4)
    {
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
    public void konprobatuGozoGozoa(View view)
    {
        final String[] correct={"SAGARRA","OGIA","ESNEA","AZUKREA","ARROZA","GATZA","HARAGIA","ARRAINA","GAZTA","TXOKOLATEA","GOZOKIAK","AZENARIOA"};
        Toast toast =Toast.makeText(this,R.string.test_opcion_correcta,Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        Button res1=(Button)findViewById(R.id.gozogozoa_aukera1);
        Button res2=(Button)findViewById(R.id.gozogozoa_aukera2);
        Button res3=(Button)findViewById(R.id.gozogozoa_aukera3);
        Button res4=(Button)findViewById(R.id.gozogozoa_aukera4);

        if(clickado==1 && res1.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaGozoGoza++;
        }
        else if(clickado==2 && res2.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaGozoGoza++;
        }
        else if(clickado==3 && res3.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaGozoGoza++;
        }
        else if(clickado==4 && res4.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaGozoGoza++;
        }
        else
        {
            Toast toastIncorrecto=Toast.makeText(this,R.string.test_opcion_incorrecta,Toast.LENGTH_SHORT);
            toastIncorrecto.show();
            //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            //toast.getView().setBackgroundColor(Color.DKGRAY);
        }
        findViewById(R.id.footer).setVisibility(View.VISIBLE);
        TextView emaitzak=(TextView)findViewById(R.id.emaitzak_gozoGozoa);
        emaitzak.setText("LORTUTAKO PUNTUAK: " + puntuazioaGozoGoza + "/12");

        if(numeroTestActual==11)
        {
            findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.GONE);
            findViewById(R.id.button_gorde_GozoGozoa).setVisibility(View.VISIBLE);
        }else
        {
            findViewById(R.id.button_konprobatu_GozoGozoa).setVisibility(View.INVISIBLE);
            numeroTestActual++;
            res1.setEnabled(true);
            res2.setEnabled(true);
            res3.setEnabled(true);
            res4.setEnabled(true);
            cargarTest(testsAleatorios);
        }
    }
}
