package com.simplecalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimplecalcActivity extends Activity implements OnClickListener {
	
	int a,b;
	EditText t1,t2;
    Button butadd;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        butadd=(Button)findViewById(R.id.button1);
        butadd.setOnClickListener(this);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        Log.e("a", "this is working");
       
        
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int c;
		String q=t1.getText().toString();
		String w=t2.getText().toString();
		if(q.matches("") && w.matches("")){
			Toast.makeText(this, "Please enter values", Toast.LENGTH_SHORT).show();
		}else{
		
			b=Integer.parseInt(q);
	        a=Integer.parseInt(w);
		c=a+b;
		
		Toast.makeText(this, "the sum is "+c, Toast.LENGTH_SHORT).show();
		}
		}
	
}