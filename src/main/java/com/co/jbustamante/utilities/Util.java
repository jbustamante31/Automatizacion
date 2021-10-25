package com.co.jbustamante.utilities;

import java.util.Random;

public class Util {


    public static String aleatorio(){

        Random aleatorio = new Random(System.currentTimeMillis());

        int intAletorio = aleatorio.nextInt(10000);
        return String.valueOf(intAletorio);
    }

// Más código
}
