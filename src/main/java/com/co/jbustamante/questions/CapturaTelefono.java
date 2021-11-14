package com.co.jbustamante.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.jbustamante.ui.FormularioRegistroPage.LABEL_PHONE;
import static com.co.jbustamante.ui.FormularioRegistroPage.LABEL_WELCOME;

public class CapturaTelefono implements Question<Boolean> {
    private String question;

    public CapturaTelefono(String question){
        this.question = question;
    }

    public static Question<Boolean> conLosDatos(String question) {

        return new CapturaTelefono(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = LABEL_PHONE.resolveFor(actor).getText();
        return mensaje.contains(question);


    }
}
