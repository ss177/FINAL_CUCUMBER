package Step_defination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Step_defination_2 {
	
	WebDriver we;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
		System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/geckodriver");
	      we=new FirefoxDriver();
	      we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	   }

	@When("^User navigate to Login Page$")
	public void user_navigate_to_Login_Page()  {
		we.get("http://apps.gamonoid.com/icehrm-open/login.php?login=no");
		 we.findElement(By.name("username")).sendKeys("admin");
	     we.findElement(By.name("password")).sendKeys("admin");
	     we.findElement(By.xpath("html/body/div[1]/div[2]/div/div/form[1]/fieldset/button")).click();
	  
	}

	@Then("^Message Displayed Login Sucessfull$")
	public void message_Displayed_Login_Sucessfull() {
		System.out.println("successfull login");
	 
	}


}