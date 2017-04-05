package com.example.jose_laptop.farmaciavirtual.Controlador;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * Created by Jose-laptop on 28/03/2017.
 */

public class Encriptador {

    private static SecretKey secret;

    private static final Encriptador ourInstance = new Encriptador();

    private Encriptador() {
        DESKeySpec keySpec = null;
        try {
            keySpec = new DESKeySpec("sik·$552$·~##9s".getBytes("UTF8"));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        SecretKeyFactory keyFactory = null;
        try {
            keyFactory = SecretKeyFactory.getInstance("DES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            SecretKey key = keyFactory.generateSecret(keySpec);
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

    }

    public static Encriptador getInstance() {
        return ourInstance;
    }


    public byte[] encryptMsg(String message){
   /* Encrypt the message. */
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            cipher.init(Cipher.ENCRYPT_MODE, secret);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        byte[] cipherText = new byte[0];
        try {
            cipherText = cipher.doFinal(message.getBytes("UTF-8"));
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return cipherText;
    }

    public String decryptMsg(byte[] cipherText) throws BadPaddingException, IllegalBlockSizeException {
    /* Decrypt the message, given derived encContentValues and initialization vector. */
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            cipher.init(Cipher.DECRYPT_MODE, secret);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        String decryptString = null;
        try {
            decryptString = new String(cipher.doFinal(cipherText), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return decryptString;
    }
}
