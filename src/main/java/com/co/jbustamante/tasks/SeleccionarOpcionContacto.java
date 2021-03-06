package com.co.jbustamante.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.jbustamante.ui.HomePage.BOTON_CONTACTO;


public class SeleccionarOpcionContacto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONTACTO)
        );

    }
}
