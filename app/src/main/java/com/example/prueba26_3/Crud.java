package com.example.prueba26_3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Crud {
    private BBDD Bdatos;
    private SQLiteDatabase db;
    private ContentValues values = new ContentValues();

    public Crud(Context context) {
        Bdatos = new BBDD(context);
    }



    public void grabar(Producto P) {
        db = Bdatos.getWritableDatabase();
        values.clear();
        values.put(BBDD.NOMBRE, P.getNombre());
        values.put(BBDD.PRECIO, P.getPrecio());
        db.insert(BBDD.TABLE_NAME, null, values);
        db.close();
    }

    public ArrayList<Producto> cargar() {
        ArrayList<Producto> arrprod = new ArrayList<Producto>();
        db = Bdatos.getReadableDatabase();
        Cursor cursors = db.rawQuery("select * from " + BBDD.TABLE_NAME, null);
        if (cursors.moveToFirst()) {
            do {
                arrprod.add(new Producto(cursors.getString(0), cursors.getInt(1)));
            } while(cursors.moveToNext());
        }
           db.close();
        return arrprod;
    }


}
