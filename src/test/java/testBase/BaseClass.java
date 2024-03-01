package testBase;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	
    @BeforeClass
	public void setUP() {
    	logger=LogManager.getLogger(this.getClass());
   // WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	
    	driver.get("http://localhost/opencart/upload/");
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
}
