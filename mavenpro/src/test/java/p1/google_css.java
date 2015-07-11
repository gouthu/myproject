package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.selenium.SeleneseTestNgHelper;

public class google_css 
{
	public static void main(String[] args) throws Exception 
	{
	 SeleneseTestNgHelper st=new SeleneseTestNgHelper();	
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.get("http://www.google.com");
	 
     driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("selenium");
	 driver.findElement(By.cssSelector("button[name='btnG']")).click();
	 Thread.sleep(3000);
	 
	 //st.assertEquals(driver.findElement(By.xpath("//*[@class='med _kk _wI']")).getText(),"Searches related");
	 st.verifyEquals(driver.findElement(By.xpath("//*[@class='med _kk _wI']")).getText(),"Searches related");
	 driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
	}

}
