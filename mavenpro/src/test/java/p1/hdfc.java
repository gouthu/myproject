package p1;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfc
{    FirefoxDriver driver;
      public void open()
      {
    	  driver=new FirefoxDriver();
    	  driver.manage().window().maximize();
    	  driver.get("http://www.hdfcbank.com/");
      }
      public void login() throws Exception
      {
    	  driver.findElement(By.id("loginsubmit")).click();
    	  Thread.sleep(3000);
    	  List<String> s=new  ArrayList<String>(driver.getWindowHandles());
    	  driver.switchTo().window(s.get(1));
    	  driver.findElement(By.cssSelector("img[alt='Continue']")).click();
    	  driver.switchTo().frame(driver.findElement(By.name("login_page")));
    	  Thread.sleep(3000);
    	  driver.findElement(By.cssSelector("img[alt='continue']")).click();
      }
	public static void main(String[] args) throws Exception
	{
		hdfc hd=new hdfc();
		hd.open();
		hd.login();
	}


}
