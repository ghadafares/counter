package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView tv_counter;
 Button decrease,increase,reset;
 int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_counter=findViewById(R.id.tv_counter);
        decrease=findViewById(R.id.decrease);
        increase=findViewById(R.id.increase);
        reset=findViewById(R.id.reset);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                tv_counter.setText(Integer.toString(counter));
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                tv_counter.setText(Integer.toString(counter));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                tv_counter.setText(String.valueOf(counter));
            }
        });
    }
}