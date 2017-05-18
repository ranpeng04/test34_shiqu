/**
 *添加食谱，框架
 *杜艺婷
 */
package com.webtest.core;

import org.testng.annotations.Test;

public class AddfoodTest extends BaseTest{
String url = "http://139.199.228.115:86/login";
	
	@Test
	public void Add() throws InterruptedException{
		//登录
		webtest.open(url);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
	
		webtest.click("id=login");
		webtest.alertAccept(); //弹出框
		Thread.sleep(2000);
		
		//添加食谱
		webtest.click("xpath=.//*[@id='menu-academico']/a");
		webtest.click("class=button_add");
		Thread.sleep(1000);
		webtest.type("id=img_poster","G:\\Firefox下载\\酸菜鱼1.jpg");
		webtest.type("name=recipes.recipesId", "508");
		webtest.type("name=recipes.recipesName", "酸菜鱼");
		webtest.type("name=recipes.recipesLevel", "一般");
	    webtest.type("name=recipes.FKrecipesTaste", "40");
	    webtest.type("name=recipes.recipesTime", "15分钟");
	    webtest.type("name=recipes.FKrecipesType", "4");
	    Thread.sleep(3000);
	    webtest.type("name=recipes.FKrecipesEffect", "30");
	    webtest.type("name=recipes.recipesImage", "http://139.199.228.115:86/foodfun/upload/img/酸菜鱼.jpeg");
	    webtest.type("id=recipesIntro", "酸菜鱼也称为酸汤鱼，是一道源自重庆的经典菜品，以其特有的调味和独特的烹调技法而著称。流行于上世纪90年代，是重庆江湖菜的开路先锋之一。");
	    webtest.type("id=recipesMfood", "黑鱼、酸菜、泡椒");
	    webtest.type("id=recipesFood", "蚝油、干辣椒、花椒、大葱、姜、蒜、料酒、胡椒粉");
	    webtest.type("id=recipesStep", "1、黑鱼一尾，宰杀清洗干净，将片好的鱼片放入大碗中，加入少许盐、胡椒粉、生姜末、料酒抓匀码味2、加入适量开水或者骨头汤煮5分钟3、自家泡酸菜切成段，红泡椒少许4、转成小火，将鱼片一片片下入锅中，开中火，见鱼片变白，汤汁稍微沸腾后，即可将汤和鱼片一起小心倒在盆里5、下入酸菜和红泡椒煸炒7、8分钟6、加入适量开水或者骨头汤煮5分钟7、调入一勺蚝油，一勺胡椒粉8、将鱼头及鱼骨下入，大火烧开，撇去浮沫，煮约10分钟，用漏勺将鱼骨，鱼头和酸菜先盛出到大盆里9、转成小火，将鱼片一片片下入锅中，开中火，见鱼片变白，汤汁稍微沸腾后，即可将汤和鱼片一起小心倒在盆里");
	    webtest.type("id=recipesEffect", "草鱼味甘、性温、无毒，入肝、胃经；具有暖胃和中、平降肝阳、祛风、治痹、截疟、益肠明眼目之功效；主治虚劳、风虚头痛、肝阳上亢、高血压、头痛、久疟。");
	    Thread.sleep(3000);
	    webtest.click("xpath=html/body/div/div[2]/div[2]/div/div/form/fieldset/div[15]/input");
	}

}
