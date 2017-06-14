package com.example.foodfun;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LiuZhuo on 2017/6/14.
 */

public class foodfunTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.liuzhuo.foodfun.activity.SlashActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public foodfunTest() throws ClassNotFoundException {
        super(launcherActivityClass);
    }


    @Before
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());

    }

    @After
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    @Test
    public void testFoodfun() {
        solo.clickOnView(solo.getView("foodfunView"));
        //进入个人中心页面
        solo.clickOnView(solo.getView(R.id.personal_btn_register));
        //进入注册页面
        solo.clickOnView(solo.getView(R.id.main_Tv_person));
        //注册
        solo.enterText(0,"lzjm");                   //账号
        solo.enterText(1,"123456");                //密码
        solo.enterText(2,"123456");                //确认密码
        solo.enterText(3,"lzjm123");              //确认密码
        solo.enterText(4,"15232179903");         //确认密码
        solo.clickOnButton("注册");
        solo.sleep(50000);

    }
}
