package wdEventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WDEL implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Before Alert Accepted");

	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("After Alert  accepted");

	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("After Alert Dismissed");

	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Before Alert is dismissed");

	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigation to : " + url);

	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigation to : " + url);

	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigation Back : " );

	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigation Back : " );

	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigation Forward : " );

	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Before Navigation Forward : " );

	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Navigation Refresh : " );

	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Navigation Refresh : " );

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before FindBy");

	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After FindBy");

	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before ClickOn");

	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After ClickOn");

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before ChangeValueOf");

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After ChangeValueOf");

	}

	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Script");

	}

	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Script");

	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before Switch To Window");

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("After Switch To Window");

	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("OnException");

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		System.out.println("Before Get ScreenshotAs");

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		System.out.println("After Get ScreenshotAs");

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Before Get Text");

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After GetText");

	}

}
