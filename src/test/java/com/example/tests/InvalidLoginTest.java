package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.base.BaseTest;
import com.example.pages.LoginPage;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void invalidUserCannotLogin() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();
        loginPage.login("invalidUser", "invalidPassword");

        Assert.assertTrue(
                loginPage.getFlashMessage().contains("Your username is invalid!"),
                "Error message should be displayed for invalid login");
    }
}
