package com.example.a32_cristophersic_vb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    Context contexto;
    String [] aplicaciones;
    int [] imagenes;

    private static LayoutInflater inflater=null;
    public Adaptador(Context contexto, String [] aplicacion, int [] img){
        this.contexto=contexto;
        this.aplicaciones=aplicacion;
        this.imagenes=img;

        inflater= (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = inflater.inflate(R.layout.plantilla, null);

        TextView txtNombre = (TextView) vista.findViewById(R.id.txtNombre);
        ImageView imgIcono = (ImageView) vista.findViewById(R.id.imgIcono);

        txtNombre.setText(aplicaciones[i]);
        imgIcono.setImageResource(imagenes[i]);
        return vista;
    }

    @Override
    public int getCount() {
        return imagenes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
