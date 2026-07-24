package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Chrome browser
        WebDriver driver = new EdgeDriver();

        // Navigate to the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        //maximize screen
        driver.manage().window().maximize();


        /// Html/DOm element locators
        /// Name
        /// ID
        /// Class
        /// CSS Selectors
        /// Xpath Selectors


        //Store test data in variables
        String username = "standard_user";
        String password = "secret_sauce";


        //locate username field and enter value
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys(username);


        //locate password field and enter value
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);


        //locate login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
        loginButton.click();

        Thread.sleep(5000);


        /// Close the browser session and clean up resources
        ///This terminates the WebDriver instance and closes all associated windows.
        ///Note: driver.quit() is often preferred as it closes all windows and ends
        /// the WebDriver session more completely than close().
        driver.quit();


    }
}