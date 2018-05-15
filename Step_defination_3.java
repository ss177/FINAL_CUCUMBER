package Step_defination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination_3 {
	WebDriver we;
	@Given("^User Must be Logged in the Account$")
	public void user_Must_be_Logged_in_the_Account()  {
		System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/geckodriver");
	      we=new FirefoxDriver();
	      we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	  	we.get("http://apps.gamonoid.com/icehrm-open/login.php?login=no");
		 we.findElement(By.name("username")).sendKeys("admin");
	     we.findElement(By.name("password")).sendKeys("admin");
	     we.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form[1]/fieldset/button")).click();
	    
	}

	@When("^User clicks on logout$")
	public void user_clicks_on_Admin() throws InterruptedException  {
		Thread.sleep(5000);
		we.findElement(By.xpath("html/body/header/nav/div[2]/ul/li[4]/a/span")).click();
		 we.findElement(By.xpath("html/body/header/nav/div[2]/ul/li[4]/ul/li[2]/div[2]/a")).click();
	
	   	  
	}

	@Then("^Message Displayed logout succesfully$")
	public void message_Displayed_logout_succesfully()  {
	  System.out.println("logout successfully");
	   
	}
}