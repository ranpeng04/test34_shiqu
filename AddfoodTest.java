/**
 *���ʳ�ף����
 *������
 */
package com.webtest.core;

import org.testng.annotations.Test;

public class AddfoodTest extends BaseTest{
String url = "http://139.199.228.115:86/login";
	
	@Test
	public void Add() throws InterruptedException{
		//��¼
		webtest.open(url);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
	
		webtest.click("id=login");
		webtest.alertAccept(); //������
		Thread.sleep(2000);
		
		//���ʳ��
		webtest.click("xpath=.//*[@id='menu-academico']/a");
		webtest.click("class=button_add");
		Thread.sleep(1000);
		webtest.type("id=img_poster","G:\\Firefox����\\�����1.jpg");
		webtest.type("name=recipes.recipesId", "508");
		webtest.type("name=recipes.recipesName", "�����");
		webtest.type("name=recipes.recipesLevel", "һ��");
	    webtest.type("name=recipes.FKrecipesTaste", "40");
	    webtest.type("name=recipes.recipesTime", "15����");
	    webtest.type("name=recipes.FKrecipesType", "4");
	    Thread.sleep(3000);
	    webtest.type("name=recipes.FKrecipesEffect", "30");
	    webtest.type("name=recipes.recipesImage", "http://139.199.228.115:86/foodfun/upload/img/�����.jpeg");
	    webtest.type("id=recipesIntro", "�����Ҳ��Ϊ�����㣬��һ��Դ������ľ����Ʒ���������еĵ�ζ�Ͷ��ص�������������ơ�������������90����������콭���˵Ŀ�·�ȷ�֮һ��");
	    webtest.type("id=recipesMfood", "���㡢��ˡ��ݽ�");
	    webtest.type("id=recipesFood", "��͡�����������������С������⡢�Ͼơ�������");
	    webtest.type("id=recipesStep", "1������һβ����ɱ��ϴ�ɾ�����Ƭ�õ���Ƭ��������У����������Ρ������ۡ�����ĩ���Ͼ�ץ����ζ2������������ˮ���߹�ͷ����5����3���Լ�������гɶΣ����ݽ�����4��ת��С�𣬽���ƬһƬƬ������У����л𣬼���Ƭ��ף���֭��΢���ں󣬼��ɽ�������Ƭһ��С�ĵ�������5��������˺ͺ��ݽ��Գ�7��8����6������������ˮ���߹�ͷ����5����7������һ����ͣ�һ�׺�����8������ͷ��������룬����տ���Ʋȥ��ĭ����Լ10���ӣ���©�׽���ǣ���ͷ�������ʢ����������9��ת��С�𣬽���ƬһƬƬ������У����л𣬼���Ƭ��ף���֭��΢���ں󣬼��ɽ�������Ƭһ��С�ĵ�������");
	    webtest.type("id=recipesEffect", "����ζ�ʡ����¡��޶�����Ρ�θ��������ůθ���С�ƽ����������硢�αԡ���ű���泦����Ŀ֮��Ч���������͡�����ͷʹ�������Ͽ�����Ѫѹ��ͷʹ����ű��");
	    Thread.sleep(3000);
	    webtest.click("xpath=html/body/div/div[2]/div[2]/div/div/form/fieldset/div[15]/input");
	}

}
