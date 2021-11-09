package com.example.taxirate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        Button enter = (Button) findViewById(R.id.enter);
        EditText DistancEnter = (EditText) findViewById(R.id.DistancEnter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float DE = Float.parseFloat(DistancEnter.getEditableText().toString());
                float cost;
                float check;
                check = DE/250;
                if (check >= 1){
                cost = 75 + 5*check;
                }else{
                    cost = 75;
                }
                TextView message = (TextView) findViewById(R.id.CostView);
                message.setText(cost+"元");
            }
        });
    }
}