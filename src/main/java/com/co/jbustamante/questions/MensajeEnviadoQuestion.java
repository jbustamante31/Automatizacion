package com.co.jbustamante.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.co.jbustamante.ui.FormularioRegistroPage.MESSAGE_SEND;

public class MensajeEnviadoQuestion implements Question<Boolean> {
    private String question;

    public MensajeEnviadoQuestion(String question){
        this.question = question;
    }

    public static Question<Boolean> conLosDatos(String question) {

        return new MensajeEnviadoQuestion(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = MESSAGE_SEND.resolveFor(actor).getText();
        return mensaje.contains(question);


    }
}
