package com.pruebatecnicaqa.stepdefinitions;

import com.pruebatecnicaqa.pages.WebTablesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteUserStepDefinitions {

    WebTablesPage webTablesPage;


    @When("el usuario hace clic en el botón Delete")
    public void clicEnDelete() {
        webTablesPage.clickDeleteButton();
    }

    @Then("el usuario debe desaparecer en la tabla")
    public void verificarUsuarioEliminado() {
        String validarRegistroEliminado = webTablesPage.firstRowTable.getText();
        Assert.assertNotEquals("Cierra", validarRegistroEliminado);
    }
}