package com.co.jbustamante.interations;

import com.co.jbustamante.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class LlenarDatosUbicacion implements Interaction{

    private DatosRegistro datosRegistro;

    public LlenarDatosUbicacion(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosRegistro.getCiudad()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(datosRegistro.getCodigoPostal()).into(INPUT_COD_POSTAL),
                Scroll.to(BUTTON_DEVICES),
                Click.on(BUTTON_DEVICES)

        );
        
    }
}
