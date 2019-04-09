package com.harsha.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<onCreate> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void decrement(View view){
        TextView quantity = (TextView)findViewById(R.id.quantity);
       int count = Integer.parseInt(quantity.getText().toString());
       if(count!=0){
           quantity.setText(Integer.toString(count-1));
       }
    }
    public void increment(View view){
        TextView quantity = (TextView)findViewById(R.id.quantity);
        int count = Integer.parseInt(quantity.getText().toString());
        if(count<=100){
            quantity.setText(Integer.toString(count+1));
        }
    }
}
