package com.shiqu.rp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DelClassify {

	public static void main(String[] args) throws InterruptedException {
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
		Actions action2 = new Actions(wd);
		action2.moveToElement(mainclassify).click().perform();
		WebElement click2 = wd.findElement(By.xpath(".//*[@id='menu-academico']/ul/li[2]/a"));
		action2.clickAndHold(click2).perform();
		Thread.sleep(2000);
		action2.release(click2).perform();
		Thread.sleep(2000);
		
		//点击删除按钮
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/table/tbody/tr[5]/td[3]/a[2]/i")).click();
		
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		wd.quit();
		
	}

}
