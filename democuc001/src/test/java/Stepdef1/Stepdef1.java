package Stepdef1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef1 {
	
	ChromeDriver driver = new ChromeDriver();
	
	
	@Given("I'm on the Chrome Browser")
	public void i_m_on_the_chrome_browser() {
		driver.manage().window().maximize();
	    
	}

	@When("Entering the URL")
	public void entering_the_url() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
		

	   
	}

	@Then("Enter Customer Data")
	public void enter_customer_data() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mohamed");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ejas");
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("600017");
	}

	@And("Click on the Submit")
	public void click_on_the_submit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().alert().accept();
	    
	}


}
