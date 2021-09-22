package com.example.OnurMuhSeleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OnurMuhSeleniumTestApplicationTests {
	
	private WebDriver driver;
		
	String searchText = "selenium";

	@Test
	void contextLoads() {
		
		System.setProperty("webdriver.chrome.driver", UtilsTest.CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.get(UtilsTest.WEBPAGE_URL);
        
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(new By.ByCssSelector("a[data-purpose='header-login']")));
        
        WebElement searchInput = driver.findElement(new By.ByCssSelector("input[id*='search-form-autocomplete--3']"));
        searchInput.click();
        searchInput.sendKeys(this.searchText);
        
        WebElement searchButton = driver.findElement(new By.ByCssSelector("div.header--search-bar--1_mS0 button"));
        searchButton.click();
       
		
	}

}
