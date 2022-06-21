package Practice.CucumberProject;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pageObjects.Home_Page;
import pageObjects.Sign_In_Page;
import resources.base;

public class HomePage extends base {
	
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = initilizeBrowser();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Url is triggerd");
		
	}
	
	@Test
	public void basePageNav() throws IOException {
		
	
		Home_Page hp = new Home_Page(driver);
		hp.getsignIn().click();
		Sign_In_Page sp = new Sign_In_Page(driver);
		sp.getEmail().sendKeys("er.alokraj1994@gmail.com");
		sp.getContinueBtn().click();
		sp.getPassword().sendKeys("Alok@123");
		sp.getSignInSubmit().click();
		//Assert.assertTrue(hp.getsignIn().getText(), false);
		Assert.assertEquals(hp.getsignIn().getText(), "Hello, Alok");
		log.info("Passed");
		
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.close();
		log.info("Driver closed");
	}
	

}