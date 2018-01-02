package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import android.widget.VideoView;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

public class EkintzakActivity extends AppCompatActivity {

    String[] respuestasTest1={"KORRIKA EGIN","BORROKATU","SALTO EGIN","DANTZATU"};//BORROKATU
    String[] respuestasTest2={"BORROKATU","JOLASTU","SALTO EGIN","OIHUKATU"};//SALTOKA
    String[] respuestasTest3={"KORRIKA EGIN","HITZ EGIN","SALTO EGIN","OIHUKATU"};//KORRIKA
    String[] respuestasTest4={"DANTZATU","JOLASTU","KULUNTZATU","HITZ EGIN"};//JOLASTU
    String[] respuestasTest5={"OIHUKATU","JOLASTU","DANTZATU","JOLASTU"};//DANTZATU
    String[] respuestasTest6={"SALTO EGIN","JOLASTU","KULUNKATU","HITZ EGIN"};//KULUNKATU
    String[] respuestasTest7={"BORROKATU","HITZ EGIN","DANTZATU","JOLASTU"};//HITZ EGIN
    String[] respuestasTest8={"JOLASTU","KULUNKATU","DANTZATU","OIHUKATU"};//OIHUKATU
    int clickado=0;
    int[] numeroTest={1,2,3,4,5,6,7,8};
    int numeroTestActual=0;
    int puntuazioaEkintzak=0;
    int[] testsAleatorios=RandomizeIntArray(numeroTest);
    String videoURLBorrokatu = "https://dl.dropboxusercontent.com/s/5hshb7mrhma7y1p/Borrokatu.mp4";
    String videoURLDantzatu="https://dl.dropboxusercontent.com/s/fxclivmy3t1zans/Dantzatu.mp4";
    String videoURLHitzEgin="https://dl.dropboxusercontent.com/s/3n41mk7d91tfijo/HitzEgin.mp4";
    String videoURLJolastu="https://dl.dropboxusercontent.com/s/kh2u6j6fml4c93w/Jolastu.mp4";
    String videoURLKorrika="https://dl.dropboxusercontent.com/s/7v4hrgdg5jgj2q0/Korrika.mp4";
    String videoURLkulunkatu="https://dl.dropboxusercontent.com/s/xq5f763umqay407/Kulunkatu.mp4";
    String videoURLOihukatu="https://dl.dropboxusercontent.com/s/rihw0mjbetttcqa/Oihukatu.mp4";
    String videoURLSaltoka="https://dl.dropboxusercontent.com/s/ndpwurr7js6ador/Saltoka.mp4";

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekintzak);

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
        String[] respuestasTest1menzcladas=Randomize(respuestasTest1);
        String[] respuestasTest2menzcladas=Randomize(respuestasTest2);
        String[] respuestasTest3menzcladas=Randomize(respuestasTest3);
        String[] respuestasTest4menzcladas=Randomize(respuestasTest4);
        String[] respuestasTest5menzcladas=Randomize(respuestasTest5);
        String[] respuestasTest6menzcladas=Randomize(respuestasTest6);
        String[] respuestasTest7menzcladas=Randomize(respuestasTest7);
        String[] respuestasTest8menzcladas=Randomize(respuestasTest8);
        final Button respuesta1=findViewById(R.id.ekintzak_aukera1);
        final Button respuesta2=findViewById(R.id.ekintzak_aukera2);
        final Button respuesta3=findViewById(R.id.ekintzak_aukera3);
        final Button respuesta4=findViewById(R.id.ekintzak_aukera4);

        switch(testsAleatorios[numeroTestActual])
        {
            case 1:
                showVideo(videoURLBorrokatu);
                respuesta1.setText(respuestasTest1menzcladas[0]);
                respuesta2.setText(respuestasTest1menzcladas[1]);
                respuesta3.setText(respuestasTest1menzcladas[2]);
                respuesta4.setText(respuestasTest1menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 2:
                showVideo(videoURLSaltoka);
                respuesta1.setText(respuestasTest2menzcladas[0]);
                respuesta2.setText(respuestasTest2menzcladas[1]);
                respuesta3.setText(respuestasTest2menzcladas[2]);
                respuesta4.setText(respuestasTest2menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 3:
                showVideo(videoURLKorrika);
                respuesta1.setText(respuestasTest3menzcladas[0]);
                respuesta2.setText(respuestasTest3menzcladas[1]);
                respuesta3.setText(respuestasTest3menzcladas[2]);
                respuesta4.setText(respuestasTest3menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 4:
                showVideo(videoURLJolastu);
                respuesta1.setText(respuestasTest4menzcladas[0]);
                respuesta2.setText(respuestasTest4menzcladas[1]);
                respuesta3.setText(respuestasTest4menzcladas[2]);
                respuesta4.setText(respuestasTest4menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 5:
                showVideo(videoURLDantzatu);
                respuesta1.setText(respuestasTest5menzcladas[0]);
                respuesta2.setText(respuestasTest5menzcladas[1]);
                respuesta3.setText(respuestasTest5menzcladas[2]);
                respuesta4.setText(respuestasTest5menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 6:
                showVideo(videoURLkulunkatu);
                respuesta1.setText(respuestasTest6menzcladas[0]);
                respuesta2.setText(respuestasTest6menzcladas[1]);
                respuesta3.setText(respuestasTest6menzcladas[2]);
                respuesta4.setText(respuestasTest6menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 7:
                showVideo(videoURLHitzEgin);
                respuesta1.setText(respuestasTest7menzcladas[0]);
                respuesta2.setText(respuestasTest7menzcladas[1]);
                respuesta3.setText(respuestasTest7menzcladas[2]);
                respuesta4.setText(respuestasTest7menzcladas[3]);
                inhabilitarBotonestest(respuesta1,respuesta2,respuesta3,respuesta4);
                break;
            case 8:
                showVideo(videoURLOihukatu);
                respuesta1.setText(respuestasTest8menzcladas[0]);
                respuesta2.setText(respuestasTest8menzcladas[1]);
                respuesta3.setText(respuestasTest8menzcladas[2]);
                respuesta4.setText(respuestasTest8menzcladas[3]);
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
                findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.VISIBLE);
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
                findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.VISIBLE);
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
                findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.VISIBLE);
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
                findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.VISIBLE);
            }

        });
    }
    public void konprobatuEkintzak(View view)
    {
        final String[] correct={"BORROKATU","SALTO EGIN","KORRIKA EGIN","JOLASTU","DANTZATU","KULUNKATU","HITZ EGIN","OIHUKATU"};
        Toast toast =Toast.makeText(this,R.string.test_opcion_correcta,Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        Button res1=findViewById(R.id.ekintzak_aukera1);
        Button res2=findViewById(R.id.ekintzak_aukera2);
        Button res3=findViewById(R.id.ekintzak_aukera3);
        Button res4=findViewById(R.id.ekintzak_aukera4);

        if(clickado==1 && res1.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaEkintzak++;
        }
        else if(clickado==2 && res2.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaEkintzak++;
        }
        else if(clickado==3 && res3.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaEkintzak++;
        }
        else if(clickado==4 && res4.getText()==correct[testsAleatorios[numeroTestActual]-1])
        {
            toast.show();
            clickado=0;
            puntuazioaEkintzak++;
        }
        else
        {
            Toast toastIncorrecto=Toast.makeText(this,R.string.test_opcion_incorrecta,Toast.LENGTH_SHORT);
            toastIncorrecto.show();
            //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            //toast.getView().setBackgroundColor(Color.DKGRAY);
        }
        findViewById(R.id.footer_ekintzak).setVisibility(View.VISIBLE);
        TextView emaitzak=(TextView)findViewById(R.id.emaitzak_ekintzak);
        emaitzak.setText("LORTUTAKO PUNTUAK: " + puntuazioaEkintzak + "/8");

        if(numeroTestActual==7)
        {
            findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.GONE);
            findViewById(R.id.button_gorde_ekintzak).setVisibility(View.VISIBLE);
        }else
        {
            findViewById(R.id.button_konprobatu_ekintzak).setVisibility(View.INVISIBLE);
            numeroTestActual++;
            res1.setEnabled(true);
            res2.setEnabled(true);
            res3.setEnabled(true);
            res4.setEnabled(true);
            cargarTest(testsAleatorios);
        }
    }
    private void showVideo(String advise)
    {
        final VideoView video=(VideoView)findViewById(R.id.video_ekintzak);
        video.setVideoURI(Uri.parse(advise));

        final MediaController controller=new MediaController(this)
        {
            /*@Override
            public void hide()
            {

            }*/

            @Override
            public boolean dispatchKeyEvent(KeyEvent event)
            {
                if(event.getKeyCode()==KeyEvent.KEYCODE_BACK)
                {
                    finish();

                }
                return super.dispatchKeyEvent(event);
            }
        };
        controller.setAnchorView(video);
        video.setMediaController(controller);

        video.setOnPreparedListener(new OnPreparedListener()
        {

            public void onPrepared(MediaPlayer mediaPlayer)
            {
                video.seekTo(position);
                if (position == 0) {
                    video.start();
                }

                // When video Screen change size.
                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {

                        // Re-Set the videoView that acts as the anchor for the MediaController
                        controller.setAnchorView(video);
                    }
                });
            }
        });
        //video.start();
    }
}
