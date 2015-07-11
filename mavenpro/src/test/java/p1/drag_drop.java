package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	FirefoxDriver driver;
    public void open()
    {
  	  driver=new FirefoxDriver();
  	  driver.manage().window().maximize();
  	  driver.get("http://jqueryui.com/droppable/");
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
drag_drop dd=new drag_drop();
dd.open();
dd.drag();
}


}
