package com.co.jbustamante.interations;

import com.co.jbustamante.model.DatosRegistro;
import com.co.jbustamante.utilities.Util;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;

import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class LlenarDatosPersonales implements Interaction{

    private DatosRegistro datosRegistro;

    public LlenarDatosPersonales(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosRegistro.getNombre()).into(INPUT_FIRST_NAME),
                Enter.theValue(datosRegistro.getApellido()).into(INPUT_LAST_NAME),
                Enter.theValue(Util.aleatorio()+datosRegistro.getCorreo()).into(INPUT_EMAIL),
                Click.on(SELECT_NACIMIENTO.of(datosRegistro.getFechaNaciMes())),
                Click.on(SELECT_NACIMIENTO.of(datosRegistro.getFechaNaciDia())),
                Click.on(SELECT_NACIMIENTO.of(datosRegistro.getFechaNaciAnio())),
                Scroll.to(BUTTON_NEXT),
                Click.on(SEARCH_LANGUAGE),
                Click.on(SELECT_LANGUAGE.of(datosRegistro.getIdioma())),
                Click.on(BUTTON_NEXT)

        );

    }
}
