package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;

public class DataDrivenTest extends BaseClass {
         
	     
	    @Test(dataProvider="Credentials1")
	    public void logintest(String username, String password) {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String actualURL = driver.getCurrentUrl();
		String exceptedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		Assert.assertEquals(actualURL,exceptedURL);
	}
}
