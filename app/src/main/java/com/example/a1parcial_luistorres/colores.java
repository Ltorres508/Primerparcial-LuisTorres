package com.example.a1parcial_luistorres;

public class colores {

public static String decimaltoHex(int decimal){
    String hex = Integer.toHexString(decimal);
    if (hex.length() == 1){
        hex = "0" + hex;
    }
    return hex;
}
}
