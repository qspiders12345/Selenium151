package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.ExcelLibrary;

public class POMActitimeLoginPage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 5, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 5, 1));
		keepMeLoggedInCheckbox.click();
		loginButton.click();
	}
}