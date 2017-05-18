package gill1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Update {
public static void main(String[] args) throws InterruptedException{
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://139.199.228.115:86/login");
		//后台登录
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("admin");
		wd.findElement(By.id("login")).click();
		
		Alert alert=wd.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);	
		
		//鼠标悬浮
		WebElement xuanfu=wd.findElement(By.xpath("//*[@id='menu-academico']/a"));
		Actions action1=new Actions(wd);
		action1.moveToElement(xuanfu).click().perform(); 
		WebElement click1=wd.findElement(By.xpath("//*[@id='menu-academico']/ul/li[1]/a"));
		action1.clickAndHold(click1).perform();
		action1.release(click1).perform();
		
		//修改信息
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/table/tbody/tr[2]/td[5]/a[3]/i")).click();
		wd.findElement(By.name("recipes.recipesTime")).clear();
		wd.findElement(By.name("recipes.recipesTime")).sendKeys("40分钟");
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/form/fieldset/div[15]/input")).click();
}
}