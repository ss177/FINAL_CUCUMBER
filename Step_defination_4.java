package Step_defination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination_4 {
	public static WebDriver we;
   
		 
	  
	@Given("^User must be login successfully$")
	public void user_must_be_login_successfully() {
		System.setProperty("webdriver.gecko.driver","/home/administrator/Desktop/geckodriver");
	    we=new FirefoxDriver();
	    we.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	    
	}

	@When("^enter \"(.*?)\" and \"(.*?)\"$")
	public void enter_and(String username, String password) {  
		we.get("http://192.168.1.17:8010/index.php?application=orders");
	  
		we.findElement(By.xpath("html/body/div[1]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys(username);
	    we.findElement(By.xpath("html/body/div[1]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys(password);
	    we.findElement(By.xpath("html/body/div[1]/form/center[2]/input")).click();
	    
	}

	@Then("^Sucessfull$")
	public void sucessfull()  {
		System.out.println("successfull login");
	  
	}
}