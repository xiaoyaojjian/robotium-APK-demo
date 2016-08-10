package com.example.demo1;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;


public class MainActivity extends Activity implements OnClickListener{

	TextView tv_show=null;
	Button greenBtn=null;
	Button blueBtn=null;
	Button yellowBtn=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv_show=(TextView)findViewById(R.id.showWord);
		greenBtn=(Button)findViewById(R.id.GreenBtn);
		blueBtn=(Button)findViewById(R.id.BlueBtn);
		yellowBtn=(Button)findViewById(R.id.YellowBtn);
		
		tv_show.setOnClickListener(this);
		greenBtn.setOnClickListener(this);
		blueBtn.setOnClickListener(this);
		yellowBtn.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.GreenBtn:
		tv_show.setTextColor(Color.GREEN);		
		break;
	case R.id.BlueBtn:
		tv_show.setTextColor(Color.BLUE);		
		break;
	case R.id.YellowBtn:
		tv_show.setTextColor(Color.YELLOW);		
		
//	case R.id.showWord:
//		new AlertDialog.Builder(this) 
//		.setTitle("你知道吗？")
//		.setMessage("你突然点到我了~")
//		.setPositiveButton("知道", null)
//		.setNegativeButton("不知道", null)
//		.show();
		break;
	default:
		break;
	}
		
	}



}
