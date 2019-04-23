package wdEventListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Runner {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

		WDEL wdel = new WDEL();
		eventDriver.register(wdel);
		eventDriver.get("http://toolsqa.com/automation-practice-switch-windows/");
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = eventDriver.findElement(By.xpath("//button[@id='alert']"));
		element.click();
		eventDriver.switchTo().alert().accept();
		element.click();
		eventDriver.switchTo().alert().dismiss();
		
	}

}
