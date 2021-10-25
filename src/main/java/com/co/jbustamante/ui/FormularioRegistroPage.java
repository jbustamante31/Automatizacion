package com.co.jbustamante.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class FormularioRegistroPage extends PageObject {

    //FormularioDatosPersonales
    public static Target INPUT_FIRST_NAME = Target.the("Input First Name ").located(By.id("firstName"));
    public static Target INPUT_LAST_NAME = Target.the("Input Last Name ").located(By.id("lastName"));
    public static Target INPUT_EMAIL = Target.the("Input Email ").located(By.id("email"));
    public static Target SELECT_NACIMIENTO = Target.the("Select Month ").locatedBy("//option[@label='{0}']");
    public static Target SEARCH_LANGUAGE = Target.the("Search Language ").located(By.id("languages"));
    public static Target SELECT_LANGUAGE = Target.the("Select Language ").locatedBy("//div[contains(text(),'{0}')]");
    public static Target BUTTON_NEXT = Target.the("Button next").located(By.xpath("//span[contains(text(),'Next')]"));

    //FormularioDatosUbicacion
    public static Target INPUT_CITY = Target.the("Input City ").located(By.id("city"));
    public static Target INPUT_COD_POSTAL = Target.the("Input Postal Code ").located(By.id("zip"));
    public static Target BUTTON_DEVICES = Target.the("Button Devices").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //FormularioDevices
    public static Target SEARCH_MOBILE = Target.the("Search Mobile ").located(By.xpath("//span[contains(text(), 'Select Brand')]"));
    public static Target SELECT_MOBILE = Target.the("Select Mobile ").locatedBy("//div[contains(text(), '{0}')]");
    public static Target SEARCH_MODEL = Target.the("Search Model ").located(By.xpath("//span[contains(text(), 'Select a Model')]"));
    public static Target SELECT_MODEL = Target.the("Select Model ").locatedBy("//div[contains(text(), '{0}')]");
    public static Target SEARCH_OS = Target.the("Search Os ").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static Target SELECT_OS = Target.the("Select Os ").locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/ul//div[contains(text(), '{0}')]");
    public static Target BUTTON_LAST= Target.the("Button next").located(By.xpath("//span[contains(text(),'Next')]"));

    //FormularioContraseña
    public static Target INPUT_PASSWORD = Target.the("Input Password ").located(By.id("password"));
    public static Target INPUT_CONFIRM_PASSWORD = Target.the("Input Confirm Password ").located(By.id("confirmPassword"));
    public static Target CHECKBOX_UTEAMS = Target.the("Checkbox Uteams").located(By.id("termOfUse"));
    public static Target CHECKBOX_PRIVACY = Target.the("Checkbox Privacy").located(By.id("privacySetting"));
    public static Target BUTTON_COMPLETE= Target.the("Button Complete").located(By.id("laddaBtn"));

    //MensajeBienvenida
    public static Target LABEL_WELCOME = Target.the("Label Welcome ").located(By.className("welcome-lead"));





}
