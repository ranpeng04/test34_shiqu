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
		
		//��¼
		wd.findElement(By.id("username")).sendKeys("admin");
		wd.findElement(By.id("password")).sendKeys("admin");
		wd.findElement(By.id("login")).click();
		
	    Alert alert =wd.switchTo().alert();  //������
	    alert.accept();  //ȷ��
	    //alert.dismiss(); //ȡ��
	    Thread.sleep(3000);
	    
	    //���ʳ��
	    wd.findElement(By.xpath(".//*[@id='menu-academico']/a")).click();
	    wd.findElement(By.className("button_add")).click();
	    Thread.sleep(1000);
	    wd.findElement(By.id("img_poster")).sendKeys("G:\\Firefox����\\�����1.jpg");
	    wd.findElement(By.name("recipes.recipesId")).sendKeys("506");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesName")).sendKeys("�����");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesLevel")).sendKeys("һ��");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesTaste")).sendKeys("40");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesTime")).sendKeys("15����");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesType")).sendKeys("4");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.FKrecipesEffect")).sendKeys("30");
	    Thread.sleep(1000);
	    wd.findElement(By.name("recipes.recipesImage")).sendKeys("http://139.199.228.115:86/foodfun/upload/img/�����.jpeg");
	    Thread.sleep(1000);
	    wd.findElement(By.id("recipesIntro")).sendKeys("�����Ҳ��Ϊ�����㣬��һ��Դ������ľ����Ʒ���������еĵ�ζ�Ͷ��ص�������������ơ�������������90����������콭���˵Ŀ�·�ȷ�֮һ��");
	    Thread.sleep(1000);
	    wd.findElement(By.id("recipesMfood")).sendKeys("���㡢��ˡ��ݽ�");
	    wd.findElement(By.id("recipesFood")).sendKeys("��͡�����������������С������⡢�Ͼơ�������");
	    wd.findElement(By.id("recipesStep")).sendKeys(
	    		"1������һβ����ɱ��ϴ�ɾ�����Ƭ�õ���Ƭ��������У����������Ρ������ۡ�����ĩ���Ͼ�ץ����ζ2������������ˮ���߹�ͷ����5����3���Լ�������гɶΣ����ݽ�����4��ת��С�𣬽���ƬһƬƬ������У����л𣬼���Ƭ��ף���֭��΢���ں󣬼��ɽ�������Ƭһ��С�ĵ�������5��������˺ͺ��ݽ��Գ�7��8����6������������ˮ���߹�ͷ����5����7������һ����ͣ�һ�׺�����8������ͷ��������룬����տ���Ʋȥ��ĭ����Լ10���ӣ���©�׽���ǣ���ͷ�������ʢ����������9��ת��С�𣬽���ƬһƬƬ������У����л𣬼���Ƭ��ף���֭��΢���ں󣬼��ɽ�������Ƭһ��С�ĵ�������");
	    wd.findElement(By.id("recipesEffect")).sendKeys("����ζ�ʡ����¡��޶�����Ρ�θ��������ůθ���С�ƽ����������硢�αԡ���ű���泦����Ŀ֮��Ч���������͡�����ͷʹ�������Ͽ�����Ѫѹ��ͷʹ����ű��");
	    wd.findElement(By.xpath("html/body/div/div[2]/div[2]/div/div/form/fieldset/div[15]/input")).click();
	    
	    
	    try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		wd.quit();
	}

}
