package com.example.prueba26_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private ArrayList<Producto> arrayprod;
    private Context context;
    private LayoutInflater inflador;

    public Adaptador(ArrayList<Producto> arrayprod, Context context) {
        this.arrayprod = arrayprod;
        this.context = context;

    }

    @Override
    public int getCount() {
        return arrayprod.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayprod.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Producto entidad = (Producto) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.producto, null);

        TextView textview = (TextView) convertView.findViewById(R.id.textView);
        TextView textview2 = (TextView) convertView.findViewById(R.id.textView2);
        textview.setText(entidad.getNombre());
        int precio;
        precio = entidad.getPrecio();
        String precio1;
        precio1 = String.valueOf(precio);
        textview2.setText(precio1);
        return convertView;
    };


}



