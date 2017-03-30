package com.example.jose_laptop.farmaciavirtual;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



/**
 * Created by Jose-laptop on 28/03/2017.
 */

public class BD_helper extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS = 1;
    private static final String NOMBRE_BASEDATOS = "BD_FarmaciaVirtual.db";
    private static final String NOMBRE_TABLA = "Usuarios";

    private static final String ins = "CREATE TABLE Usuarios (id INT PRIMARY KEY, nombre VARCHAR(100), pass VARCHAR(16))";

    public BD_helper(Context context) {
        super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ins);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + NOMBRE_TABLA);
        onCreate(db);
    }

    public long modificar(Object c){
        long nreg_afectados = -1;
        /* Abrimos la BD de Escritura */
        SQLiteDatabase db = getWritableDatabase();

        if (db != null) {
            ContentValues valores = new ContentValues();
         //   valores.put("nombre", c.getNombre());

         //   nreg_afectados = db.update("contactos", valores, "id=" + c.getID(), null);
        }
        db.close();

        return nreg_afectados;
    }

   /* public List<Contacto> listado() {
        /* Abrimos la BD de Lectura */
   /*     SQLiteDatabase db = getReadableDatabase();

        /* Creamos una Lista de Contactos que será la que devolvamos en este metodo */
   /*     List<Contacto> lista_contactos = new ArrayList<Contacto>();

        if (db != null) {
            String[] campos = {"id", "nombre"};
            /* Como queremos devolver todos los registros el tercer parámetro del query ( String selection )
            es null */
    /*        Cursor c = db.query("contactos", campos, null, null, null, null, null, null);
            if (c.moveToFirst()) {
                do {
                    contacto = new Contacto(c.getInt(0), c.getString(1));
                    lista_contactos.add(contacto);
                } while (c.moveToNext());
            }
            c.close();
        }
        db.close();
        return lista_contactos;
    }*/
}
