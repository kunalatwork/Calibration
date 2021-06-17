package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class StepDefinations {
	public WebDriver driver;
	public Properties prop;

	@Before
	public void setup() throws IOException {
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lakhan\\eclipse-workspace\\Calibration\\Data\\Config.properties");
		prop.load(fis);

		String Browser = prop.getProperty("Browser");
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(Browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		if(Browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\lakhan\\SiA-Digital\\Kiverno\\Drivers\\msedhedriver.exe");
			driver = new EdgeDriver();
		}


	}

	@Given("^Open browser and enter url$")
	public void open_browser_and_enter_url() throws Throwable {
		String URL = prop.getProperty("URL");
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Then("^Check Login with valid username & password$")
	public void check_Login_with_valid_username_password() throws Throwable {
		String Username = prop.getProperty("Username");
		String Password =prop.getProperty("Password");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='submit']")).click();
	}

	@Then("^fill all required fields$")
	public void fill_all_required_fields() throws Throwable {
		
		// Calibration_Detail
		String HiA_Call= prop.getProperty("HiA_Call");
		String Client_Call_Name= prop.getProperty("Client_Call_Name");
		String Approved_Code= prop.getProperty("Approved_Code");
		String Video_URL= prop.getProperty("Video_URL");
		
		
		//Video_Cue_Point
		String Pre_Call_Start_Time= prop.getProperty("Pre_Call_Start_Time");
		String Pre_Call_End_Time= prop.getProperty("Pre_Call_End_Time");

		String In_Call_Start_Time= prop.getProperty("In_Call_Start_Time");
		String In_Call_End_Time= prop.getProperty("In_Call_End_Time");
		
		
		String Include_ABPI= prop.getProperty("Include_ABPI");
		String Include_FeedBack= prop.getProperty("Include_FeedBack");
		String Include_Best_Practices= prop.getProperty("Include_Best_Practices");
		
		String ImportCalibation= prop.getProperty("ImportCalibation");
		
		String Notification_UserEmail= prop.getProperty("Notification_UserEmail");
		String Client= prop.getProperty("Client");
		String Status= prop.getProperty("Status");
		
		String Thresholds_Red_In= prop.getProperty("Thresholds_Red_In");
		String Thresholds_Red_End= prop.getProperty("Thresholds_Red_End");
		
		String Thresholds_Amber_In= prop.getProperty("Thresholds_Amber_In");
		String Thresholds_Amber_End= prop.getProperty("Thresholds_Amber_End");
		
		String Thresholds_Green_In= prop.getProperty("Thresholds_Green_In");
        String Thresholds_Green_End= prop.getProperty("Thresholds_Green_End");
		
		String OverRide= prop.getProperty("OverRide");


		//HiA Call Name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbHiACallName']")).sendKeys(HiA_Call);
		
		// Client Call Name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbClientCallName']")).sendKeys(Client_Call_Name);
		
		//Approved Code
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbAprovedCode']")).sendKeys(Approved_Code);
		
		// Video URL
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbVideoURL']")).sendKeys(Video_URL);
		
		//Pre Call - Start Time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbPreCallStartTime']")).sendKeys(Pre_Call_Start_Time);
		
		// Pre Call - End Time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbPreCallSEndTime']")).sendKeys(Pre_Call_End_Time);
		
		// In Call - Start Time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbInCallStartTime']")).sendKeys(In_Call_Start_Time);
		
		// In Call  - End Time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbInCallEndTime']")).sendKeys(In_Call_End_Time);
		
		// Include ABPI
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cbABPI']")).click();
		
		// Include FeedBack
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cbFeedback']")).click();
		
		// Include Best Practices 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='cbBestPracticePage']")).click();
		
		// Import Calibration
		Thread.sleep(2000);
		WebElement ChooseCalib = driver.findElement(By.xpath("//select[@id='sImportCalibration']"));
		Select selectCalib = new Select(ChooseCalib);
		selectCalib.selectByVisibleText("");
		
		// Import Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'ImportAll')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-bind='click:$root.ImportCalibration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbUserEmails']")).sendKeys("");
		Thread.sleep(2000);
		
		WebElement ChooseClient = driver.findElement(By.xpath("//select[@id='sClient']"));
		Select selectClient = new Select(ChooseClient);
		selectClient.selectByVisibleText(Client);
		Thread.sleep(2000);
		
		WebElement ChooseStatus = driver.findElement(By.xpath("//select[@id='sStatus']"));
		Select SelectStatus = new Select(ChooseStatus);
		SelectStatus.selectByVisibleText(Status);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='tbRedFrom']")).sendKeys(Thresholds_Red_In);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbRedTo']")).sendKeys(Thresholds_Red_End);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbAmberFrom']")).sendKeys(Thresholds_Amber_In);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbAmberTo']")).sendKeys(Thresholds_Amber_End);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbGreenFrom']")).sendKeys(Thresholds_Green_In);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbGreenTO']")).sendKeys(Thresholds_Green_End);
		Thread.sleep(2000);
		
		if(OverRide.equalsIgnoreCase("Yes")) {
		driver.findElement(By.xpath("//input[@id='cbOverideColors']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dbExpiryDatealert']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tbSalesModel']")).click();
		
		
		
		
	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
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
