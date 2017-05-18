package shiqu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addshiqu {
		public static void main(String args[]) throws InterruptedException{
		WebDriver wd = new FirefoxDriver();
		//µÇÂ¼
		 wd.get("http://139.199.228.115:86/fun");
		 wd.findElement(By.id("username")).sendKeys("admin");
		 wd.findElement(By.id("password")).sendKeys("admin");
		 wd.findElement(By.id("login")).click();
		 Alert alert =wd.switchTo().alert();
		 alert.accept();
		 Thread.sleep(1000);
		 
		//Ìí¼ÓÊ°È¤    
		 
		 wd.findElement(By.xpath("/html/body/div/div[1]/div[2]/ul/li[4]/a")).click();
		 wd.findElement(By.xpath("/html/body/div/div[2]/div[2]/ol/a")).click();
		 Thread.sleep(1000);
		 wd.findElement(By.name("img_poster")).sendKeys("C:\\Users\\lenovo\\Pictures\\sunset.jpg");
		 wd.findElement(By.name("fun.funTitle")).sendKeys("Ìí¼Ó1");
		 Thread.sleep(1000);
		 wd.findElement(By.name("fun.funImage")).sendKeys("URL1");
		 Thread.sleep(1000);
		 wd.findElement(By.name("fun.funContent")).sendKeys("ÄÚÈÝ1");
		 Thread.sleep(1000);
		 wd.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/form/fieldset/div[5]/input")).click();
		 wd.quit();
		 
		 
		 
		 
		 
			 
		 }
		
		 
	


}
