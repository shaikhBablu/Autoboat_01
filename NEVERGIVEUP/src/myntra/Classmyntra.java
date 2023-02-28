package myntra;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Classmyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions Act = new Actions(driver);
		
		WebElement womens = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Act.moveToElement(womens).perform();
		
		WebElement material = driver.findElement(By.xpath("//a[text()='Dress Materials']"));
		Act.moveToElement(material).click().perform();
		
	    WebElement logotest = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']"));
        if (logotest.isDisplayed()) {
        	System.out.println("myntra logo is displayed properly");
        }
        else {
        	System.out.println("myntra logo is not displaying properly");
        }
        	
        WebElement serching = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
        serching.sendKeys("sports shoes");
        
        WebElement dyna = driver.findElement(By.xpath("//li[text()='Sports Shoes Women']"));
        dyna.click();
        
        WebElement profiles = driver.findElement(By.xpath("//span[text()='Profile']"));
        profiles.click();
        
        WebElement myorder = driver.findElement(By.xpath("//div[@data-reactid='868']"));
        myorder.click();
        
        
        WebElement textline = driver.findElement(By.xpath("//div[text()='By continuing, I agree to the ']"));
        System.out.println(textline.getText());
        
        WebElement imgtag = driver.findElement(By.xpath("//img[@class='img-responsive preLoad loaded']"));
        if (imgtag.isDisplayed()) {
        	System.out.println("logo is present");
        }
        else {
        	System.out.println("logo is not present");
        }
        WebElement number = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
        number.sendKeys( "9637851868");
        
        WebElement newtext = driver.findElement(By.xpath("//div[@class='get-help']"));
        System.out.println(newtext.getText());
        
        WebElement fgh = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
        fgh.click();
                
        
	}
 
 		
	}


