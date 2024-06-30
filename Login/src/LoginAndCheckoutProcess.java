import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAndCheckoutProcess {
	WebDriver driver =new ChromeDriver();
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority =1)
	public void Login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user\r\n");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
	}
	//from ASCII code for java capital letters will run first then small letters
	@Test(priority = 2)
	public void AddtoChart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}
	@Test(priority = 3)
	public void Remove() {
		
	}
}
