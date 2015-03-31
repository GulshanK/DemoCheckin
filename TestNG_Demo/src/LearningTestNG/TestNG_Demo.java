package LearningTestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_Demo {

	@BeforeTest
	public void LaunchBeforeTest()
	{
		System.out.println("BeforeTest Excuted");
	}
	
	@BeforeMethod
	public void OpenBrowser()
	{
		System.out.println("BeforeMethod Executed");
	}
	
	@AfterMethod
	
	public void CloseBrowser()
	{
		System.out.println("AfterMethod executed");
	}
	
	@Test (priority =1)
	public void GetNumber()
	{
		System.out.println("Get Number");
	}
	
	@Test (priority=2)
	
	public void DisplayNumber()
	{
		System.out.println("Display Number");
	}
	
	@AfterTest
	public void AfterTest_Test()
	{
		System.out.println("AfterTest Executed Number");	
	}
}
