package com.yareliventura.login;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Yareli on 14/07/2015.
 */
public class FormActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;

    @Bind(R.id.usuario)
    EditText Usuario;

    @Bind (R.id.correo)
    EditText Correo;

    @Bind (R.id.contrasena)
    EditText Contrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }
    @OnClick (R.id.btn_acount)


    public void OnClick(View view) {
        Intent intent = new Intent(this, Home.class);
        String correo = Correo.getText().toString();
        String usuario = Usuario.getText().toString();
        String contrasena = Contrasena.getText().toString();


        intent.putExtra("Correo", correo);
        intent.putExtra("Usuario", usuario);
        intent.putExtra("Contrasena", contrasena);

        startActivity(intent);
    }


    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //getMenuInflater().inflate(R.menu.menu_form_activity,menu);
        return true;
    }

    public void onOptionalItemSelected(MenuItem item) {
        int id = item.getItemId();


    }
}



