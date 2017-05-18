package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addfood {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://139.199.228.115:86/login");
		//wd.get("http://localhost:80");
		
		//登录
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("admin");
		wd.findElement(By.id("login")).click();
		
	    Alert alert =wd.switchTo().alert();  //弹出框
	    alert.accept();  //确定
	    //alert.dismiss(); //取消
	    Thread.sleep(3000);
	    
	    //添加食谱
	    wd.findElement(By.xpath(".//*[@id='menu-academico']/a")).click();
	    wd.findElement(By.className("button_add")).click();
	    Thread.sleep(1000);
	    wd.findElement(By.id("img_poster")).sendKeys("G:\\Firefox下载\\酸菜鱼1.jpg");
	    wd.findElement(By.name("recipes.recipesId")).sendKeys("506");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesName")).sendKeys("酸菜鱼");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesLevel")).sendKeys("一般");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesTaste")).sendKeys("40");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesTime")).sendKeys("15分钟");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesType")).sendKeys("4");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesEffect")).sendKeys("30");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesImage")).sendKeys("http://139.199.228.115:86/foodfun/upload/img/酸菜鱼.jpeg");
	    Thread.sleep(1000);
	    wd.findElement(By.id("recipesIntro")).sendKeys("酸菜鱼也称为酸汤鱼，是一道源自重庆的经典菜品，以其特有的调味和独特的烹调技法而著称。流行于上世纪90年代，是重庆江湖菜的开路先锋之一。");
	    Thread.sleep(1000);
	    wd.findElement(By.id("recipesMfood")).sendKeys("黑鱼、酸菜、泡椒");
	    wd.findElement(By.id("recipesFood")).sendKeys("蚝油、干辣椒、花椒、大葱、姜、蒜、料酒、胡椒粉");
	    wd.findElement(By.id("recipesStep")).sendKeys(
	    		"1、黑鱼一尾，宰杀清洗干净，将片好的鱼片放入大碗中，加入少许盐、胡椒粉、生姜末、料酒抓匀码味2、加入适量开水或者骨头汤煮5分钟3、自家泡酸菜切成段，红泡椒少许4、转成小火，将鱼片一片片下入锅中，开中火，见鱼片变白，汤汁稍微沸腾后，即可将汤和鱼片一起小心倒在盆里5、下入酸菜和红泡椒煸炒7、8分钟6、加入适量开水或者骨头汤煮5分钟7、调入一勺蚝油，一勺胡椒粉8、将鱼头及鱼骨下入，大火烧开，撇去浮沫，煮约10分钟，用漏勺将鱼骨，鱼头和酸菜先盛出到大盆里9、转成小火，将鱼片一片片下入锅中，开中火，见鱼片变白，汤汁稍微沸腾后，即可将汤和鱼片一起小心倒在盆里");
	    wd.findElement(By.id("recipesEffect")).sendKeys("草鱼味甘、性温、无毒，入肝、胃经；具有暖胃和中、平降肝阳、祛风、治痹、截疟、益肠明眼目之功效；主治虚劳、风虚头痛、肝阳上亢、高血压、头痛、久疟。");
	    wd.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/form/fieldset/div[15]/input")).click();
	    
	    
	    try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		wd.quit();
	}

}
