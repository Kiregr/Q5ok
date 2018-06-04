package com.snuggletummy.q5ok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare variables
    Button btnClear;
    TextView tvProcessor, tvResult;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    String processor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variables
        btnClear = (Button) findViewById(R.id.btn_delete);
        tvProcessor = (TextView)findViewById(R.id.tv_process);
        tvResult = (TextView)findViewById(R.id.tv_result);

        btnOne = (Button)findViewById(R.id.btn_one);
        btnTwo = (Button)findViewById(R.id.btn_two);
        btnThree = (Button)findViewById(R.id.btn_three);
        btnFour = (Button)findViewById(R.id.btn_four);
        btnFive = (Button)findViewById(R.id.btn_five);
        btnSix = (Button)findViewById(R.id.btn_six);
        btnSeven = (Button)findViewById(R.id.btn_seven);
        btnEight = (Button)findViewById(R.id.btn_eight);
        btnNine = (Button)findViewById(R.id.btn_nine);
        btnZero = (Button)findViewById(R.id.btn_zero);

        
    }
}
