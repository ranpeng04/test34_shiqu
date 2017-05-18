/*后台食谱主分类自动化测试
 *2017.5.16
 *冉鹏
 *添加一个新的食谱主分类
 */
package com.shiqu.rp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AddClassify {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://139.199.228.115:86/login");
		
		//登录
		wd.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		wd.findElement(By.id("password")).sendKeys("admin");
		Thread.sleep(2000);
		wd.findElement(By.id("login")).click();
		Thread.sleep(2000);
		Alert alert = wd.switchTo().alert();              //弹出框
		alert.accept();                                   //确认
		Thread.sleep(5000);
		
		//食谱主分类
		WebElement mainclassify = wd.findElement(By.xpath(".//*[@id='menu-academico']/a"));
		Actions action1 = new Actions(wd);
		action1.moveToElement(mainclassify).click().perform();
		WebElement click1 = wd.findElement(By.xpath(".//*[@id='menu-academico']/ul/li[2]/a"));
		action1.clickAndHold(click1).perform();
		Thread.sleep(2000);
		action1.release(click1).perform();
		Thread.sleep(2000);
		
		//点击添加主分类
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/ol/a")).click();
		Thread.sleep(2000);
		//输入主分类名称
		wd.findElement(By.name("mclassify.mclassifyName")).sendKeys("营养");
		//点击提交
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/form/fieldset/div[2]/input")).click();
		
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		wd.quit();
		
	}

}
