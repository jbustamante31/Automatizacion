package com.co.jbustamante.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class FormularioRegistroPage extends PageObject {

    //FormularioDatosPersonales
    public static Target INPUT_FIRST_NAME = Target.the("Input Name ").located(By.id("et_pb_contact_first_0"));
    public static Target INPUT_LAST_NAME = Target.the("Input Last Name ").located(By.id("et_pb_contact_last_0"));
    public static Target INPUT_EMAIL = Target.the("Input Email ").located(By.id("et_pb_contact_email_0"));
    public static Target INPUT_PHONE = Target.the("Input Phone ").located(By.id("et_pb_contact_phone_0"));
    public static Target INPUT_MESSAGE = Target.the("Input Message ").located(By.id("et_pb_contact_message_0"));

    public static Target BUTTON_SEND = Target.the("Button Send Message").located(By.name("et_builder_submit_button"));
    public static Target MESSAGE_SEND = Target.the("Label Welcome ").located(By.cssSelector("div.et-pb-contact-message"));

    public static Target LABEL_PHONE = Target.the("Label Phone").locatedBy("//*[@id='post-211']/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/p/span[3]/a");



}
