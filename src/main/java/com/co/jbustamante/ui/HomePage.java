package com.co.jbustamante.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://somosmakers.co/")
public class HomePage extends PageObject {

    public static Target BOTON_CONTACTO = Target.the("Boton").located(By.xpath("//*[@id=\"menu-principal\"]/li[5]/a"));
}
