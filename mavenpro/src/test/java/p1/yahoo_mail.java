package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo_mail
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoomail.com");
	}
	public void login() throws Exception
	{
		driver.findElement(By.name("username")).sendKeys("venkat123456a");
		driver.findElement(By.name("passwd")).sendKeys("mq123456");
		driver.findElement(By.name("signin")).click();
        Thread.sleep(5000); 
        driver.findElement(By.xpath("(//*[@type='checkbox'])[position()=4]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("top_delete")).click();
	}
	public static void main(String[] args) throws Exception 
	{
		yahoo_mail y=new yahoo_mail();
		y.open();
		y.login();
	}


}
