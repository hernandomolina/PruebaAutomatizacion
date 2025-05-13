package com.pruebatecnicaqa.stepdefinitions;

import com.pruebatecnicaqa.pages.WebTablesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SearchUserStepDefinitions {

    WebTablesPage webTablesPage;


    @When("escribe un nombre valido")
    public void buscarRegistro() {
        webTablesPage.searchUserForm("Cierra");
    }


    @Then("el registro se filtra en la tabla")
    public void verificarUsuario() {
        String busquedaRegistro = webTablesPage.firstRowTable.getText();
        Assert.assertEquals("Cierra", busquedaRegistro);
    }
}