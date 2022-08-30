package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SteopDef {
	
	WebDriver driver;



@Given("^user is in login page$")
public void user_is_in_login_page()  {
System.setProperty("webdriver.chrome.driver", "/Users/amarnadhguntur/Documents/Driver/chromedriver 4");
driver = new ChromeDriver();
driver.get("https://ui.freecrm.com/");
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println("First Step : Browser launched");
  
}

@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_username_and_password(String username , String password) {
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	System.out.println("Second step : UserName and Password accepted Successfully");
}

@Then("^user clicks on login Button$")
public void user_clicks_on_login_Button() {
WebElement loginBtn =driver.findElement(By.xpath("//div[@class ='ui fluid large blue submit button']"));
loginBtn.click();
String Homepagetitle=driver.getTitle();
System.out.println(Homepagetitle);
String Actualtitle = "Cogmento CRM";
Assert.assertEquals(Actualtitle, Homepagetitle);
System.out.println("Third Step: User is Cogmento CRM Home Page");
}

@Then("^user naviagtes to Home page$")
public void user_naviagtes_to_Home_page() {
	String Home =driver.getTitle();
	System.out.println(Home);
	String Actual = "Cogmento CRM";
	Assert.assertEquals(Actual, Home);
	System.out.println("Fourth Step :User is Cogmento CRM Home Page and title validation successful");
	
}

@Then("^user closes the Browser$")
public void user_closes_the_Browser() {
	driver.quit();
	System.out.println("Fifth Step:Driver closed the Browser");
}



}
