package com.example.jose_laptop.farmaciavirtual.Modelo;

import android.location.Location;

/**
 * Created by Jose-laptop on 05/04/2017.
 */

public class Farmacia {

    private String nombre;
    private Location localizacion;
    private int id;

    public Farmacia(){
        nombre ="Farmacia";
        localizacion = new Location("");
        id = -1;
    }

    public Farmacia(String nombre, Location localizacion, int id){
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.id = id;
    }

    public Farmacia(String nombre, double latitud, double longitud, int id){
        this.nombre = nombre;
        localizacion = new Location("");
        localizacion.setLatitude(latitud);
        localizacion.setLongitude(longitud);
        this.id = id;
    }

    /**
     * Constructor de Farmacia
     * @param nombre nombre de la farmacia
     * @param localizacion Localización en formato texto
     * @param id identificador de la farmacia
     */
    public Farmacia(String nombre, String localizacion, int id){
        this.nombre = nombre;
        this.id = id;

        setLocalizacion(localizacion);

    }

    public void setLocalizacion(String loc){
        this.localizacion = new Location("");
        this.localizacion.setLongitude(Double.valueOf(loc.split("#")[0]));
        this.localizacion.setLatitude(Double.valueOf(loc.split("#")[1]));
    }

    public String getNombre(){ return nombre;}

    public Location getLocalizacion(){return localizacion;}

    public int getId(){ return id;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setLocalizacion(Location l){
        localizacion = l;
    }

    public void setLocalizacion(double latitud, double longitud ){
        localizacion = new Location("");
        localizacion.setLatitude(latitud);
        localizacion.setLongitude(longitud);
    }

    public void setId(int id){
        this.id = id;
    }



}
