package com.example.prueba26_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etn;
    EditText etp;
    ListView listView;
    Adaptador adaptador;
    public ArrayList<Producto> listar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etn = (EditText) findViewById(R.id.et1);
        etp = (EditText) findViewById(R.id.et2);
        listView = (ListView) findViewById(R.id.listView);
    }

    public void grabar(View view) {

     if ((etn.length()>0 && etp.length()>0))

        {

        Producto producto = new Producto();
        Crud crud = new Crud(getApplicationContext());
        producto.setNombre(etn.getText().toString());
        producto.setPrecio(Integer.parseInt(etp.getText().toString()));
        crud.grabar(producto);
        llenarItems();
        }else Toast.makeText(this, "Ingrese todos los datos",
             Toast.LENGTH_LONG).show();
    }

    private void llenarItems() {
        Crud crud = new Crud(getApplicationContext());
        listar = crud.cargar();
        adaptador = new Adaptador(listar, MainActivity.this);
        listView.setAdapter(adaptador);
    }

}