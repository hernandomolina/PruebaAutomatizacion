package com.pruebatecnicaqa.stepdefinitions;

import com.pruebatecnicaqa.pages.WebTablesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenPageStepDefinitions {

    WebTablesPage webTablesPage;

    @Given("que el usuario abre la página de web tables")
    public void abrirPagina() {
        webTablesPage = new WebTablesPage();
        webTablesPage.openWebTablesPage();
    }
}