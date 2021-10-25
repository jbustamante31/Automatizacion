package com.co.jbustamante.stepdefinitions;

import com.co.jbustamante.model.DatosRegistro;
import com.co.jbustamante.questions.RegistroExitosoQuestion;
import com.co.jbustamante.tasks.AbrirNavegador;
import com.co.jbustamante.tasks.DiligenciarFormulario;
import com.co.jbustamante.tasks.SeleccionarOpcionRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class JoinTodayStep {

    @Before
    public void setup(){
        OnStage.setTheStage( new OnlineCast());
    }

    @Dado("^que (.*) quiere registrarse en uTest$")
    public void que_el_actor_quiere_registrarse_en_Utest(String actor) {
        OnStage.theActorCalled(actor)
                .wasAbleTo(new AbrirNavegador(),
                        new SeleccionarOpcionRegistro());
    }

    @Cuando("^Ingreso los datos en el formulario de registro$")
    public void ingreso_los_datos_en_el_formulario_de_registro(List<DatosRegistro> datosRegistroList) {
          OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        DiligenciarFormulario.conLosDatos(datosRegistroList.get(0))
                );
    }

    @Entonces("valido el registro exitoso$")
    public void valido_el_registro_exitoso(List<DatosRegistro> datosRegistroList) {
                OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegistroExitosoQuestion.toThe(datosRegistroList.get(0).getValorEsperado())));
    }


}
