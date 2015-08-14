package com.yareliventura.tvapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.ConnectException;

/**
 * Created by Yareli on 08/08/2015.
 */
public class Adaptador extends ArrayAdapter <EstructuraListview> {
    Context context;
    int layoutResourceId;
    EstructuraListview datos [] =null;

    public Adaptador (Context context, int layoutResourceId, EstructuraListview[] datos) {
        super(context, layoutResourceId, datos);

        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.datos = datos;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View renglon = convertView;
        EstructuraHolder holder = null;
        if (renglon == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            renglon = inflater.inflate(layoutResourceId, parent, false);

            holder = new EstructuraHolder();
            holder.imagen = (ImageView) renglon.findViewById(R.id.img_icono);
            holder.nombre = (TextView) renglon.findViewById(R.id.txt_Nombre);
            renglon.setTag(holder);
        } else {
            holder = (EstructuraHolder) renglon.getTag();
        }
        EstructuraListview estructuraListview = datos[position];
        holder.nombre.setText(estructuraListview.nombre);
        holder.imagen.setImageResource(estructuraListview.imagen);

        return renglon;
    }

                static class EstructuraHolder {
                    ImageView imagen;
                    TextView nombre;


    }
}


