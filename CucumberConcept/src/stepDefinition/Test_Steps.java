package stepDefinition;
 
import java.util.concurrent.TimeUnit;
 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 


import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
		}
 
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
		}
 
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("enamsust@gmail.com");
		driver.findElement(By.id("next")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("Passwd")).sendKeys("2138417273");
		driver.findElement(By.id("signIn")).click();
		
		}
 
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
 
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		Thread.sleep(1000);

		driver.findElement(
				By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a/span"))
				.click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();

	}
 
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}
	
	@Then("^Browser close$")
	public void Browser_close() throws Throwable {
	    driver.quit();
	}
}



