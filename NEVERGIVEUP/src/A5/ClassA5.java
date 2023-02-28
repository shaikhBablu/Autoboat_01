package A5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ifrm = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(ifrm);
		
        WebElement press = driver.findElement(By.xpath("//button[text()='Click Me!']"));		
		press.click();
		
		Alert alt = driver.switchTo().alert();
		String alerttext = alt.getText();
		alt.accept();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.switchTo().parentFrame();
		
		WebElement menu = driver.findElement(By.xpath("//a[@id='menuButton']"));
		menu.click();
		
		
		
	}

}
