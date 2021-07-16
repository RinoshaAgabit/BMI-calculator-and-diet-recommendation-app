package com.example.bmi;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{
    EditText ht,wt;
    TextView res,bmival;
    Button calculate;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        wt=(EditText)findViewById(R.id.editText1);
        ht=(EditText)findViewById(R.id.editText2);
        res=(TextView)findViewById(R.id.textView4);
        bmival=(TextView)findViewById(R.id.textView3);
        
        calculate=(Button)findViewById(R.id.button1);
        Button B1 = (Button)findViewById(R.id.button2);
        calculate.setOnClickListener(this);
        B1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent o=new Intent(getApplicationContext(),SMainActivity.class);
				startActivity(o);
			}
		});		
        
    }

	@Override
	public void onClick(View arg0) 
	{
		final DecimalFormat df2 = new DecimalFormat(".##");
		Double weight,height,bmi,finalht;
		weight=Double.parseDouble(wt.getText().toString());
		height=Double.parseDouble(ht.getText().toString());
		
		finalht=height*height;
		bmi=weight/finalht;
		bmival.setText(""+df2.format(bmi));
		
		if(bmi<18.5)
 		{
 			res.setText("underweight");
 		}
 		else if(bmi>18.5&&bmi<24.9)
 		{
 			res.setText("normal weight");
 		}
 		else if(bmi>25&&bmi<29.9)
 		{
 			res.setText("overweight");
 		}
 		else if(bmi>30&&bmi<39.9)
 		{
 			res.setText("obesity");
 		}
 		else if(bmi>40)
 		{
 			res.setText("severe obesity");
 		}
		
	}


  
    
}

