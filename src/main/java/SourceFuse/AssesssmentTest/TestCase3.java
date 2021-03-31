package SourceFuse.AssesssmentTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import Utilities.SourceFuseBase;

public class TestCase3 extends SourceFuseBase {
	
	
	 public void VerifyAllInputFieldsByHardAssertions() throws InterruptedException{
		 	String actual = "Tab is Missing";
		 	boolean expected1 = driver.findElement(By.xpath("//div[@id='fnameInput']//input[@type='text']")).isEnabled();
		 	boolean expected2 = driver.findElement(By.xpath("//div[@id='lnameInput']//input[@type='text']")).isEnabled();
		 	boolean expected3 = driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
		 	boolean expected4 = driver.findElement(By.xpath("//div[@id='curCompanyInput']//input[@type='text']")).isEnabled();
		 	boolean expected5 = driver.findElement(By.xpath("//input[@type='tel']\")), \"tab was missing")).isEnabled();
		 	boolean expected6 = driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).isEnabled();
		 	boolean expected7 = driver.findElement(By.xpath("//div[@id='positionInput']//input[@type='text']")).isEnabled();
		 	boolean expected8 = driver.findElement(By.xpath("//input[@value='http://']")).isEnabled();
		 	boolean expected9 = driver.findElement(By.xpath("//div[@id='salaryInput']//input[@type='text']")).isEnabled();
		 	boolean expected10 = driver.findElement(By.xpath("//div[@id='whenStartInput']//input[@type='text']")).isEnabled();
		 	boolean expected11 = driver.findElement(By.xpath("//textarea[@id='address']")).isEnabled();
		 	Assert.assertEquals(actual, expected1);
		 	Assert.assertEquals(actual, expected2);
		 	Assert.assertEquals(actual, expected3);
		 	Assert.assertEquals(actual, expected4);
		 	Assert.assertEquals(actual, expected5);
		 	Assert.assertEquals(actual, expected6);
		 	Assert.assertEquals(actual, expected7);
		 	Assert.assertEquals(actual, expected8);
		 	Assert.assertEquals(actual, expected9);
		 	Assert.assertEquals(actual, expected10);
		 	Assert.assertEquals(actual, expected11);
		        
		 }   

}
