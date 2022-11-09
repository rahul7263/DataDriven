package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	@DataProvider(name="Credentials")
	public Object getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="Admin1";
		data[0][1]="admin123";
		
		data[1][0]="Admin2";
		data[1][1]="admin123";
		
		data[2][0]="Admin";
		data[2][1]="admin123";
		
		return data;
	}
}
