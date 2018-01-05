package eus.ehu.egunerokoapp.tta.egunerokoapp.presentacion;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import eus.ehu.egunerokoapp.tta.egunerokoapp.R;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PuntuazioaActivity extends AppCompatActivity {

    //private final static String PUNTUAZIOA_ZER_DIOZU="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuazioa);

        SharedPreferences prefs=getSharedPreferences("EgunerokoAppPreferences",MODE_PRIVATE);
        int size = prefs.getInt("arrayZerDiozuPuntuazioa" + "_size", 0);
        int size2 = prefs.getInt("arrayBagoazPuntuazioa" + "_size", 0);
        int size3 = prefs.getInt("arrayGozoGozoaPuntuazioa" + "_size", 0);
        int size4 = prefs.getInt("arrayEkintzakPuntuazioa" + "_size", 0);

        String login=prefs.getString("login","");

        String arrayZerDiozu[] = new String[size];
        String orduaZerDiozu[] = new String[size];
        String dataZerDiozu[] = new String[size];
        for(int i=0;i<size;i++)
        {
            arrayZerDiozu[i] = prefs.getString("arrayZerDiozuPuntuazioa" + "_" + i, null);
            orduaZerDiozu[i] = prefs.getString("arrayZerDiozuOrdua" + "_" + i, null);
            dataZerDiozu[i] = prefs.getString("arrayZerDiozuData" + "_" + i, null);
        }

        String arrayBagoaz[] = new String[size2];
        String orduaBagoaz[] = new String[size2];
        String dataBagoaz[] = new String[size2];
        for(int i=0;i<size2;i++)
        {
            arrayBagoaz[i] = prefs.getString("arrayBagoazPuntuazioa" + "_" + i, null);
            orduaBagoaz[i] = prefs.getString("arrayBagoazOrdua" + "_" + i, null);
            dataBagoaz[i] = prefs.getString("arrayBagoazData" + "_" + i, null);
        }

        String arrayGozoGozoa[] = new String[size3];
        String orduaGozoGozoa[] = new String[size3];
        String dataGozoGozoa[] = new String[size3];
        for(int i=0;i<size3;i++)
        {
            arrayGozoGozoa[i] = prefs.getString("arrayGozoGozoaPuntuazioa" + "_" + i, null);
            orduaGozoGozoa[i] = prefs.getString("arrayGozoGozoaOrdua" + "_" + i, null);
            dataGozoGozoa[i] = prefs.getString("arrayGozoGozoaData" + "_" + i, null);
        }

        String arrayEkintzak[] = new String[size4];
        String orduaEkintzak[] = new String[size4];
        String dataEkintzak[] = new String[size4];
        for(int i=0;i<size4;i++)
        {
            arrayEkintzak[i] = prefs.getString("arrayEkintzakPuntuazioa" + "_" + i, null);
            orduaEkintzak[i] = prefs.getString("arrayEkintzakOrdua" + "_" + i, null);
            dataEkintzak[i] = prefs.getString("arrayEkintzakData" + "_" + i, null);
        }

        //String puntuazioaZerDiozu = prefs.getString("ZerDiozuPuntuazioa","");
        //String arrayZerDiozu[]={""};

        if(arrayZerDiozu.length!=0)
        {
            for(int i=0;i<arrayZerDiozu.length;i++)
            {
                TableLayout tl =findViewById(R.id.tablePuntuazioa);

                TableRow tr = new TableRow(this);
                tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                TextView eguna = new TextView(this);
                eguna.setText(dataZerDiozu[i]);
                eguna.setGravity(Gravity.CENTER);
                eguna.setTextSize(10);

                TextView ordua = new TextView(this);
                ordua.setText(orduaZerDiozu[i]);
                ordua.setGravity(Gravity.CENTER);
                ordua.setTextSize(10);

                TextView erabiltzailea = new TextView(this);
                erabiltzailea.setText(login);
                erabiltzailea.setGravity(Gravity.CENTER);
                erabiltzailea.setTextSize(10);

                TextView jokua = new TextView(this);
                jokua.setText("ZER DIOZU");
                jokua.setGravity(Gravity.CENTER);
                jokua.setTextSize(10);

                TextView puntuazioa = new TextView(this);
                puntuazioa.setText(arrayZerDiozu[i]);
                puntuazioa.setGravity(Gravity.CENTER);
                puntuazioa.setTextSize(10);

                tr.addView(eguna);
                tr.addView(ordua);
                tr.addView(erabiltzailea);
                tr.addView(jokua);
                tr.addView(puntuazioa);

                tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            }
        }

        if(arrayBagoaz.length!=0)
        {
            for(int i=0;i<arrayBagoaz.length;i++)
            {
                TableLayout tl =findViewById(R.id.tablePuntuazioa);

                TableRow tr = new TableRow(this);
                tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                TextView eguna = new TextView(this);
                eguna.setText(dataBagoaz[i]);
                eguna.setGravity(Gravity.CENTER);
                eguna.setTextSize(10);

                TextView ordua = new TextView(this);
                ordua.setText(orduaBagoaz[i]);
                ordua.setGravity(Gravity.CENTER);
                ordua.setTextSize(10);

                TextView erabiltzailea = new TextView(this);
                erabiltzailea.setText(login);
                erabiltzailea.setGravity(Gravity.CENTER);
                erabiltzailea.setTextSize(10);

                TextView jokua = new TextView(this);
                jokua.setText("BAGOAZ");
                jokua.setGravity(Gravity.CENTER);
                jokua.setTextSize(10);

                TextView puntuazioa = new TextView(this);
                puntuazioa.setText(arrayBagoaz[i]);
                puntuazioa.setGravity(Gravity.CENTER);
                puntuazioa.setTextSize(10);

                tr.addView(eguna);
                tr.addView(ordua);
                tr.addView(erabiltzailea);
                tr.addView(jokua);
                tr.addView(puntuazioa);

                tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            }
        }
        if(arrayGozoGozoa.length!=0)
        {
            for(int i=0;i<arrayGozoGozoa.length;i++)
            {
                TableLayout tl =findViewById(R.id.tablePuntuazioa);

                TableRow tr = new TableRow(this);
                tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                TextView eguna = new TextView(this);
                eguna.setText(dataGozoGozoa[i]);
                eguna.setGravity(Gravity.CENTER);
                eguna.setTextSize(10);

                TextView ordua = new TextView(this);
                ordua.setText(orduaGozoGozoa[i]);
                ordua.setGravity(Gravity.CENTER);
                ordua.setTextSize(10);

                TextView erabiltzailea = new TextView(this);
                erabiltzailea.setText(login);
                erabiltzailea.setGravity(Gravity.CENTER);
                erabiltzailea.setTextSize(10);

                TextView jokua = new TextView(this);
                jokua.setText("GOZO GOZOA");
                jokua.setGravity(Gravity.CENTER);
                jokua.setTextSize(10);

                TextView puntuazioa = new TextView(this);
                puntuazioa.setText(arrayGozoGozoa[i]);
                puntuazioa.setGravity(Gravity.CENTER);
                puntuazioa.setTextSize(10);

                tr.addView(eguna);
                tr.addView(ordua);
                tr.addView(erabiltzailea);
                tr.addView(jokua);
                tr.addView(puntuazioa);

                tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            }
        }
        if(arrayEkintzak.length!=0)
        {
            for(int i=0;i<arrayEkintzak.length;i++)
            {
                TableLayout tl =findViewById(R.id.tablePuntuazioa);

                TableRow tr = new TableRow(this);
                tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                TextView eguna = new TextView(this);
                eguna.setText(dataEkintzak[i]);
                eguna.setGravity(Gravity.CENTER);
                eguna.setTextSize(10);

                TextView ordua = new TextView(this);
                ordua.setText(orduaEkintzak[i]);
                ordua.setGravity(Gravity.CENTER);
                ordua.setTextSize(10);

                TextView erabiltzailea = new TextView(this);
                erabiltzailea.setText(login);
                erabiltzailea.setGravity(Gravity.CENTER);
                erabiltzailea.setTextSize(10);

                TextView jokua = new TextView(this);
                jokua.setText("JOLASTEKO EKINTZAK");
                jokua.setGravity(Gravity.CENTER);
                jokua.setTextSize(10);

                TextView puntuazioa = new TextView(this);
                puntuazioa.setText(arrayEkintzak[i]);
                puntuazioa.setGravity(Gravity.CENTER);
                puntuazioa.setTextSize(10);

                tr.addView(eguna);
                tr.addView(ordua);
                tr.addView(erabiltzailea);
                tr.addView(jokua);
                tr.addView(puntuazioa);

                tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            }
        }
    }
}
