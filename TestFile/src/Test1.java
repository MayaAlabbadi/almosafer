
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.21.0");
	}
	
	@Test
	public void myFirstTest() {
		driver.get("https://drive.google.com/drive/u/0/folders/1X22WZmxFBWei8ueGaZ7CpIio2FL7CGBw?fbclid=IwAR3s802RG-WVkczmCAhZhUw2K1mp6OscCjEHbvvrGtlUqAmGa8l9JmlFDjg");
	}

}
