package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import eus.ehu.egunerokoapp.tta.egunerokoapp.modelo.RestClient;

import android.graphics.PorterDuff;
import android.widget.TextView;
import android.widget.Toast;

public class BagoazActivity extends AppCompatActivity {

    RestClient restClient=new RestClient("http://u017633.ehu.eus:28080/EgunerokoApp/rest/App");
    String resultadoGETGorde;

    String[] bagoazBotonesTest1={"AUTOBUSA","TRENA","MOTORRA"};
    String[] bagoazBotonesTest2={"HEGAZKINA","ITSASONTZIA","BIZIKLETA"};
    String[] bagoazBotonesTest3={"METROA","AUTOA","TRANBIA"};
    int[] numeroTest={1,2,3};
    int numeroTestActual=0;
    int puntuazioaBagoaz=0;
    String colorBotonclickado="";
    int[] testsAleatorios=RandomizeIntArray(numeroTest);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagoaz);

        cargarTestBagoaz(testsAleatorios);
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
    public void cargarTestBagoaz(int[] testsAleatorios)
    {
        ImageView idImagenBagoaz1=findViewById(R.id.bagoazIrudia1);
        ImageView idImagenBagoaz2=findViewById(R.id.bagoazIrudia2);
        ImageView idImagenBagoaz3=findViewById(R.id.bagoazIrudia3);
        String[] botonesTest1menzclados=Randomize(bagoazBotonesTest1);
        String[] botonesTest2menzclados=Randomize(bagoazBotonesTest2);
        String[] botonesTest3menzclados=Randomize(bagoazBotonesTest3);
        final Button botoia1=findViewById(R.id.bagoazBotoi1);
        final Button botoia2=findViewById(R.id.bagoazBotoi2);
        final Button botoia3=findViewById(R.id.bagoazBotoi3);

        switch(testsAleatorios[numeroTestActual])
        {
            case 1:
                idImagenBagoaz1.setImageResource(R.drawable.motorra);
                idImagenBagoaz2.setImageResource(R.drawable.autobusa);
                idImagenBagoaz3.setImageResource(R.drawable.trena);
                botoia1.setText(botonesTest1menzclados[0]);
                botoia2.setText(botonesTest1menzclados[1]);
                botoia3.setText(botonesTest1menzclados[2]);
                enlazarColores(idImagenBagoaz1,idImagenBagoaz2,idImagenBagoaz3,botoia1,botoia2,botoia3);
                break;
            case 2:
                idImagenBagoaz1.setImageResource(R.drawable.bizikleta);
                idImagenBagoaz2.setImageResource(R.drawable.hegazkina);
                idImagenBagoaz3.setImageResource(R.drawable.itsasontzia);
                botoia1.setText(botonesTest2menzclados[0]);
                botoia2.setText(botonesTest2menzclados[1]);
                botoia3.setText(botonesTest2menzclados[2]);
                enlazarColores(idImagenBagoaz1,idImagenBagoaz2,idImagenBagoaz3,botoia1,botoia2,botoia3);
                break;
            case 3:
                idImagenBagoaz1.setImageResource(R.drawable.tranbia);
                idImagenBagoaz2.setImageResource(R.drawable.metroa);
                idImagenBagoaz3.setImageResource(R.drawable.autoa);
                botoia1.setText(botonesTest3menzclados[0]);
                botoia2.setText(botonesTest3menzclados[1]);
                botoia3.setText(botonesTest3menzclados[2]);
                enlazarColores(idImagenBagoaz1,idImagenBagoaz2,idImagenBagoaz3,botoia1,botoia2,botoia3);
                break;
        }
    }
    public void enlazarColores(final ImageView idImagenBagoaz1, final ImageView idImagenBagoaz2, final ImageView idImagenBagoaz3, final Button botoia1, final Button botoia2, final Button botoia3)
    {
        botoia1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //botoia1.setBackgroundResource(R.color.colorAccent);
                botoia1.setBackgroundColor(Color.RED);
                botoia1.setTextColor(Color.WHITE);
                colorBotonclickado="";
                colorBotonclickado="rojo";
            }

        });
        botoia2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //botoia2.setBackgroundResource(R.color.colorPrimary);
                botoia2.setBackgroundColor(Color.BLUE);
                botoia2.setTextColor(Color.WHITE);
                colorBotonclickado="";
                colorBotonclickado="azul";
            }

        });
        botoia3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //botoia3.setBackgroundResource(R.color.green);
                botoia3.setBackgroundColor(Color.GREEN);
                botoia3.setTextColor(Color.WHITE);
                colorBotonclickado="";
                colorBotonclickado="verde";
            }

        });

        idImagenBagoaz1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (colorBotonclickado)
                {
                    case "rojo":
                        idImagenBagoaz1.setBackgroundColor(Color.RED);
                        //idImagenBagoaz1.setColorFilter(Color.RED,PorterDuff.Mode.LIGHTEN);
                        colorBotonclickado="";
                        break;
                    case "azul":
                        idImagenBagoaz1.setBackgroundColor(Color.BLUE);
                        //idImagenBagoaz1.setColorFilter(Color.BLUE,PorterDuff.Mode.LIGHTEN);
                        colorBotonclickado="";
                        break;
                    case "verde":
                        idImagenBagoaz1.setBackgroundColor(Color.GREEN);
                        //idImagenBagoaz1.setColorFilter(Color.GREEN,PorterDuff.Mode.LIGHTEN);
                        colorBotonclickado="";
                        break;
                }
            }

        });
        idImagenBagoaz2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (colorBotonclickado)
                {
                    case "rojo":
                        //idImagenBagoaz2.setColorFilter(Color.RED,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz2.setBackgroundColor(Color.RED);
                        colorBotonclickado="";
                        break;
                    case "azul":
                        //idImagenBagoaz2.setColorFilter(Color.BLUE,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz2.setBackgroundColor(Color.BLUE);
                        colorBotonclickado="";
                        break;
                    case "verde":
                        //idImagenBagoaz2.setColorFilter(Color.GREEN,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz2.setBackgroundColor(Color.GREEN);
                        colorBotonclickado="";
                        break;
                }
            }

        });
        idImagenBagoaz3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (colorBotonclickado)
                {
                    case "rojo":
                        //idImagenBagoaz3.setColorFilter(Color.RED,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz3.setBackgroundColor(Color.RED);
                        colorBotonclickado="";
                        break;
                    case "azul":
                        //idImagenBagoaz3.setColorFilter(Color.BLUE,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz3.setBackgroundColor(Color.BLUE);
                        colorBotonclickado="";
                        break;
                    case "verde":
                        //idImagenBagoaz3.setColorFilter(Color.GREEN,PorterDuff.Mode.LIGHTEN);
                        idImagenBagoaz3.setBackgroundColor(Color.GREEN);
                        colorBotonclickado="";
                        break;
                }
            }

        });
    }
    public void konprobatuBagoaz(View view)
    {
        ImageView idImagenBagoaz1=findViewById(R.id.bagoazIrudia1);
        ImageView idImagenBagoaz2=findViewById(R.id.bagoazIrudia2);
        ImageView idImagenBagoaz3=findViewById(R.id.bagoazIrudia3);
        final Button botoia1=findViewById(R.id.bagoazBotoi1);
        final Button botoia2=findViewById(R.id.bagoazBotoi2);
        final Button botoia3=findViewById(R.id.bagoazBotoi3);
        String botoi1testua= (String) botoia1.getText();
        String botoi2testua= (String) botoia2.getText();
        String botoi3testua= (String) botoia3.getText();

        ColorDrawable irudia1kolorea=(ColorDrawable) idImagenBagoaz1.getBackground();
        int colorIdImagen1=irudia1kolorea.getColor();
        ColorDrawable irudia2kolorea=(ColorDrawable) idImagenBagoaz2.getBackground();
        int colorIdImagen2=irudia2kolorea.getColor();
        ColorDrawable irudia3kolorea=(ColorDrawable) idImagenBagoaz3.getBackground();
        int colorIdImagen3=irudia3kolorea.getColor();

        switch(botoi1testua)
        {
            case "MOTORRA":
                if(colorIdImagen1==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOBUSA":
                if(colorIdImagen2==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRENA":
                if(colorIdImagen3==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "BIZIKLETA":
                if(colorIdImagen1==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "HEGAZKINA":
                if(colorIdImagen2==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "ITSASONTZIA":
                if(colorIdImagen3==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "METROA":
                if(colorIdImagen1==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOA":
                if(colorIdImagen2==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRANBIA":
                if(colorIdImagen3==Color.RED)
                {
                    puntuazioaBagoaz++;
                }
                break;
        }
        switch(botoi2testua)
        {
            case "MOTORRA":
                if(colorIdImagen1==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOBUSA":
                if(colorIdImagen2==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRENA":
                if(colorIdImagen3==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "BIZIKLETA":
                if(colorIdImagen1==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "HEGAZKINA":
                if(colorIdImagen2==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "ITSASONTZIA":
                if(colorIdImagen3==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "METROA":
                if(colorIdImagen1==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOA":
                if(colorIdImagen2==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRANBIA":
                if(colorIdImagen3==Color.BLUE)
                {
                    puntuazioaBagoaz++;
                }
                break;
        }
        switch(botoi3testua)
        {
            case "MOTORRA":
                if(colorIdImagen1==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOBUSA":
                if(colorIdImagen2==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRENA":
                if(colorIdImagen3==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "BIZIKLETA":
                if(colorIdImagen1==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "HEGAZKINA":
                if(colorIdImagen2==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "ITSASONTZIA":
                if(colorIdImagen3==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "METROA":
                if(colorIdImagen1==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "AUTOA":
                if(colorIdImagen2==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
            case "TRANBIA":
                if(colorIdImagen3==Color.GREEN)
                {
                    puntuazioaBagoaz++;
                }
                break;
        }
        findViewById(R.id.footerBagoaz).setVisibility(View.VISIBLE);
        TextView emaitzak=(TextView)findViewById(R.id.emaitzak_bagoaz);
        emaitzak.setText("LORTUTAKO PUNTUAK: " + puntuazioaBagoaz + "/9");
        if(numeroTestActual==2)
        {
            findViewById(R.id.button_bagoaz_konprobatu).setVisibility(View.GONE);
            findViewById(R.id.button_bagoaz_gorde).setVisibility(View.VISIBLE);
        }else
        {
            numeroTestActual++;
            idImagenBagoaz1.setBackgroundColor(Color.TRANSPARENT);
            idImagenBagoaz2.setBackgroundColor(Color.TRANSPARENT);
            idImagenBagoaz3.setBackgroundColor(Color.TRANSPARENT);
            botoia1.setBackgroundColor(Color.LTGRAY);
            botoia2.setBackgroundColor(Color.LTGRAY);
            botoia3.setBackgroundColor(Color.LTGRAY);
            botoia1.setTextColor(Color.BLACK);
            botoia2.setTextColor(Color.BLACK);
            botoia3.setTextColor(Color.BLACK);
            cargarTestBagoaz(testsAleatorios);
        }
    }
    public void gorde(View view)
    {
        final SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        final String login=prefs.getString("login","");

        new AsyncTask<Void,Void,Void>()
        {
            @Override
            protected Void doInBackground(Void... voids)
            {
                try{
                    //restClient.setHttpBasicAuth(dni,passwd);
                    resultadoGETGorde=restClient.getString(String.format("gorde?login=%s",login+"&puntos="+puntuazioaBagoaz+"&nombre=bagoaz"));
                    //} catch (JSONException e) {
                    //e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String ok=resultadoGETGorde;

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid)
            {
                if(resultadoGETGorde.matches("GORDETA"))
                {
                    Toast.makeText(getApplicationContext(),R.string.gordeta,Toast.LENGTH_LONG).show();
                    int size = prefs.getInt("arrayBagoazPuntuazioa" + "_size", 0);
                    size++;
                    SharedPreferences.Editor editor=prefs.edit();

                    String correctasBagoazString=Integer.toString(puntuazioaBagoaz);

                    String[] puntuazioaBagoazArray=new String[size];
                    String[] orduaBagoazArray=new String[size];
                    String[] dataBagoazArray=new String[size];

                    Date date = new Date();
                    DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
                    String ordua=hourFormat.format(date);
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String data=dateFormat.format(date);

                    for(int i=0;i<size;i++)
                    {
                        puntuazioaBagoazArray[i] = prefs.getString("arrayBagoazPuntuazioa" + "_" + i, "");
                        orduaBagoazArray[i] = prefs.getString("arrayBagoazOrdua" + "_" + i, "");
                        dataBagoazArray[i] = prefs.getString("arrayBagoazData" + "_" + i, "");
                        if(puntuazioaBagoazArray[0]=="")
                        {
                            puntuazioaBagoazArray[0]=correctasBagoazString;
                            orduaBagoazArray[0]=ordua;
                            dataBagoazArray[0]=data;
                        }else
                        {
                            //Toast.makeText(this,Integer.toString(size),Toast.LENGTH_SHORT).show();
                            puntuazioaBagoazArray[size-1]=correctasBagoazString;
                            orduaBagoazArray[size-1]=ordua;
                            dataBagoazArray[size-1]=data;
                        }
                    }

                    editor.putInt("arrayBagoazPuntuazioa" +"_size", puntuazioaBagoazArray.length);
                    for(int i=0;i<puntuazioaBagoazArray.length;i++)
                    {
                        editor.putString("arrayBagoazPuntuazioa" + "_" + i, puntuazioaBagoazArray[i]);
                        editor.putString("arrayBagoazOrdua" + "_" + i, orduaBagoazArray[i]);
                        editor.putString("arrayBagoazData" + "_" + i, dataBagoazArray[i]);
                    }
                    editor.commit();

                }else
                {
                    Toast.makeText(getApplicationContext(),R.string.gordeEz,Toast.LENGTH_LONG).show();
                }
            }
        }.execute();
    }
}
