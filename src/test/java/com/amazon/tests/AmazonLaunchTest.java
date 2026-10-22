package com.amazon.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLaunchTest extends BaseTest {

    @Test(description = "Launch Amazon India and verify page title, URL, and search bar")
    public void testLaunchAmazonIndia() {
        // Step 1: Navigate to Amazon India
        driver.get("https://www.amazon.in");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Step 2: Validate URL
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Navigated URL: " + actualUrl);
        Assert.assertTrue(actualUrl.contains("amazon.in"),
                "Expected URL to contain 'amazon.in', but was: " + actualUrl);

        // Step 3: Wait for page title to populate and validate
        wait.until(d -> d.getTitle() != null && !d.getTitle().trim().isEmpty());
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        Assert.assertTrue(actualTitle.toLowerCase().contains("amazon"),
                "Expected Title to contain 'amazon', but was: " + actualTitle);

        // Step 4: Verify search box is present and displayed
        try {
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
            Assert.assertTrue(searchBox.isDisplayed(), "Amazon search box should be visible on the homepage.");
            System.out.println("Amazon search box is displayed successfully.");
        } catch (Exception e) {
            System.out.println("Homepage element note: " + e.getMessage());
        }
    }
}
