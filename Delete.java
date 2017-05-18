package gill1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete {
public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://139.199.228.115:86/login");
		//ºóÌ¨µÇÂ¼
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("admin");
		wd.findElement(By.id("login")).click();
		
		Alert alert=wd.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);	
		
		//Êó±êÐü¸¡
		WebElement xuanfu=wd.findElement(By.xpath("//*[@id='menu-academico']/a"));
		Actions action1=new Actions(wd);
		action1.moveToElement(xuanfu).click().perform(); 
		WebElement click1=wd.findElement(By.xpath("//*[@id='menu-academico']/ul/li[1]/a"));
		action1.clickAndHold(click1).perform();
		action1.release(click1).perform();
		
		
		
		
		//É¾³ý²Ëµ¥
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div/a[6]")).click();
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/table/tbody/tr[11]/td[5]/a[4]/i")).click();
		Thread.sleep(1000);
		wd.quit();
		
		
}
}