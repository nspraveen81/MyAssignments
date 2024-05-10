package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// Load the URL-->get() -->Load a new webpage in the current browser
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to maximize the window
		
		driver.manage().window().maximize();
		
		//locate the  username text field
		
		WebElement eleUsername= driver.findElement(By.id("username"));
		
		//perform the action on the webelement
		eleUsername.sendKeys("Demosalesmanager");
		
		//enter the password in the password field
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click onthe login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to get hte title
		System.out.println(driver.getTitle());
		
		//click crmsfa link
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//click Accounts tab
		
		driver.findElement(By.linkText("Accounts")).click();
		
		//click Create Account
		
		driver.findElement(By.linkText("Create Account")).click();
		
		// enter the Account name
		
		driver.findElement(By.id("accountName")).sendKeys("Testleaf292");
		
		//enter the description 
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//select computer software as industry
		WebElement sourceInd= driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(sourceInd);
		sec.selectByIndex(3);
		
		
		WebElement ownerDD= driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(ownerDD);
		sec1.selectByVisibleText("S-Corporation");
		
		//select by using value
		WebElement employeeDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(employeeDD);
		sec2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingDD = driver.findElement(By.id("marketingCampaignId")); 
		
		Select sec3 = new Select(marketingDD);
		sec3.selectByIndex(6);
		
		WebElement provinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(provinceDD);
		sec4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
	}

}
