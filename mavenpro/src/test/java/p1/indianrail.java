package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indianrail 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.indianrail.gov.in/");
	}
	public void search() throws Exception
	{
		driver.findElement(By.linkText("Trains between Stations")).click();
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.id("txtStationFrom"));
		from.sendKeys("HYD");
		from.sendKeys(Keys.ENTER);
		
		WebElement to=driver.findElement(By.id("txtStationTo"));
		to.sendKeys("BANGALORE");
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("submit2")).click();
	}
	public static void main(String[] args) throws Exception 
	{
		indianrail ir=new indianrail();
		ir.open();
		ir.search();
	}


}
