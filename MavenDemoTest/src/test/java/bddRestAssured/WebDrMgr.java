package bddRestAssured;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;




public class WebDrMgr {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
// ChromeOptions Options = new ChromeOptions();
driver.get("https://www.google.com/");

		
			
		/*WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();*/

			
		driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);	
			
	driver.findElement(By.linkText("Gmail")).click();
		
		
		//@FindBy(how = How.CLASS_NAME, using = "NKcBbd");

		
		
				//*[@id="prm"]/div/a
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.phantomjs().setup();
		//WebDriverManager.edgedriver().setup();
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--incognito"); */

		

	}

}
