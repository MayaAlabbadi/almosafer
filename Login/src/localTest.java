import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class localTest {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		
	}

	@Test
	public void myTest() {
		
		System.out.println(driver.findElement(By.xpath("//li[@test_id='gethubpage']")).getText());
		System.out.println(driver.findElement(By.name("Helloo")).getText());
	}


}
