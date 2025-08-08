package Page;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	By UserIdField=By.xpath("//input[@placeholder='User ID']");
	By PasswordField=By.xpath("//input[@placeholder='Password']");
	By LoginButton=By.xpath("//input[@id='iBtnLogins150203125']");
	
	// Make Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	// I Create Method for the user Id filed 
	public void enterUserId(String userId) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(UserIdField));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='" + userId + "';", driver.findElement(UserIdField));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	// I Create Method for the Password Field
    public void enterPassword(String password) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='" + password + "';", driver.findElement(PasswordField));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // I Create Method for the LoginButton.
    public void clickLogin() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", driver.findElement(LoginButton));
        } catch (Exception e) {
            e.printStackTrace();
        
        }
    }
}
