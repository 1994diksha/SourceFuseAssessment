package Utilities;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class SourceFuseBase {
	
	  public static WebDriver driver = new ChromeDriver();
	  public static ExtentHtmlReporter htmlReporter;
      public static ExtentReports extent;
	  public static ExtentTest test;
		 
	  public static void SetUpChromeDriver() throws MalformedURLException
		 {
		  
		  System.setProperty("webdriver.chrome.driver","/home/Desktop/chrome32/chromedriver");
		  driver.get("http://sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
			 
		 }
	  
	  public static  void GenerateReport() 
	    {
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/SourceFuseTestReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);         
	        extent.setSystemInfo("OS", "Windows Microsoft 10");
	        extent.setSystemInfo("Host Name", "Harpreet Singh");
	        extent.setSystemInfo("Browser", "Chrome 89.0");
	        extent.setSystemInfo("User Name", "Harpreet Singh");        
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("SourceFuse Assessment Test");
	        htmlReporter.config().setReportName("SourceFuse Test Report");
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.DARK);	  	   
	    }
	  
	  public static boolean isElementPresent(By by) {
		    try {
		        driver.findElement(by);
		        return true;
		    } catch (NoSuchElementException e) {
		        return false;
		    }
		}
	  
	  public static void getResult(ITestResult result)
	   {
	       if(result.getStatus() == ITestResult.FAILURE)
	       {
	           test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	           test.fail(result.getThrowable());
	       }
	       else if(result.getStatus() == ITestResult.SUCCESS)
	       {
	           test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	       }
	       else
	       {
	           test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	           test.skip(result.getThrowable());
	       }
	   }
}
