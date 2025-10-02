package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
    HomePage home;
    LoginPage login;

    @And("User enters valid data")
    public void enters_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User clicks Anmelden button")
    public void clicks_Anmelden_button() {
        login.clickOnAnmelden();
    }

    @And("User cliks on User icon")
    public void cliks_on_User_icon() {
        home = Selenide.page(HomePage.class);
        home.clickOnStatusIcon();
    }

    @Then("User verifies his name")
    public void verify_his_name() {
        login.verifyName();
    }
}
