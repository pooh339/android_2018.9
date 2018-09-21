package com.example.a1.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //  private EditText input ;
    TextView output;
    private StringBuilder expression = new StringBuilder();
    private double num1 = 0;
    private double num2 = 0;
    private double cnt = 0;
    private int flag = 0;
    private int fg = 0;
    Button buttonC;//allclear
    Button buttonN;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button buttonM, buttonD, buttonA, buttonS, buttonE, buttonP, buttonPo;


    private void initial() {
        button1 = (Button) findViewById(R.id.buttonOne);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button3 = (Button) findViewById(R.id.buttonThree);
        button4 = (Button) findViewById(R.id.buttonFour);
        button5 = (Button) findViewById(R.id.buttonFive);
        button6 = (Button) findViewById(R.id.buttonSix);
        button7 = (Button) findViewById(R.id.buttonSeven);
        button8 = (Button) findViewById(R.id.buttonEight);
        button9 = (Button) findViewById(R.id.buttonNine);
        button0 = (Button) findViewById(R.id.buttonZero);

        buttonM = (Button) findViewById(R.id.buttonMul);
        buttonD = (Button) findViewById(R.id.buttonDiv);
        buttonA = (Button) findViewById(R.id.buttonAdd);
        buttonS = (Button) findViewById(R.id.buttonSub);

        buttonE = (Button) findViewById(R.id.buttonEqual);
        buttonP = (Button) findViewById(R.id.buttonPercent);
        buttonPo = (Button) findViewById(R.id.buttonPoint);

        output = findViewById(R.id.textResult);

        // output.setText(" ");
        //  input = (EditText)findViewById(R.id.textResult)


        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
        button4.setOnClickListener((View.OnClickListener) this);
        button5.setOnClickListener((View.OnClickListener) this);
        button6.setOnClickListener((View.OnClickListener) this);
        button7.setOnClickListener((View.OnClickListener) this);
        button8.setOnClickListener((View.OnClickListener) this);
        button9.setOnClickListener((View.OnClickListener) this);
        button0.setOnClickListener((View.OnClickListener) this);

        buttonM.setOnClickListener((View.OnClickListener) this);
        buttonD.setOnClickListener((View.OnClickListener) this);
        buttonA.setOnClickListener((View.OnClickListener) this);
        buttonS.setOnClickListener((View.OnClickListener) this);
        buttonE.setOnClickListener((View.OnClickListener) this);
        buttonP.setOnClickListener((View.OnClickListener) this);
        buttonPo.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        //actualize allclear
        buttonC = (Button) findViewById(R.id.buttonAllclear);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(" ");
                expression.setLength(0);
            }
        });
        //actualize negative
        buttonN = (Button) findViewById(R.id.buttonNegative);
        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.valueOf(String.valueOf(output.getText()));
                a = a * -1;
                String b = String.valueOf(a);
                output.setText(b);
            }
        });
        //actualize percent
        buttonP = (Button) findViewById(R.id.buttonPercent);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.valueOf(String.valueOf(output.getText()));
                a /= 100;
                String b = String.valueOf(a);
                output.setText(b);
            }
        });

    }

    @Override
    public void onClick(View v) {
        output.setText("|");
        switch (v.getId()) {//view.v
            //last last last!!!!!!!!!!!!!!!!!!!!!!!!!!!
            case R.id.buttonZero:
                expression = expression.append("0");
                output.setText(expression);
                break;
            case R.id.buttonOne:
                expression = expression.append("1");
                output.setText(expression);
                break;
            case R.id.buttonTwo:
                expression = expression.append("2");
                output.setText(expression);
                break;
            case R.id.buttonThree:
                expression = expression.append("3");
                System.out.println("###"+expression);
                output.setText(expression);
                break;
            case R.id.buttonFour:
                expression = expression.append("4");
                output.setText(expression);
                break;
            case R.id.buttonFive:
                expression = expression.append("5");
                output.setText(expression);
                break;
            case R.id.buttonSix:
                expression = expression.append("6");
                output.setText(expression);
                break;
            case R.id.buttonSeven:
                expression = expression.append("7");
                output.setText(expression);
                break;
            case R.id.buttonEight:
                expression = expression.append("8");
                output.setText(expression);
                break;
            case R.id.buttonNine:
                expression = expression.append("9");
                output.setText(expression);
                break;
            case R.id.buttonPoint:
                expression = expression.append(".");
                output.setText(expression);
//                if (flag == 0) {
//                    flag = 0;
//                    str = "";
//                    output.setText("");
//                }
//                output.setText(str+((Button)v).getText());
                break;


            case R.id.buttonAdd:
                if (num1 == 0) {
                    num1 = Double.valueOf(String.valueOf(expression));
                    System.out.println("@@num1:"+num1);
                    System.out.println("express"+ expression);
                    expression.setLength(0);
                    fg = 2;
                }
                break;
            case R.id.buttonSub:
                if (num1 == 0) {
                    num1 = Double.valueOf(String.valueOf(expression));
                    System.out.println("@@num1:"+num1);
                    System.out.println("express"+ expression);
                    expression.setLength(0);
                    fg = 3;
                }
                break;
            case R.id.buttonMul:
                if (num1 == 0) {
                    num1 = Double.valueOf(String.valueOf(expression));
                    System.out.println("@@num1:"+num1);
                    System.out.println("express"+ expression);
                    expression.setLength(0);
                    fg = 4;
                }
                break;
            case R.id.buttonDiv:
                if (num1 == 0) {
                    num1 = Double.valueOf(String.valueOf(expression));
                    System.out.println("@@num1:"+num1);
                    System.out.println("express"+ expression);
                    expression.setLength(0);
                    fg = 5;
                }
                break;

            case R.id.buttonEqual:
                if (num1 == 0) {
                    output.setText(expression);
                    expression.setLength(0);
                }
                else {
                    num2 = Double.valueOf(String.valueOf(expression));
                    System.out.println("@@num2:" + num2);
                    System.out.println("express" + expression);
                    cal(num1, num2);
                    expression.setLength(0);
                    break;
                }
        }
    }

    public void getcal() {
        output.setText(String.valueOf(cnt));
        cnt = 0;
        num1 = 0;
        num2 = 0;
    }

    private void cal(double d1, double d2) {
        if (fg == 2) {
            cnt = d1 + d2;
            System.out.println("d1 d2::" + d1 + d2);
        }
        if (fg == 3) {
            cnt = d1 - d2;
        }
        if (fg == 4) {
            cnt = d1 * d2;
        }
        if (fg == 5) {
            if (d2 == 0) cnt = 0;
            else cnt = d1 / d2;
        }
        getcal();

    }
}

//class NumClickListener implements View.OnClickListener{
//    @Override
//    public void onClick(View v){
//    //I give up. It's uneasy to transmit values between class
//         }
//}
//
