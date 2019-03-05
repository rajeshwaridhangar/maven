package mt.mstr.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mercurycucumberdemo {
	public WebDriver driver;
	
	
	@When("^user opens \"(.*)\" browser$")
	public String openbrowser(String browser)
	{
			System.out.println("openbrowser");
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32 (14)\\chromedriver.exe");
		 driver=new ChromeDriver();
		return browser;
		
	}
	@When("^user enters the application url \"([^\"]*)\"$")
	public void user_enters_the_application_url(String url)  {
		driver.get("http://newtours.demoaut.com/");
		System.out.println("Url entered successfully");
	    
	}

	@When("^user waits \"([^\"]*)\" seconds to load login page$")
	public void user_waits_seconds_to_load_login_page(int timeout)
	{
		driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
	    
	}

	@When("^user maximizes login page$")
	public void user_maximizes_login_page()  {
	   driver.manage().window().maximize();
	  System.out.println("maxixmize successfull");
	}

	@Then("^Mercury Tours application login page should be displayed$")
	public void mercury_Tours_application_login_page_should_be_displayed()  {
	 String act_title=driver.getTitle();
	 if(act_title.equalsIgnoreCase("Welcome : Mercury Tours"))
	 {
		 System.out.println("user is on login page");
	 }
	 
	}


	@Given("^user access login page of Mercury tours application$")
	public void user_access_login_page_of_Mercury_tours_application()  {
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://newtours.demoaut.com/"))
		{
			System.out.println("user is on currrent url page");
			
		}
	  
	  
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public String user_enters_as_username(String uname)  {
	   
	   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uname);
	   return uname;
	   
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public String user_enters_as_password(String pwd) {
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	    return pwd;
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button()  {
		
	   driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	@Then("^user is on flight finder page$")
	public void user_is_on_flight_finder_page() {
	  String title1= driver.getTitle();
	  if(title1.equalsIgnoreCase("Find a Flight : Mercury Tours: "));
	  {
		  System.out.println("Flight finder page is verified");
	  }
	}

	@When("^user clicks on sign off link$")
	public void user_clicks_on_sign_off_link() {
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@Then("^user access sign on page$")
	public void user_access_sign_on_page()  {
		String title2= driver.getTitle();
		if(title2.equalsIgnoreCase("Sign-on: Mercury Tours"))
		{
			System.out.println("user is on sign on page");
		}
	   
	}

}
	