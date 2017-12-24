package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import java.util.Random;

public class ZerdiozuActivity extends AppCompatActivity {

    String[] columnaCastellano={"PERDÓN","HOLA","¿QUÉ HORA ES?","GRACIAS","ME DAS...","ADIOS","BUENOS DÍAS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zerdiozu);

        String[] columnaCastellanoMezclada=Randomize(columnaCastellano);

        TextView erantzuna1=(TextView)findViewById(R.id.zerdiozu_erantzuna1);
        erantzuna1.setText(columnaCastellanoMezclada[0]);
        TextView erantzuna2=(TextView)findViewById(R.id.zerdiozu_erantzuna2);
        erantzuna2.setText(columnaCastellanoMezclada[1]);
        TextView erantzuna3=(TextView)findViewById(R.id.zerdiozu_erantzuna3);
        erantzuna3.setText(columnaCastellanoMezclada[2]);
        TextView erantzuna4=(TextView)findViewById(R.id.zerdiozu_erantzuna4);
        erantzuna4.setText(columnaCastellanoMezclada[3]);
        TextView erantzuna5=(TextView)findViewById(R.id.zerdiozu_erantzuna5);
        erantzuna5.setText(columnaCastellanoMezclada[4]);
        TextView erantzuna6=(TextView)findViewById(R.id.zerdiozu_erantzuna6);
        erantzuna6.setText(columnaCastellanoMezclada[5]);
        TextView erantzuna7=(TextView)findViewById(R.id.zerdiozu_erantzuna7);
        erantzuna7.setText(columnaCastellanoMezclada[6]);
    }

    public static String[] Randomize(String[] arr) {
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
}
