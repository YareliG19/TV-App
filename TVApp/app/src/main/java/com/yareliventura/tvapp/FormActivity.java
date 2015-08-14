package com.yareliventura.tvapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Yareli on 09/08/2015.
 */
public class FormActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;

    private EditText edt_usuario;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);

        edt_usuario = (EditText)findViewById(R.id.usuario);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);


    btnIngresar.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent i = new Intent(FormActivity.this, Categorias.class);

            Bundle b = new Bundle();
            b.putString("USUARIO", edt_usuario.getText().toString());

            i.putExtras(b);

            startActivity(i);
        }
    });
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

