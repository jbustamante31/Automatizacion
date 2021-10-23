package com.co.jbustamante.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class HomePage extends PageObject {

    public static Target BOTON_JOIN = Target.the("Boton Registro Join").located(By.className("unauthenticated-nav-bar__sign-up"));
}
