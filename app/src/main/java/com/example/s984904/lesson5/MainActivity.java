package com.example.s984904.lesson5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String inputString = ((EditText)(findViewById(R.id.input1))).getText().toString();
        double cup = Double.parseDouble(inputString);

        double tbsp =(double)(Math.round(cup * 16*100))/100;
        double tsp = (double)(Math.round(cup * 48*100))/100;

        ((TextView)findViewById(R.id.output1)).setText(String.valueOf(tbsp));
        ((TextView)findViewById(R.id.output2)).setText(String.valueOf(tsp));
    }
}
