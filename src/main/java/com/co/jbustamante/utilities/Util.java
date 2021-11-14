package com.co.jbustamante.utilities;

import net.serenitybdd.screenplay.Actor;

import java.util.Random;

import static com.co.jbustamante.ui.FormularioRegistroPage.LABEL_PHONE;

public class Util {


    public static String aleatorio(){

        Random aleatorio = new Random(System.currentTimeMillis());

        int intAletorio = aleatorio.nextInt(20000);
        return String.valueOf(intAletorio);
    }


}
