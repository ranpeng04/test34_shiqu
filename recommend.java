package com.foodfun.liuzhuo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * Selenium
 * 后台推荐  made by 刘镯
 * */

public class recommend {
	
	WebDriver wd = null;
	
	@BeforeClass
	public void testLogin() throws InterruptedException{
		System.setProperty("webdriver.firefox.bin", "G:\\firefox\\firefox.exe");
		wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://139.199.228.115/login");
		
		//登录
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("admin");
		wd.findElement(By.id("login")).click();
		
		Alert alert =wd.switchTo().alert();  	 //弹出框
		alert.accept(); 						//确定
		//alert.dismiss();					    //取消
		Thread.sleep(5000);
		wd.findElement(By.xpath(".//*[@id='menu']/li[3]/a/span")).click();
		Thread.sleep(500);
	}
	
	@Test(priority = 0)
	public void recommendAdd() throws InterruptedException{
		
		wd.findElement(By.className("button_add")).click();
		Thread.sleep(500);
		wd.findElement(By.id("content")).sendKeys("9");
		Thread.sleep(500);
		wd.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/div/form/fieldset/div[2]/input")).click();
		Thread.sleep(1000);
	}
	@Test(priority = 2)
	public void recommendDelete(){
		wd.findElement(By.xpath("html/body/div/div[2]/div[2]/div/table/tbody/tr[7]/td[3]/a[2]/i")).click();
	}
	@Test(priority = 1)
	public void recommendAlert() throws InterruptedException{
		wd.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/table/tbody/tr[2]/td[3]/a[1]/i")).click();
		Thread.sleep(500);
		wd.findElement(By.id("content")).clear();
		Thread.sleep(500);
		wd.findElement(By.id("content")).sendKeys("8");
		Thread.sleep(500);
		wd.findElement(By.xpath("html/body/div/div[2]/div[2]/div/form/fieldset/div[2]/input")).click();
		Thread.sleep(1000);
	}
	@AfterClass
	public void quitBroswer(){
		wd.quit();
	}

}
