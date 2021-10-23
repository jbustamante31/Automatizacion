package com.co.jbustamante.interations;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class LlenarDatosPersonales implements Interaction{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("JUNIOR").into(INPUT_FIRST_NAME),
                Enter.theValue("BUSTAMANTE").into(INPUT_LAST_NAME),
                Enter.theValue("dijeybi715@hotmail.com").into(INPUT_EMAIL),
                SelectFromOptions.byValue("number:1").from(SELECT_MONTH),
                SelectFromOptions.byValue("number:14").from(SELECT_DAY),
                SelectFromOptions.byValue("number:1988").from(SELECT_YEAR),
                SelectFromOptions.byValue("number:12").from(SELECT_LANGUAGE)

        );


    }
}
