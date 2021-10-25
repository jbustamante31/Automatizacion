package com.co.jbustamante.interations;

import com.co.jbustamante.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class LlenarDatosDispositivos implements Interaction{
    private DatosRegistro datosRegistro;

    public LlenarDatosDispositivos(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH_MOBILE),
                Click.on(SELECT_MOBILE.of(datosRegistro.getMovil())),
                Click.on(SEARCH_MODEL),
                Click.on(SELECT_MODEL.of(datosRegistro.getModelo())),
                Click.on(SEARCH_OS),
                Click.on(SELECT_OS.of(datosRegistro.getsOMovil())),
                Click.on(BUTTON_LAST)

        );
        
    }
}
