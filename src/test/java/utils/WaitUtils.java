package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WaitUtils {
	private WebDriver driver;
	private WebDriverWait wait;


	public WaitUtils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}


	public void waitForVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	public void waitForClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}


	public void waitForTextPresent(WebElement element, String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}
	
	
}




