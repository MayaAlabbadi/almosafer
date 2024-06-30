import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
	
	@Test
	public void myFirstTest(){
		String myURL="https://global.almosafer.com/en";
		WebDriver driver = new ChromeDriver();
		
		driver.get(myURL); 
		driver.getTitle().toUpperCase(); // string methods
		System.out.println(driver.getTitle().toUpperCase());
		
		//if i want to get the first alpha i use .charAt(n) : (character at)
		System.out.println(driver.getTitle().toUpperCase().charAt(0)); //G
		
		
		//how to check is the website is in arabic or english in the url (ar):arabic,(en):english
		System.out.println(driver.getCurrentUrl().contains("ar")); //does the url contains ar? T or F
	}

}
