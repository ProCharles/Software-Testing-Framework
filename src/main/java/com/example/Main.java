package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create a new instance of the Chrome browser
        WebDriver driver = new EdgeDriver();

        // Navigate to the SauceDemo website
        driver.get("https://www.saucedemo.com/");

        /// Close the browser session and clean up resources
        ///This terminates the WebDriver instance and closes all associated windows.
        ///Note: driver.quit() is often preferred as it closes all windows and ends
        /// the WebDriver session more completely than close().
        driver.quit();


    }
}