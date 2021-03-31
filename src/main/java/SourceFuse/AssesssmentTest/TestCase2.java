package SourceFuse.AssesssmentTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import Utilities.SourceFuseBase;

public class TestCase2 extends SourceFuseBase {
	
	
 public void VerifyAllInputFieldsBySoftAssertions() throws InterruptedException{
	 	
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='fnameInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='lnameInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//input[@type='email']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='curCompanyInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//input[@type='tel']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@class='input-group date']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='positionInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//input[@value='http://']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='salaryInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//div[@id='whenStartInput']//input[@type='text']")), "tab was missing");
	 Assert.assertTrue(isElementPresent(By.xpath("//textarea[@id='address']")), "tab was missing");         
	 }   
}
