package SourceFuse.AssesssmentTest;

import org.openqa.selenium.By;
import Utilities.SourceFuseBase;

public class TestCase4 extends SourceFuseBase {
	
	 public void SubmitForm() throws InterruptedException{
		 	
		  driver.findElement(By.xpath("//div[@id='fnameInput']//input[@type='text']")).sendKeys("Jack");
		  driver.findElement(By.xpath("//div[@id='lnameInput']//input[@type='text']")).sendKeys("Mark");
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Jack@test.com");
		  driver.findElement(By.xpath("//div[@id='curCompanyInput']//input[@type='text']")).sendKeys("Techno");
		  driver.findElement(By.xpath("//input[@type='tel']\")), \"tab was missing")).sendKeys("98888888888");
		  driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).sendKeys("02/25/1993");
		  driver.findElement(By.xpath("//div[@id='positionInput']//input[@type='text']")).sendKeys("Automation");
		  driver.findElement(By.xpath("//input[@value='http://']")).sendKeys("abc.in");
		  driver.findElement(By.xpath("//div[@id='salaryInput']//input[@type='text']")).sendKeys("9 Lac PA");
		  driver.findElement(By.xpath("//div[@id='whenStartInput']//input[@type='text']")).sendKeys("ASAP");
		  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Una Himachal Pardesh");
		  driver.findElement(By.xpath("//input[@id='resume']")).sendKeys("C:/Users/lenovo/Desktop/imp notes.txt");
		  driver.findElement(By.xpath("//input[@id='yes']")).click();
		  driver.findElement(By.xpath("	//button[normalize-space()='Submit Form']")).click();
	
     }
}

