package wdEventListener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

		WDEL wdel = new WDEL();
		eventDriver.register(wdel);
		eventDriver.manage().window().maximize();
		eventDriver.get("http://toolsqa.com/automation-practice-switch-windows/");
		eventDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element = eventDriver.findElement(By.xpath("//button[@id='alert']"));
		element.click();
		eventDriver.switchTo().alert().accept();
		element.click();
		eventDriver.switchTo().alert().dismiss();
		eventDriver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dayDropdown=eventDriver.findElement(By.xpath("//select[@id='select-demo']"));
		Select mySelect=new Select(dayDropdown);
		mySelect.selectByIndex(3);
		
	}

}
