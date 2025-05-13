package com.pruebatecnicaqa.stepdefinitions;

import com.pruebatecnicaqa.pages.WebTablesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class OpenPageStepDefinitions {

    @Steps
    WebTablesPage webTablesPage;

    @Before
    @Given("que el usuario abre la página de web tables")
    public void verificarPaginaAbierta() {
        // Verificar que algún elemento clave de la página está visiblee
        webTablesPage.openWebTablesPage();
    }
}