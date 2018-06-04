package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C://Users//nishanth.shanmugasun//Desktop//Automate//Automation Softwares//chromedriver_win32//chromedriver.exe"); 
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/clientarea.php");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("inputFirstName")).sendKeys("Roman");
        driver.findElement(By.id("inputLastName")).sendKeys("QA");
        driver.findElement(By.id("inputEmail")).sendKeys("romannish.qa22@gmail.com");
        driver.findElement(By.id("inputCompanyName")).sendKeys("Blindspot");
        driver.findElement(By.id("inputAddress1")).sendKeys("Poonamallee");
        driver.findElement(By.id("inputAddress2")).sendKeys("Velachery");
        driver.findElement(By.id("inputCity")).sendKeys("Chennai");
        driver.findElement(By.id("stateinput")).sendKeys("Tmail Nadu");
        driver.findElement(By.id("inputPostcode")).sendKeys("600099");
        //driver.findElement(By.name("country"))).drpCountry.selectByVisibleText("India");
        //driver.findElement(By.id("inputCountry")).selectbyvalue ("India");
        driver.findElement(By.id("stateinput")).sendKeys("Tamil Nadu");
        driver.findElement(By.id("customfield1")).sendKeys("Google");
        Select Country = new Select(driver.findElement(By.id("inputCountry"))); // To get value from Dropdown
        Country.selectByVisibleText("India");
        driver.findElement(By.id ("inputPhone")).sendKeys("9999900000");
        driver.findElement(By.id ("customfield2")).sendKeys("9999900000");
        driver.findElement(By.id("inputNewPassword1")).sendKeys("909090909");
        driver.findElement(By.id("inputNewPassword2")).sendKeys("909090909");
        
        //Select State = new Select(driver.findElement(By.id("stateinput")));
        //State.selectByVisibleText("Tamil Nadu");
      //Thread.sleep(1000);
        
        
      //  driver.quit();
        
	}
		// driver.findElement(By.id("inputEmail")).sendKeys("new");
		// driver.findElement(By.id("inputPassword")).sendKeys("New");
		// driver.findElement(By.id("login")).click();
	
		
		
	
}