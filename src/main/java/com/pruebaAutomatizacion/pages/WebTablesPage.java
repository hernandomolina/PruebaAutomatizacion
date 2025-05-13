package com.pruebaAutomatizacion.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends PageObject {


    @FindBy(xpath= "(//*[@class='rt-td'])[1]")
    public WebElement firstRowTable;

    @FindBy(xpath= "//*[text()='David']")
    public WebElement actualFirstRowTable;

    @FindBy(id = "searchBox")
    WebElement inputSeachBox;


    @FindBy(id = "firstName")
    WebElement inputFirstName;

    @FindBy(id = "lastName")
    WebElement inputLastName;

    @FindBy(id = "userEmail")
    WebElement inputEmail;

    @FindBy(id = "age")
    WebElement inputAge;

    @FindBy(id = "salary")
    WebElement inputSalary;

    @FindBy(id = "department")
    WebElement inputDepartment;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(id = "delete-record-1")
    WebElement deleteButton;

    @FindBy(id = "edit-record-1")
    WebElement editButton;

    public void openWebTablesPage() {
        openUrl("https://demoqa.com/webtables");
    }


    public void clickDeleteButton() {
        deleteButton.click();
    }

    public void clickEditButton() {
        editButton.click();
    }

    public void searchUserForm(String firstName) {
        inputSeachBox.sendKeys(firstName);
    }


    public void fillUserForm(String firstName, String lastName, String email, String age) {
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
        inputEmail.clear();
        inputEmail.sendKeys(email);
        inputAge.clear();
        inputAge.sendKeys(age);
    }

    public void submitForm() {
        submitButton.click();
    }
}