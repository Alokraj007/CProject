package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	public WebDriver driver;
	
	By signIn= By.id("nav-link-accountList-nav-line-1");
	
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getsignIn()
	{
		return driver.findElement(signIn);
	}
	
	
}
