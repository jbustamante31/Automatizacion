package com.co.jbustamante.tasks;

import com.co.jbustamante.model.DatosRegistro;
import com.co.jbustamante.questions.CapturaTelefono;
import com.co.jbustamante.utilities.Util;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.jbustamante.ui.FormularioRegistroPage.*;

public class DiligenciarFormulario implements Task{

    private DatosRegistro datosRegistro;

    public DiligenciarFormulario(DatosRegistro datosRegistro) {
        this.datosRegistro = datosRegistro;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LABEL_MESSAGE),
                Enter.theValue(datosRegistro.getNombre()).into(INPUT_FIRST_NAME),
                Enter.theValue(datosRegistro.getApellido()).into(INPUT_LAST_NAME),
                Enter.theValue(Util.aleatorio()+datosRegistro.getCorreo()).into(INPUT_EMAIL),
                Enter.theValue(new CapturaTelefono.conLosDatos()).into(INPUT_PHONE),
                Enter.theValue(datosRegistro.getMensaje()).into(INPUT_MESSAGE),
                Click.on(LABEL_MESSAGE)

        );

    }
    public static DiligenciarFormulario conLosDatos(DatosRegistro datosRegistro){
        return new DiligenciarFormulario(datosRegistro);


    }
}
