package com.example.prueba26_3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BBDD extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Productos.db";

    public static final String TABLE_NAME ="PRODUCTOS";
    public static final String NOMBRE  = "NOMBRE";
    public static final String PRECIO = "PRECIO";

    private BBDD data;
    private SQLiteDatabase db;

    public BBDD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + BBDD.TABLE_NAME + " ("
                + BBDD.NOMBRE + " TEXT NOT NULL,"
                + BBDD.PRECIO + " INTEGER NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

}