import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class JavaBasics {
 WebDriver driver =new ChromeDriver();
 String theURL ="https://www.google.com";
 String ExpectedTitle ="Google"; //what i want
 
 
 
 @Test(description = "yalla nsawi test", invocationCount = 10) //the second one is to do the test n time
 
 public void VerifythatThetestIsGoogle() {
	 driver.get(theURL);
	 String TheActualTest =driver.getTitle(); //we get the text
	 System.out.println(TheActualTest);
	 
	 Assert.assertEquals(TheActualTest,ExpectedTitle); // to compare
	 
 }
	
	
}
//website:W3school very helpful
//testoutput -> index to html to see al details