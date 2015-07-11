package p1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_links 
{
	FirefoxDriver fd;
	List<WebElement> lst;
	public void open()
	{
		fd=new FirefoxDriver();
		fd.manage().window().maximize();
		fd.get("http://www.google.com");
	}
	public void search() throws Exception
	{
		fd.findElement(By.id("lst-ib")).sendKeys("selenium");
		fd.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
	}
	public void all_links()
	{
		System.out.println("==========all links in webpage==========");
		lst=fd.findElements(By.xpath("//a"));
		for(WebElement x : lst)
			System.out.println(x.getText());		
	}
	public void few_links()
	{
		System.out.println("======selected links in webpage=========");
		WebElement w=fd.findElement(By.id("brs"));
		lst=w.findElements(By.tagName("a"));
		for(WebElement x : lst)
			System.out.println(x.getText()+"  "+x.getAttribute("href"));		
	}
	public void sel_links()
	{
		System.out.println("======links starts with  selenium========");
		lst=fd.findElements(By.xpath("//a[starts-with(.,'selenium') or starts-with(.,'Selenium')]"));
		for(WebElement x : lst)
			System.out.println(x.getText());
	}
	public void ph_link()
	{
		System.out.println("========links contains python========");
		lst=fd.findElements(By.xpath("//a[contains(.,'Python')]"));
		for(WebElement x : lst)
			System.out.println(x.getText());
	}	
	public static void main(String[] args) throws Exception 
	{
		google_links g= new google_links();
		g.open();
		g.search();
		g.all_links();
		g.few_links();
		g.sel_links();
		g.ph_link();
	}
}
