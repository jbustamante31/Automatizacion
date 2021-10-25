package com.co.jbustamante.interations;

import com.co.jbustamante.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class LlenarContrasena implements Interaction{

    private DatosRegistro datosRegistro;

    public LlenarContrasena(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosRegistro.getContrasena()).into(INPUT_PASSWORD),
                Enter.theValue(datosRegistro.getContrasena()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_UTEAMS),
                Click.on(CHECKBOX_PRIVACY),
                Scroll.to(BUTTON_COMPLETE),
                Click.on(BUTTON_COMPLETE)

        );
        
    }
}
