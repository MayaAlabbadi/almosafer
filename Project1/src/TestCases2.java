import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases2 {
WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		  driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void myTest() {
		//lesson 5
		
	}

}
