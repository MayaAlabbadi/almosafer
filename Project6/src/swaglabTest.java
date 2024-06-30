import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class swaglabTest {
	 
	 WebDriver driver =new ChromeDriver();
	
	 @BeforeTest
	 public void mySetup() throws InterruptedException {
		 String theURL ="https://www.saucedemo.com/";
	 driver.get(theURL); 
	 }
	 
	 
	 @Test(priority = 1)
	 public void Login() throws InterruptedException {
		 WebElement UserName =driver.findElement(By.id("user-name"));
		 WebElement PasswordInput =driver.findElement(By.id("password"));
		 WebElement LogInButton =driver.findElement(By.id("login-button"));
		 
		 UserName.sendKeys("standard_user");
		 PasswordInput.sendKeys("secret_sauce");
		 LogInButton.click();
		 
	 }
	 
	 @Test(priority = 2)
	 
	 public void VerifythatTheWordProductisthere() {
		 
		 //this code is better why? if they change the word the code will not change
		 WebElement theMainNameOntheWebsite =driver.findElement(By.xpath("//span[@data-test='title']"));
		 boolean istheElementThere = theMainNameOntheWebsite.isDisplayed(); //this is actual
		 boolean expectedResult = true;
		 Assert.assertEquals(istheElementThere, expectedResult);
		 
		 
		           //This code is true but there is an easier way
		//String ExpectedValue ="Products";
		//String ActualValue=driver.findElement(By.xpath("//span[@data-test='title']")).getText(); 
        //Assert.assertEquals(ActualValue,ExpectedValue);
        
      
		  }
	 
	 @Test(priority = 3)
     public void SortingItems(){
		 
		 WebElement sort = driver.findElement(By.className("product_sort_container"));
		Select mySelector = new Select(sort); // here we are selecting the element but we are not using it
		mySelector.selectByValue("lohi");
		//mySelector.selectbyVisibleText("Price(low to high)"); --> this is another option
		//mySelector.selectbyIndex(3) --> another way
		
	 }
	 
	 @Test(priority =4)
	 public void PriceTest() {
		
		 
		 List<WebElement> ThePrices =driver.findElements(By.className("inventory_item_price")) ;  //All prices MUST be the same class name ,, "attribute"-> xpath
		   String HighestPriceAStext = ThePrices.getLast().getText().replace("$","");
		    String LowestPriceAStext = ThePrices.getFirst().getText().replace("$","");//replace the dollar sign with nthn
		double TheHighestPrice =  Double.parseDouble(LowestPriceAStext) (HighestPriceAStext); 
		double TheLowesttPrice = Double.parseDouble(LowestPriceAStext); //return the string as a number
		
		boolean expectedValue =true;
		Assert.assertEquals(TheHighestPrice>TheLowesttPrice, expectedValue);
	


}

		 
		 //String ExpectedLowestPrice = "$7.99"; 
		 
	   //List<WebElement> theprices = driver.findElements(By.className("inventory_item_price")); // we used Elements because the class name and xpath are the same for all 6 elements so, to get the fisrt element we used the list with for loop
	   //System.out.println(theprices.size());
	   
	   //for(int i=0 ; i< theprices.size() ; i++) {
		 //  StringActualLowestPrice = theprices.get(0).getText(); // to get the last element instead of zero we write (thePrices.suze()-1)
		   
		  // Assert.assertEquals(ActualLowestPrice,ExpectedLowestPrice) ; //
		   
		  
	   }
	    
	 
	 
	 
	 
