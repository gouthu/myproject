package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_ex 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	}
	public void drag()
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		
		new Actions(driver).dragAndDrop(w1,w2).perform();
	}
	public static void main(String[] args) 
	{
		frame_ex fr=new frame_ex();
		fr.open();
		fr.drag();
	}

}
