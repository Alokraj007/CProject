package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initilizeBrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\CucumberProject\\CucumberProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
		}
		else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
	                "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			System.setProperty("webdriver.edge.driver",
	                "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	return driver;
	}
}
