package com.yareliventura.tvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Yareli on 08/08/2015.
 */

public class Categorias extends AppCompatActivity {

    private TextView txtBienvenida;

    Toolbar toolbar;
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        txtBienvenida = (TextView)findViewById(R.id.TxtBienvedida);
        Bundle bundle = this.getIntent().getExtras();
        txtBienvenida.setText("Bienvenid@ "  + bundle.getString( "USUARIO"));



        EstructuraListview estructura_datos[] = new EstructuraListview[]{
                new EstructuraListview(R.mipmap.ic_tv, "Series"),
                new EstructuraListview(R.mipmap.ic_tv, "TV Shows"),
                new EstructuraListview(R.mipmap.ic_tv, "Reality Shows"),
                new EstructuraListview(R.mipmap.ic_tv, "Peliculas")

        };

        Adaptador adaptador = new Adaptador(this, R.layout.renglon, estructura_datos);
        ls = (ListView) findViewById(R.id.listView);
        ls.setAdapter(adaptador);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                TextView v = (TextView) arg1.findViewById(R.id.txt_Nombre);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();


                Intent i = new Intent(getApplicationContext(), TVShows.class);
                startActivity(i);


            }
        });

    }

    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
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

