package com.demoqa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Variables {
	// UserInputs
	public static String browserName;
	public static String elementName;

	// TextBox inputs
	public static String fullName;
	public static String emailAddres;
	public static String currentAddress;
	public static String permanentAddress;

	// TextBox Elements
	public static WebElement fullNameTextBox;
	public static WebElement emailAddresTextBox;
	public static WebElement currentAddressTextBox;
	public static WebElement permanentAddressTextBox;
	public static WebElement submitButton;

	public static WebDriver driver = null;

	// URLs
	public final String textBoxURL = "https://demoqa.com/text-box";
	public final String checkBoxURL = "https://demoqa.com/checkbox";
	public final String radioButtonURL = "https://demoqa.com/radio-button";
	public final String webTablesURL = "https://demoqa.com/webtables";
	public final String buttonsURL = "https://demoqa.com/buttons";
	public final String linksURL = "https://demoqa.com/links";
	public final String brokenLinkURL = "https://demoqa.com/broken";
	public final String uploadDownloadURL = "https://demoqa.com/upload-download";
	public final String dynamicPropertiesURL = "https://demoqa.com/dynamic-properties";

}
