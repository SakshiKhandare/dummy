package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.base.BaseTest;
import com.example.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validUserCanLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.login("tomsmith", "SuperSecretPassword!");

        Assert.assertTrue(
                loginPage.getFlashMessage().contains("You logged into a secure area!"),
                "Success message should be displayed after login");
    }
}
