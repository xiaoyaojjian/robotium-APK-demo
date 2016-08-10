package com.example.demo1.test;

import com.example.demo1.MainActivity;//导入目标项目的启动类
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;


public class TestDemo1 extends ActivityInstrumentationTestCase2<MainActivity>{//继承目标项目的启动类

	private Solo solo;//初始化一个solo对象

	public TestDemo1() {//在构造函数处标明继承自目标项目的启动类
		super(MainActivity.class);
	}
	
	@Override
	public void setUp() throws Exception {//在测试开始之前会调用这个方法，这里来创建一个Solo对象
		solo = new Solo(getInstrumentation(), getActivity());
	}

	
	public void testcase001() throws Exception {
		 //等待  Activity　"MainActivity"　启动
		assertTrue("无法启动启动类", solo.waitForActivity("MainActivity", 30000));
        solo.sleep(5000);

      //输入文字："131243"
        solo.enterText((EditText)solo.getView("edtInsertName"), "说些什么好呢？");
        solo.sleep(2000);
        
        //清空输入框的内容
        solo.clearEditText((EditText)solo.getView("edtInsertName"));
        
        
        //按下 按钮 "绿色"
        solo.clickOnButton("^绿色$");
        solo.sleep(2000);

        //按下 按钮 "黄色"
        solo.clickOnButton("^黄色$");
        solo.sleep(2000);

        //按下 按钮 "蓝色"
        solo.clickOnButton("^蓝色$");
        solo.sleep(2000);


        //按下 TextView "看我变变变~~~"
        solo.clickOnText("^看我变变变~~~$");
        solo.sleep(5000);      
        
	}
	
	
	@Override
	public void tearDown() throws Exception {//一个测试用例结束的时候会调用这个方法
		solo.finishOpenedActivities();//这个方法将结束掉所有在测试执行过程中打开的activity
	}



}
