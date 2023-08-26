package com.demoqa.testcases;

import java.util.Scanner;

import org.openqa.selenium.By;

import com.demoqa.base.TestBase;

public class TestCase1 extends TestBase {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		TestBase testBaseObject = new TestBase();

		// Get User Inputs
		System.out.println("Enter the Browser Name\n1.Chrome\n2.Edge");
		browserName = scanner.nextLine();

		// Get User Inputs for Testing the Element
		System.out.println("Enter the Element name that you want to test");
		System.out.println(
				"1. Text Box\n2.Check Box\n3.Radio Button\n4.Web Tables\n5.Buttons\n6.Links\n7.Broken Links - Images\n8.Upload and Download"
						+ "\n9.Dynamic Properties");
		elementName = scanner.nextLine();

		// Get the input for TextBox(As of now we have implemented only for Text Box)
		if (elementName.equalsIgnoreCase("Text Box")) {
			testBaseObject.getInput(scanner);
		}

		// Initialize the Web Browser
		driver = testBaseObject.initializeBrowser(browserName);

		// Maximize the window
		driver.manage().window().maximize();

		// Open the web page
		testBaseObject.openWebPage(driver, elementName);

		// Test TextBox
		if (elementName.equalsIgnoreCase("Text Box")) {
			fullNameTextBox = driver.findElement(By.xpath("//input[@id='userName']"));
			emailAddresTextBox = driver.findElement(By.xpath("//input[@id='userEmail']"));
			currentAddressTextBox = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
			permanentAddressTextBox = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
			submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
			testBaseObject.textBoxTesting(fullNameTextBox, emailAddresTextBox, currentAddressTextBox,
					permanentAddressTextBox, submitButton);
		}

		scanner.close();
		driver.quit();
	}

}
