package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
	
@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class atureport

{
	
   {
	System.setProperty("atu.reporter.config","D:\\project\\webjava\\atu.properties");
   }
		
  @DataProvider (name="p1")
  public String[][] login_data()
  {
	return new String[][] {{"venkat123456a","assd"},{"venkat123456a","mq123456"},{"venkat123"," "}};
  }

  @Test(dataProvider="p1")
  public void login(String uid,String pwd) throws Exception
	{
	  FirefoxDriver fd=new FirefoxDriver();
	  fd.get("http://www.yahoomail.com");
		
	  fd.findElement(By.name("username")).sendKeys(uid);
	  fd.findElement(By.name("passwd")).sendKeys(pwd);
	  fd.findElement(By.name("signin")).click();
	  Thread.sleep(5000);
	try
	{
		if(fd.findElement(By.linkText("Sign Out")).isDisplayed())
		{
			ATUReports.add("Login is success",LogAs.PASSED,new CaptureScreen(ScreenshotOf.DESKTOP));
			fd.findElement(By.linkText("Sign Out")).click();
		}
	}
	catch(Exception e)
	{
		String str=fd.findElement(By.xpath("//*[@id='mbr-login-error']")).getText();
		ATUReports.add("Login is failed "+str,LogAs.FAILED,new CaptureScreen(ScreenshotOf.DESKTOP));
		
	}
	fd.close();

	}
}
	



