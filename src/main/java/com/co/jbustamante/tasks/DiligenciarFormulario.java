package com.co.jbustamante.tasks;

import com.co.jbustamante.interations.LlenarContrasena;
import com.co.jbustamante.interations.LlenarDatosDispositivos;
import com.co.jbustamante.interations.LlenarDatosPersonales;
import com.co.jbustamante.interations.LlenarDatosUbicacion;
import com.co.jbustamante.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class DiligenciarFormulario implements Task{
    private DatosRegistro datosRegistro;

    public DiligenciarFormulario(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new LlenarDatosPersonales(datosRegistro),
                new LlenarDatosUbicacion(datosRegistro),
                new LlenarDatosDispositivos(datosRegistro),
                new LlenarContrasena(datosRegistro)
        );

    }
    public static DiligenciarFormulario conLosDatos(DatosRegistro datosRegistro){
        return new DiligenciarFormulario(datosRegistro);


    }
}
