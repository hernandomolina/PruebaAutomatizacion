package com.pruebaAutomatizacion.stepdefinitions;

import com.pruebaAutomatizacion.pages.WebTablesPage;
import io.cucumber.java.en.Given;

public class OpenPageStepDefinitions {

    WebTablesPage webTablesPage;

    @Given("que el usuario abre la página de web tables")
    public void abrirPagina() {
        webTablesPage = new WebTablesPage();
        webTablesPage.openWebTablesPage();
    }
}