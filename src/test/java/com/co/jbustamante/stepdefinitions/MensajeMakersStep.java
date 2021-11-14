package com.co.jbustamante.stepdefinitions;

import com.co.jbustamante.model.DatosRegistro;
import com.co.jbustamante.questions.MensajeEnviadoQuestion;
import com.co.jbustamante.tasks.AbrirNavegador;
import com.co.jbustamante.tasks.DiligenciarFormulario;
import com.co.jbustamante.tasks.SeleccionarOpcionContacto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.co.jbustamante.ui.FormularioRegistroPage.LABEL_PHONE;

public class MensajeMakersStep {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^la siguiente url (.*)$")
    public void la_siguiente_url(String actor) {
        OnStage.theActorCalled(actor)
                .wasAbleTo(new AbrirNavegador());
    }

    @Cuando("^hacemos clic en el enlace de CONTACTO$")
    public void hacemos_clic_en_el_enlace_de_CONTACTO() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                new SeleccionarOpcionContacto()
        );

    }

    @Entonces("^capturar el numero de celular de servicio al cliente$")
    public void capturar_el_numero_de_celular_de_servicio_al_cliente() {
        System.out.println("normal");
        //String captura = LABEL_PHONE.resolveFor(Actor.named(actor)).getText();
        //System.out.println(captura);
        //OnStage.theActorInTheSpotlight().attemptsTo();

    }


    @Y("^llenar el formulario \"dejanos un mensaje\" y en el campo mensaje adjuntar el numero de celular capturado$")
    public void llenar_el_formulario_dejanos_un_mensaje_y_en_el_campo_mensaje_adjuntar_el_numero_de_celular_capturado(List<DatosRegistro> datosRegistroList) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        DiligenciarFormulario.conLosDatos(datosRegistroList.get(0))
                );
    }

    @Y("^antes de hacer clic en el boton \"enviar mensaje\" tomar un pantallazo con la informacion diligenciada$")
    public void antes_de_hacer_clic_en_el_boton_enviar_mensaje_tomar_un_pantallazo_con_la_informacion_diligenciada(List<DatosRegistro> datosRegistroList) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeEnviadoQuestion.conLosDatos(datosRegistroList.get(0).getValorEsperado())));
    }
}