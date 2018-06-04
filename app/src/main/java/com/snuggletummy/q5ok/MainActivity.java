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
    Button btnMultiply, btnMinus, btnPlus, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variables
        btnClear = (Button) findViewById(R.id.btn_delete);
        tvProcessor = (TextView)findViewById(R.id.tv_process);
        tvResult = (TextView)findViewById(R.id.tv_result);

        tvProcessor.setText("");
        tvResult.setText("");

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

        btnMultiply = (Button)findViewById(R.id.btn_multiply);
        btnMinus = (Button)findViewById(R.id.btn_minus);
        btnPlus = (Button)findViewById(R.id.btn_plus);
        btnDivide = (Button)findViewById(R.id.btn_divide);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvProcessor.setText("");
                tvResult.setText("");
            }
        });

        //Number buttons
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "0");
            }
        });
    }
}
