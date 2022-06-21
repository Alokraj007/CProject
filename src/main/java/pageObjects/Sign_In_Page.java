package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_In_Page {
	
	public WebDriver driver;
	
	By email= By.id("ap_email");
	
	By continueBtn= By.id("continue");
	
	By password= By.id("ap_password");
	
	By signInSubmit= By.id("signInSubmit");
	
	
	public Sign_In_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getContinueBtn()
	{
		return driver.findElement(continueBtn);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSignInSubmit()
	{
		return driver.findElement(signInSubmit);
	}
	
}