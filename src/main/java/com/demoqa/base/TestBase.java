package com.demoqa.base;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.demoqa.util.Variables;

public class TestBase extends Variables {

	// Functions
	public void scrollTo(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// initialize the Browser
	public WebDriver initializeBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			return new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			return new EdgeDriver();
		} else {
			return null;
		}
	}

	public void openWebPage(WebDriver driver, String elementName) {

		if (elementName.equalsIgnoreCase("Text Box")) {
			driver.get(textBoxURL);
		} else if (elementName.equalsIgnoreCase("Check Box")) {
			driver.get(checkBoxURL);
		} else if (elementName.equalsIgnoreCase("Radio Button")) {
			driver.get(radioButtonURL);
		} else if (elementName.equalsIgnoreCase("Web Tables")) {
			driver.get(webTablesURL);
		} else if (elementName.equalsIgnoreCase("Buttons")) {
			driver.get(buttonsURL);
		} else if (elementName.equalsIgnoreCase("Links")) {
			driver.get(linksURL);
		} else if (elementName.equalsIgnoreCase("Broken Links - Images")) {
			driver.get(brokenLinkURL);
		} else if (elementName.equalsIgnoreCase("Upload and Download")) {
			driver.get(uploadDownloadURL);
		} else if (elementName.equalsIgnoreCase("Dynamic Properties")) {
			driver.get(dynamicPropertiesURL);
		}
	}

	public void getInput(Scanner scanner) {

		System.out.println("Enter the Full Name");
		fullName = scanner.nextLine();
		System.out.println("Enter Email Address");
		emailAddres = scanner.nextLine();
		System.out.println("Enter Current Address");
		currentAddress = scanner.nextLine();
		System.out.println("Is your Current address and Permanent Address same?\nEnter 1 If Yes\nEnter 2 if No");
		if (scanner.nextInt() == 1) {
			permanentAddress = currentAddress;
		} else if (scanner.nextInt() == 2) {
			System.out.println("Enter Permanent Address");
			permanentAddress = scanner.nextLine();
		} else {
			System.out.println("Invalid Input\nConsidering it as \"No\"");
			System.out.println("Enter Permanent Address");
			permanentAddress = scanner.nextLine();
		}
	}

	public void textBoxTesting(WebElement fullNameTextBox, WebElement emailAddresTextBox,
			WebElement currentAddressTextBox, WebElement permanentAddressTextBox, WebElement submitButton) {
		try {
			fullNameTextBox.sendKeys(fullName);
			emailAddresTextBox.sendKeys(emailAddres);
			currentAddressTextBox.sendKeys(currentAddress);
			permanentAddressTextBox.sendKeys(permanentAddress);
			scrollTo(driver, submitButton);
			submitButton.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
