package com.yareliventura.tvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yareli on 14/08/2015.
 */
public class RealityShows extends AppCompatActivity {

    ListView ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reality);

        EstructuraListview estructura_datos [] = new EstructuraListview[]{
                new EstructuraListview(R.mipmap.ic_tv, "R1"),
                new EstructuraListview(R.mipmap.ic_tv, "R2"),
                new EstructuraListview(R.mipmap.ic_tv, "R3"),
                new EstructuraListview(R.mipmap.ic_tv, "R4")


        };

        Adaptador adaptador = new Adaptador(this, R.layout.renglon, estructura_datos);
        ls = (ListView) findViewById(R.id.listView);
        ls.setAdapter(adaptador);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                TextView v = (TextView) arg1.findViewById(R.id.txt_Nombre);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), Actualizacion.class);
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}