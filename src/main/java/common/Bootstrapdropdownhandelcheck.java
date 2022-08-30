package common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdownhandelcheck {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/amarnadhguntur/Documents/Driver/chromedriver 4");
WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
 List<WebElement> listelment=driver.findElements(By.xpath("//ul[@role='menu']//li//a"));
 
 int Listsize=listelment.size();
 System.out.println(Listsize);
 
 for(int i=0;i<Listsize;i++) {
	 String Bootstrpelement=listelment.get(i).getText();
	 System.out.println("Elements are "+"  "+Bootstrpelement );
	 if(Bootstrpelement.contains("JavaScript")) {
		 System.out.println("Element located");
	continue;
	 

}
 }
	}
}