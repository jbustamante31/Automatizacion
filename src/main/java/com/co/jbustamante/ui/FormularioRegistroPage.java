package com.co.jbustamante.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class FormularioRegistroPage extends PageObject {

    //Formulario
    public static Target INPUT_FIRST_NAME = Target.the("Input First Name ").located(By.id("firstName"));
    public static Target INPUT_LAST_NAME = Target.the("Input Last Name ").located(By.id("lastName"));
    public static Target INPUT_EMAIL = Target.the("Input Email ").located(By.id("email"));
    public static Target SELECT_MONTH = Target.the("Select Month ").located(By.id("birthMonth"));
    public static Target SELECT_DAY = Target.the("Select Day ").located(By.id("birthDay"));
    public static Target SELECT_YEAR = Target.the("Select Year ").located(By.id("birthYear"));
    public static Target SELECT_LANGUAGE = Target.the("Select Language ").located(By.id("languages"));

}
