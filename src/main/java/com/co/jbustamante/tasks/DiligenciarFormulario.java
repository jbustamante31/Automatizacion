package com.co.jbustamante.tasks;

import com.co.jbustamante.interations.LlenarContrasena;
import com.co.jbustamante.interations.LlenarDatosDispositivos;
import com.co.jbustamante.interations.LlenarDatosPersonales;
import com.co.jbustamante.interations.LlenarDatosUbicacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DiligenciarFormulario implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new LlenarDatosPersonales(),
                new LlenarDatosUbicacion(),
                new LlenarDatosDispositivos(),
                new LlenarContrasena()
        );

    }
}
