package com.co.jbustamante.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.jbustamante.ui.FormularioRegistroPage.LABEL_WELCOME;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Question<Boolean> toThe(String question) {

        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensaje = LABEL_WELCOME.resolveFor(actor).getText();
        return mensaje.contains(question);


    }
}
