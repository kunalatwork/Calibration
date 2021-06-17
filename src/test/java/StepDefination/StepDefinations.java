package StepDefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class StepDefinations {
	public WebDriver driver;
	public Properties prop;
	
	@Before
	public void setup() throws IOException {
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\TestData\\Config.properties");
		prop.load(fis);

		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\msedhedriver.exe");
			driver = new EdgeDriver();
		}
		
	
	}

	@Given("^Open browser and enter url$")
	public void open_browser_and_enter_url() throws Throwable {
		driver.get("https://testingadvance.advancesfe.com/");
		driver.manage().window().maximize();
	}

	@Then("^Check Login with valid username & password$")
	public void check_Login_with_valid_username_password() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("df");
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("");
	  driver.findElement(By.xpath("//input[@id='submit']")).click();
	}

	@Then("^fill all required fields$")
	public void fill_all_required_fields() throws Throwable {
		 driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).sendKeys("");
		  driver.findElement(By.xpath("")).click();
	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		 driver.findElement(By.xpath("")).click();
	}

	@Then("^check Welcome contect page and fill data$")
	public void check_Welcome_contect_page_and_fill_data() throws Throwable {
	 
	}

	@Then("^Check Background info$")
	public void check_Background_info() throws Throwable {
	
	}

	@Then("^Fill Pre Call Data$")
	public void fill_Pre_Call_Data() throws Throwable {
	 
	}

	@Then("^Choose Correct Answers$")
	public void choose_Correct_Answers() throws Throwable {
	 
	}

	@Then("^Fill FeedBack and Best Practice If required\\.$")
	public void fill_FeedBack_and_Best_Practice_If_required() throws Throwable {
	  
	}

	@Then("^Add Recommendations$")
	public void add_Recommendations() throws Throwable {
	  
	}

	@Then("^Enter valid Event name and Select Client$")
	public void enter_valid_Event_name_and_Select_Client() throws Throwable {
	  
	}

	@Then("^Select Calibration and fill Calibration window$")
	public void select_Calibration_and_fill_Calibration_window() throws Throwable {
	  
	}

	@Then("^Select user and click on save button$")
	public void select_user_and_click_on_save_button() throws Throwable {
	 
	}
}
