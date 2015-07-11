package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class yahoo_note {
			
			FirefoxDriver driver;
			private BufferedReader br;
			public void open()
			{
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://www.yahoomail.com/");
				}
		public void login() throws Exception
		{
			String str,a[];
			FileReader fr=new FileReader("D:\\Alljars\\data.txt");
		    br = new BufferedReader(fr);
			while((str=br.readLine())!=null)
			{
				a=str.split(",");
				open();
				driver.findElement(By.name("username")).sendKeys(a[0]);
				driver.findElement(By.name("passwd")).sendKeys(a[1]);
				driver.findElement(By.name("signin")).click();
				Thread.sleep(8000);
				try
				{
					if(driver.findElement(By.linkText("Sign Out")).isDisplayed())
					{
						System.out.println("login is sucess");
						driver.findElement(By.linkText("Sign Out")).click();
					}
						
				}
			
			catch(Exception e)
			{
				String str1=driver.findElement(By.id("mbr-login-error")).getText();
				System.out.println("login failed" +str1);
				File f=driver.getScreenshotAs(OutputType.FILE);
				String r = null;
				FileUtils.copyFile(f,new File("E:\\selenium_praticse\\yahoo" +r+".jpg"));
			}
			driver.close();
				
			}
		}
		public static void main(String[] args) throws Exception
		{
			yahoo_note y =new yahoo_note();
			y.login();
		}
}
