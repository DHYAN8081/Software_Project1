package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.LoginPage;
import utils.DriverFactory;

public class LoginTest {
WebDriver driver;
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		driver =DriverFactory.initDriver();
		driver.get("https://ums.lpu.in/lpuums/");
		loginpage=new LoginPage(driver);
	}
	
	@Test
	public void testLogin() {
		loginpage.enterUserId("12218962");
		loginpage.enterPassword("UPathak@2006");
		loginpage.clickLogin();
	}
}
