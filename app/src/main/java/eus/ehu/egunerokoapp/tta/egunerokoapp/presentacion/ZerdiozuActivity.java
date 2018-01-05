package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import android.view.View;;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;

public class ZerdiozuActivity extends AppCompatActivity {

    String[] columnaCastellano={"PERDÓN","HOLA","¿QUÉ HORA ES?","GRACIAS","ME DAS...","ADIÓS","BUENOS DÍAS"};
    String[] columnaCastellanoMezclada=Randomize(columnaCastellano);
    int correctas=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zerdiozu);

        TextView erantzuna1=findViewById(R.id.zerdiozu_erantzuna1);
        erantzuna1.setText(columnaCastellanoMezclada[0]);
        TextView erantzuna2=findViewById(R.id.zerdiozu_erantzuna2);
        erantzuna2.setText(columnaCastellanoMezclada[1]);
        TextView erantzuna3=findViewById(R.id.zerdiozu_erantzuna3);
        erantzuna3.setText(columnaCastellanoMezclada[2]);
        TextView erantzuna4=findViewById(R.id.zerdiozu_erantzuna4);
        erantzuna4.setText(columnaCastellanoMezclada[3]);
        TextView erantzuna5=findViewById(R.id.zerdiozu_erantzuna5);
        erantzuna5.setText(columnaCastellanoMezclada[4]);
        TextView erantzuna6=findViewById(R.id.zerdiozu_erantzuna6);
        erantzuna6.setText(columnaCastellanoMezclada[5]);
        TextView erantzuna7=findViewById(R.id.zerdiozu_erantzuna7);
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

    public void konprobatuZerDiozu(View view)
    {
        String zen1=((EditText)findViewById(R.id.zenbakia1)).getText().toString();
        String zen2=((EditText)findViewById(R.id.zenbakia2)).getText().toString();
        String zen3=((EditText)findViewById(R.id.zenbakia3)).getText().toString();
        String zen4=((EditText)findViewById(R.id.zenbakia4)).getText().toString();
        String zen5=((EditText)findViewById(R.id.zenbakia5)).getText().toString();
        String zen6=((EditText)findViewById(R.id.zenbakia6)).getText().toString();
        String zen7=((EditText)findViewById(R.id.zenbakia7)).getText().toString();

        if(zen1.matches("") || zen2.matches("") || zen3.matches("") || zen4.matches("") || zen5.matches("") || zen6.matches("") || zen7.matches(""))
        {
            Toast.makeText(this,R.string.eremuak_beteta,Toast.LENGTH_LONG).show();
        }else
        {
            switch(columnaCastellanoMezclada[0])
            {
                case "PERDÓN":
                    if(zen1.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen1.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen1.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen1.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen1.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen1.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen1.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia1)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia1)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[1])
            {
                case "PERDÓN":
                    if(zen2.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen2.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen2.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen2.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen2.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen2.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen2.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia2)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia2)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[2])
            {
                case "PERDÓN":
                    if(zen3.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen3.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen3.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen3.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen3.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen3.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen3.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia3)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia3)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[3])
            {
                case "PERDÓN":
                    if(zen4.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen4.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen4.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen4.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen4.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen4.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen4.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia4)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia4)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[4])
            {
                case "PERDÓN":
                    if(zen5.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen5.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen5.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen5.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen5.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen5.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen5.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia5)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia5)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[5])
            {
                case "PERDÓN":
                    if(zen6.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen6.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen6.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen6.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen6.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen6.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen6.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia6)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia6)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            switch(columnaCastellanoMezclada[6])
            {
                case "PERDÓN":
                    if(zen7.matches("4"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "HOLA":
                    if(zen7.matches("2"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "¿QUÉ HORA ES?":
                    if(zen7.matches("7"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "GRACIAS":
                    if(zen7.matches("1"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ME DAS...":
                    if(zen7.matches("6"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "ADIÓS":
                    if(zen7.matches("3"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;

                case "BUENOS DÍAS":
                    if(zen7.matches("5"))
                    {
                        correctas++;
                    }
                    else
                    {
                        (findViewById(R.id.zenbakia7)).setBackgroundColor(Color.RED);
                        ((EditText)findViewById(R.id.zenbakia7)).setTextColor(Color.WHITE);
                    }
                    break;
            }
            findViewById(R.id.button_zerdiozu_konprobatu).setVisibility(View.GONE);
            findViewById(R.id.button_zerdiozu_gorde).setVisibility(View.VISIBLE);
            findViewById(R.id.footerZerDiozu).setVisibility(View.VISIBLE);
            TextView emaitzak=(TextView)findViewById(R.id.emaitzak_zerDiozu);
            emaitzak.setText("LORTUTAKO PUNTUAK: " + correctas + "/7");
        }
    }
    public void gorde(View view)
    {
        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        int size = prefs.getInt("arrayZerDiozuPuntuazioa" + "_size", 0);
        SharedPreferences.Editor editor=prefs.edit();
        size++;
        String correctasZerDiozuString=Integer.toString(correctas);

        String[] puntuazioaZerDiozu=new String[size];
        String[] orduaZerDiozu=new String[size];
        String[] dataZerDiozu=new String[size];

        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String ordua=hourFormat.format(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String data=dateFormat.format(date);

        for(int i=0;i<size;i++)
        {
            puntuazioaZerDiozu[i] = prefs.getString("arrayZerDiozuPuntuazioa" + "_" + i, "");
            orduaZerDiozu[i] = prefs.getString("arrayZerDiozuOrdua" + "_" + i, "");
            dataZerDiozu[i] = prefs.getString("arrayZerDiozuData" + "_" + i, "");
            if(puntuazioaZerDiozu[0]=="")
            {
                puntuazioaZerDiozu[0]=correctasZerDiozuString;
                orduaZerDiozu[0]=ordua;
                dataZerDiozu[0]=data;
            }else
            {
                //Toast.makeText(this,Integer.toString(size),Toast.LENGTH_SHORT).show();
                puntuazioaZerDiozu[size-1]=correctasZerDiozuString;
                orduaZerDiozu[size-1]=ordua;
                dataZerDiozu[size-1]=data;
            }
        }

        editor.putInt("arrayZerDiozuPuntuazioa" +"_size", puntuazioaZerDiozu.length);
        for(int i=0;i<puntuazioaZerDiozu.length;i++)
        {
            editor.putString("arrayZerDiozuPuntuazioa" + "_" + i, puntuazioaZerDiozu[i]);
            editor.putString("arrayZerDiozuOrdua" + "_" + i, orduaZerDiozu[i]);
            editor.putString("arrayZerDiozuData" + "_" + i, dataZerDiozu[i]);
        }
        //editor.commit();
        //editor.putString("orduaZerDiozu",ordua);
        //editor.putString("dataZerDiozu",data);
        editor.commit();
    }
}
