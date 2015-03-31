package LearningTestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GridTest {

	WebDriver Driver;
	@Test
	public void TestRunner(){
		Driver.get("https://www.google.co.in/?gws_rd=ssl");
		System.out.println("Test Completed");
	}
	@BeforeTest
	public void SetCapabality() throws MalformedURLException{
		System.out.println("Test Started");
		DesiredCapabilities capability = DesiredCapabilities.chrome(); 
		WebDriver Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		System.out.println("Test Completed");
	}
}
