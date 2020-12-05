package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editTextShow;

    ArrayList<Float> numbers = new ArrayList<Float>();
    ArrayList<String> operations = new ArrayList<String>();
    ArrayList<String> showCalc = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);
        Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        editText = (EditText) findViewById(R.id.editText);
        editTextShow = (EditText) findViewById(R.id.editTextShow);

        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

       button2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "2");
                }
            });

       button3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "3");
                }
            });

       button4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "4");
                }
            });

       button5.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "5");
                }
            });

       button6.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "6");
                }
            });

       button7.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "7");
                }
            });

       button8.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "8");
                }
            });

       button9.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    editText.setText(editText.getText() + "9");
                }
            });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numbers.removeAll(numbers);
                operations.removeAll(operations);
                editText.setText("");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numbers.add(Float.parseFloat(String.valueOf(editText.getText())));
                operations.add("+");
                editText.setText("");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numbers.add(Float.parseFloat(String.valueOf(editText.getText())));
                operations.add("-");
                editText.setText("");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numbers.add(Float.parseFloat(String.valueOf(editText.getText())));
                operations.add("x");
                editText.setText("");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numbers.add(Float.parseFloat(String.valueOf(editText.getText())));
                operations.add("/");
                editText.setText("");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numbers.add(Float.parseFloat(String.valueOf(editText.getText())));
                Float outValue;

                outValue = numbers.get(0);
                int i = 0;
                for(String op : operations){
                    for(int j = i+1; j == i+1; j++){
                        switch(op){
                            case "+":
                                outValue += numbers.get(j);
                                break;
                            case "-":
                                outValue -= numbers.get(j);
                                break;
                            case "x":
                                outValue *= numbers.get(j);
                                break;
                            case "/":
                                outValue /= numbers.get(j);
                                break;
                        }
                    }
                    i += 1;
                }
                editText.setText(outValue + "");

                numbers.removeAll(numbers);
                operations.removeAll(operations);
            }
        });

    }

}