package p1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail_compose
{
	
	FirefoxDriver driver;
	    public void open()
	    {
	    	driver=new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.get("http:\\www.gmail.com");
	    	}
	  public void login() throws InterruptedException
	  {
		  driver.findElement(By.id("Email")).sendKeys("tvgrgowthami@gmail.com");
		  driver.findElement(By.id("next")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("Passwd")).sendKeys("7396949845");
		  driver.findElement(By.id("signIn")).click();
		 }
	  public void comp()  throws Exception
	  {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		  Thread.sleep(3000);
		  //driver.findElement(By.name("to")).sendKeys("alekhyaa59@gmail.com");
		  driver.findElement(By.id(":y5")).sendKeys("alekhyaa59@gmail.com");
		 // driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("alekhyaa59@gmail.com");
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("hellooo");
		  driver.findElement(By.name("subjectbox")).sendKeys("helo");
		 // driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("helo");
		 driver.findElement(By.id(":yx")).sendKeys("this is a sample program");
		//  driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("this is a sample program");
		  //driver.findElement(By.id(":14d")).click();
		  driver.findElement(By.xpath("//div[contains(@class,'a1 aaA aMZ')]")).click();
		  Runtime.getRuntime().exec("C://Users//SRIKANTH//Desktop//alert.exe");
		  driver.findElement(By.xpath("//div[@id=':ol']")).click();
	  }
		public static void main(String[] args) throws Exception
	 {
			gmail_compose c=new gmail_compose();
			c.open();
			c.login();
			c.comp();
			}


}
