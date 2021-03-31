package SourceFuse.AssesssmentTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.SourceFuseBase;

public class TestCase1 extends SourceFuseBase{
	
	
	 public void SubmitFormWithoutRequireFields() throws InterruptedException{
		 	 
		 driver.findElement(By.cssSelector("div[id='whenStartInput'] input[type='text']")).sendKeys("Can Join As Soon As Possible");
		 driver.findElement(By.cssSelector("#address")).sendKeys("Sunny Enclave Mohali");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		 List<WebElement> list = driver.findElements(By.xpath("//span[@class = 'required']//..//..//label"));

         for(int i=0;i<list.size();i++){
             Thread.sleep(2000);
             String name =  list.get(i).getText();
           
            System.out.println(name);

           }
	
	 }
}
