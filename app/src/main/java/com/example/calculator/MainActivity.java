package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView out,sym;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button add,sub,mul,div,equal,reset,dot;
    int sw=0;
    double num1;
    double num2;
    int count=15;
    String op=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toast.makeText(getApplicationContext(),"Welcome to calculator", Toast.LENGTH_SHORT).show();
        out=findViewById(R.id.tv_out);
        sym=findViewById(R.id.tv_op);

        add=findViewById(R.id.btn_add);
        sub=findViewById(R.id.btn_sub);
        mul=findViewById(R.id.btn_mul);
        div=findViewById(R.id.btn_div);
        equal=findViewById(R.id.btn_res);
        reset=findViewById(R.id.btn_reset);
        dot=findViewById(R.id.btn_dot);

        one=findViewById(R.id.btn_1);
        two=findViewById(R.id.btn_2);
        three=findViewById(R.id.btn_3);
        four=findViewById(R.id.btn_4);
        five=findViewById(R.id.btn_5);
        six=findViewById(R.id.btn_6);
        seven=findViewById(R.id.btn_7);
        eight=findViewById(R.id.btn_8);
        nine=findViewById(R.id.btn_9);
        zero=findViewById(R.id.btn_0);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1=Double.parseDouble(out.getText()+"");//chng
                sym.setText("+");
                out.setText(null);//chng
                sw=1;
                op="+";
                count=15;


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(out.getText()+"");//chng
                sym.setText("-");
                out.setText(null);
                sw=1;
                op="-";
                count=15;

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(out.getText()+"");//chng
                sym.setText("*");
                out.setText(null);
                sw=1;
                op="*";
                count=15;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(out.getText()+"");//chng
                sym.setText("/");
                out.setText(null);
                sw=1;
                op="/";
                count=15;

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw=0;
                sym.setText("=");
                num2=Double.parseDouble(out.getText()+"");
                if(op=="+")
                {
                out.setText(num1+num2+"");
                }
                 if(op=="-")
                {
                    out.setText(num1-num2+"");
                }
                 if(op=="*")
                {
                    out.setText(num1*num2+"");
                }
                 if(op=="/")
                {
                    out.setText(num1/num2+"");
                }



            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"0");

                /*if(sw==0)
                    num1=0;
                if(sw==1)
                    num2=0;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"1");

                /*if(sw==0)
                    num1=1;
                if(sw==1)
                    num2=1;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"2");

                /*if(sw==0)
                    num1=2;
                if(sw==1)
                    num2=2;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"3");

                /*if(sw==0)
                    num1=3;
                if(sw==1)
                    num2=3;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"4");

                /*if(sw==0)
                    num1=4;
                if(sw==1)
                    num2=4;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"5");

               /* if(sw==0)
                    num1=5;
                if(sw==1)
                    num2=5;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"6");

                /*if(sw==0)
                    num1=6;
                if(sw==1)
                    num2=6;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"7");

                /*if(sw==0)
                    num1=7;
                if(sw==1)
                    num2=7;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"8");

                /*if(sw==0)
                    num1=8;
                if(sw==1)
                    num2=8;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+"9");

                /*
                if(sw==0)
                    num1=9;
                if(sw==1)
                    num2=9;*/
                if(count==0)
                {
                    Toast.makeText(getApplicationContext(),"Digit limit is 15", Toast.LENGTH_LONG).show();
                }
                else
                {
                    count--;
                }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText(out.getText()+".");
                /*if(sw==0)
                    num1=0;
                if(sw==1)
                    num2=0;*/

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sym.setText(null);
                out.setText(null);
                num1=num2=0;
                count=15;

            }
        });



    }
}