package com.pruebaAutomatizacion.stepdefinitions;

import com.pruebaAutomatizacion.pages.WebTablesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditUserStepDefinitions {

    WebTablesPage webTablesPage;


    @When("el usuario hace clic en el botón edit")
    public void clicEnEdit() {
        webTablesPage.clickEditButton();
    }

    @When("modifica el campo a editar en el registro")
    public void llenarFormulario() {
        webTablesPage.fillUserForm("David", "Gonzales", "david24@mail.com", "30");
    }

    @When("hace clic en Submit despues de editar")
    public void clicEnSubmit() {
        webTablesPage.submitForm();
    }


    @Then("el registro debe modificarse en la tabla")
    public void verificarUsuarioEditado() {
        String modificacionRegistro = webTablesPage.actualFirstRowTable.getText();
        Assert.assertEquals("David", modificacionRegistro);
    }
}