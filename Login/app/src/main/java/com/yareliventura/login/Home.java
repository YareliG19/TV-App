package com.yareliventura.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * Created by Yareli on 14/07/2015.
 */
public class Home extends AppCompatActivity {

    Toolbar toolbar;
    EditText edt_correo;
    EditText edt_usuario;
    EditText edt_pw;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edt_correo= (EditText) findViewById(R.id.correo);
        edt_usuario = (EditText) findViewById(R.id.usuario);
        edt_pw = (EditText) findViewById(R.id.contrasena);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {

            String em = (String) bundle.get("Correo");
            edt_correo.setText(em);

            String user = (String) bundle.get("Usuario");
            edt_usuario.setText(user);

            String pw = (String) bundle.get("Contrasena");
            edt_pw.setText(pw);

        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    @Override
||||||||||
    public boolean onOptionalItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

}
