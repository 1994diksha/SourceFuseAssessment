package SourceFuse.AssesssmentTest;

import java.net.MalformedURLException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utilities.SourceFuseBase;

public class SourceFuseTest extends SourceFuseBase {
	
	TestCase1 Test1 = new TestCase1();
	TestCase2 Test2 = new TestCase2();
	TestCase3 Test3 = new TestCase3();
	TestCase4 Test4 = new TestCase4();
	TestCase5 Test5 = new TestCase5();
	TestCase6 Test6 = new TestCase6();
	
	 @BeforeSuite
	 public void Setup()
	 {
		 
		 SourceFuseBase.GenerateReport();
	 }
	  
	 @BeforeTest
	 public void Launch() throws MalformedURLException 
	 {
		   
		 SourceFuseBase.SetUpChromeDriver();
		 
	 }
	 
	 @Test(priority=1)
	   public void TestCase1() throws InterruptedException, MalformedURLException
	   {
		  test = extent.createTest(" Testcase For SubmitFormWithoutRequireFields ");
		  Test1.SubmitFormWithoutRequireFields();
	   }

	 @Test(priority=2)
	   public void TestCase2() throws InterruptedException, MalformedURLException
	   {
		  test = extent.createTest(" Testcase For VerifyAllInputFieldsBySoftAssertions");
		  Test2.VerifyAllInputFieldsBySoftAssertions();
	   }
	 @Test(priority=3)
	   public void TestCase3() throws InterruptedException, MalformedURLException
	   {
		  test = extent.createTest(" Testcase For VerifyAllInputFieldsByHardAssertions");
		  Test3.VerifyAllInputFieldsByHardAssertions();
	   }
	 @Test(priority=4)
	   public void TestCase4() throws InterruptedException, MalformedURLException
	   {
		  test = extent.createTest(" Testcase For Edit Profile");
		  Test4.SubmitForm();
	   }
	 @Test(priority=5)
	   public void TestCase5() throws InterruptedException, MalformedURLException
	   {
		  test = extent.createTest(" Testcase For VerifyDBentry");
		  Test5.VerifyDBentry();
	   }
}
