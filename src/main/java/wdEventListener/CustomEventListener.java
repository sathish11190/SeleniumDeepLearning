package wdEventListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public interface CustomEventListener extends WebDriverEventListener{
	
	void beforeSelectDropdown(WebElement element,WebDriver driver);
	void afterSelectDropdown(WebElement element,WebDriver driver);

}
