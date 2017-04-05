package com.example.jose_laptop.farmaciavirtual.Modelo.Conexiones;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.jose_laptop.farmaciavirtual.Modelo.Farmacia;
import com.example.jose_laptop.farmaciavirtual.Modelo.Producto;
import com.example.jose_laptop.farmaciavirtual.Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Jose-laptop on 28/03/2017.
 */

public class BD_helper extends SQLiteOpenHelper {

    private static final int VERSION_BASEDATOS = 1;
    private static final String NOMBRE_BASEDATOS = "BD_FarmaciaVirtual.db";
    private static final String NOMBRE_TABLA = "Usuarios";

    private static final String ins = "CREATE TABLE Usuarios ( nombre VARCHAR(100) PRIMARY KEY, pass VARCHAR(16))";

    private static final String ins_farma = "CREATE TABLE Farmacias (id_farmacia INT PRIMARY KEY, nombre VARCHAR(50)," +
            " longitud REAL, latitud REAL)";
    private static final String ins_productos = "CREATE TABLE Productos (id_producto INT PRIMARY KEY, nombre VARCHAR(50), " +
            "descripcion VARCHAR(50), precio REAL)";



    public BD_helper(Context context) {
        super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATOS);
    }

    /**
     * Creación de la Base de datos local en caso de que no esté creada
     * @param db nombre de la base de datos encontrada.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(ins);
        }catch (Exception e){
            Log.e("SQL", "Error en la creación de la tabla usuarios");
        }
        try {
            db.execSQL(ins_farma);
        }catch (Exception e){
            Log.e("SQL", "Error en la creación de la tabla farmacia");
        }
        try {
            db.execSQL(ins_productos);
        }catch (Exception e){
            Log.e("SQL", "Error en la creación de la tabla productos");
        }
    }

    /**
     * Metodo que actualiza la base de datos interna en caso de que la versiones no coincida
     * @param db nombre de la base da datos
     * @param oldVersion numero de versión antiguo
     * @param newVersion numero de versión nuevo
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + NOMBRE_TABLA);
        onCreate(db);
    }


    /**
     * Modifica los datos de un usuario en la BD local
     * @param c datos del usuario a modificar.
     * @return Numero de registros afectados, si es 1 la modificación ha sido satisfactoria.
     */
    public long ModificarUsuario(Usuario c){
        long nreg_afectados = -1;
        /* Abrimos la BD de Escritura */
        SQLiteDatabase db = getWritableDatabase();

        if (db != null) {
            ContentValues valores = new ContentValues();
            valores.put("nombre", c.getUsuario());
            valores.put("pass", c.getPass());
            nreg_afectados = db.update("Usuarios", valores, "nombre=" + c.getUsuario(), null);
        }
        db.close();

        return nreg_afectados;
    }

    /**********************************************************************************
     ************     CONSULTAS    **************************************************
     **********************************************************************************/


    /**
     * Obtenemos la password del servidor para un name específico
     * @param name nombre del usuario
     * @return password encriptada del usuario
     */
    public String getUserPass(String name){
        /* Abrimos la BD de Lectura */
        SQLiteDatabase db = getReadableDatabase();
        String resultado = "";
        /* Comprobamos si existe el usuario */
        if (db != null) {
            String[] columnas = {"pass"};
            Cursor cursor = null;
            try {
                cursor = db.query("Usuarios", columnas, "nombre=" + name, null, null, null, null, null);
            }catch (SQLException e){
                Log.e("SQL", "Error: No se pudo realizar la consulta de la pass");
            }
            if(cursor != null)
                if (cursor.moveToFirst()) {
                    resultado = cursor.getString(0);
                }
            cursor.close();
        }
        db.close();

        return resultado;
    }

    /**
     * Obtiene un listado de las farmacias.
     * @return listado de las farmacias
     */
    public List<Farmacia> getFarmacias(){
            /* Abrimos la BD de Lectura */
        SQLiteDatabase db = getReadableDatabase();

       List<Farmacia> lista_resultado = new ArrayList<Farmacia>();
        Farmacia farmacia;
        if (db != null) {
            String[] campos = {"id", "nombre","longitud","latitud"};

            Cursor c = db.query("Farmacias", campos, null, null, null, null, null, null);
            if (c.moveToFirst()) {
                do {
                    farmacia = new Farmacia(c.getString(0), c.getDouble(1), c.getDouble(2),c.getInt(3));
                    lista_resultado.add(farmacia);
                } while (c.moveToNext());
            }
            c.close();
        }
        db.close();
        return lista_resultado;
    }

    /**
     * Obtiene una lista de los productos de la farmacia indicada
     * @param id_farmacia identificador de la farmacia
     * @return listado con los productos de la farmacia
     */
    public List<Producto> getProductos(int id_farmacia){
            /* Abrimos la BD de Lectura */
        SQLiteDatabase db = getReadableDatabase();


        List<Producto> lista_resultado = new ArrayList<Producto>();
        Producto producto;
        if (db != null) {
            String[] campos = {"nombre", "descripcion","precio"};

            Cursor c = db.query("Productos", campos, "id="+id_farmacia, null, null, null, null, null);
            if (c.moveToFirst()) {
                do {
                    producto = new Producto(c.getString(0), c.getString(1), c.getFloat(2));
                    lista_resultado.add(producto);
                } while (c.moveToNext());
            }
            c.close();
        }
        db.close();
        return lista_resultado;
    }

    /**********************************************************************************
     ************     INSERCIONES    **************************************************
     **********************************************************************************/

    /**
     * Inserta un nuevo usuario en la Base de datos local
     * @param c usuario a insertar
     * @return
     */
    public long InsertarUsuario(Usuario c){
        long id=-1;
        /* Abrimos la BD de Escritura */
        SQLiteDatabase db = getWritableDatabase();

        if (db != null) {
            ContentValues valores = new ContentValues();
            valores.put("nombre", c.getUsuario());
            valores.put("pass", c.getPass());
            valores.put("id", c.getID());
            try {
                id = db.insert("Usuarios", null, valores);
            }catch(SQLException e){
                Log.e("SQL", "Error: No se pudo insertar el usuario="+c.getUsuario());
            }
        }
        db.close();

        return id;
    }

    public int insertFarmacias(List<Farmacia> farmacias){
        int num_result = 0;
        /* Abrimos la BD de Escritura */
        SQLiteDatabase db = getWritableDatabase();
        long id;
        if (db != null) {
            for (Farmacia farma: farmacias) {
                ContentValues valores = new ContentValues();
                valores.put("id", farma.getId());
                valores.put("nombre", farma.getNombre());
                valores.put("longitud", farma.getLocalizacion().getLongitude());
                valores.put("latitud", farma.getLocalizacion().getLatitude());

                try {
                    id = db.insert("Farmacias", null, valores);
                }catch(SQLException e){
                    Log.e("SQL", "Error: No se pudo insertar la farmacia ="+farma.getNombre());
                }
                num_result ++;
            }
        }
        db.close();
        return num_result;
    }

    public int insertProductos(List<Producto> productos){
        int num_result = 0;
        /* Abrimos la BD de Escritura */
        SQLiteDatabase db = getWritableDatabase();
        long id;
        if (db != null) {
            for (Producto prod: productos) {
                ContentValues valores = new ContentValues();
                valores.put("nombre", prod.getNombre());
                valores.put("descripcion", prod.getDescripcion());
                valores.put("precio", prod.getPrecio());

                try {
                    id = db.insert("Productos", null, valores);
                }catch(SQLException e){
                    Log.e("SQL", "Error: No se pudo insertar la farmacia ="+prod.getNombre());
                }
                num_result ++;
            }
        }
        db.close();
        return num_result;
    }

}
