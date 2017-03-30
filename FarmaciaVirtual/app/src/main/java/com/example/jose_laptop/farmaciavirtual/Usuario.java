package com.example.jose_laptop.farmaciavirtual;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 * Created by Jose-laptop on 28/03/2017.
 */

class Usuario {
    private static final Usuario ourInstance = new Usuario();

    static Usuario getInstance() {
        return ourInstance;
    }

    private String usuario;
    private byte [] password;
    private int id;

    private Usuario() {
    }

    public String getUsuario(){
        return usuario;
    }


    public void setPassword(String pass){
        password = Encriptador.getInstance().encryptMsg(pass);
        // Añadir a BD
    }

    public void loadLogin(){
        // Cargar de la BD los datos
    }


    public boolean checkPass(String pass){

        try {
            return (pass == Encriptador.getInstance().decryptMsg(password));
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean login(String name, String pass){
        if(name == usuario && checkPass(pass))
            return true;
        return false;
    }
}
