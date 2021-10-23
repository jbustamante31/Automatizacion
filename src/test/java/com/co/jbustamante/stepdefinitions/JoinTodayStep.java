package com.co.jbustamante.stepdefinitions;

import com.co.jbustamante.tasks.AbrirNavegador;
import com.co.jbustamante.tasks.DiligenciarFormulario;
import com.co.jbustamante.tasks.SeleccionarOpcionRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class JoinTodayStep {

    @Before
    public void setup(){
        OnStage.setTheStage( new OnlineCast());
    }

    @Dado("Selecciono la opcion Registrar")
    public void selecciono_la_opcion_registrar() {
        OnStage.theActorCalled("Junior")
                .wasAbleTo(new AbrirNavegador(),
                        new SeleccionarOpcionRegistro());
    }

    @Cuando("Ingreso los datos en el formulario de registro")
    public void ingreso_los_datos_en_el_formulario_de_registro() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        new DiligenciarFormulario()
                );
    }

    @Entonces("valido el registro exitoso")
    public void valido_el_registro_exitoso() {
        System.out.println("Entonces");
    }


}
