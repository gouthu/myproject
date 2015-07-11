package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	FirefoxDriver driver;
	public void open()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
		}
	public void search() throws InterruptedException
	{
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Welcome to Facebook - Log In, Sign Up or Learn More").click();
	}
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("alakhyasanisetty@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("anusha");
		driver.findElement(By.id("u_0_n")).click();
	}
	
	public static void main(String[] args) throws InterruptedException 
		
		{	
			facebook f = new facebook();
			f.open();
			f.search();
			f.login();
		}


}
