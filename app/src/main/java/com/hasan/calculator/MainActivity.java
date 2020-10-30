package com.hasan.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button_plus;
    Button button_minus;
    Button button_multiply;
    Button button_divide;
    Button button_clear;
    Button button_equal;
    TextView txtView;
    int n1 = 0;
    int n2 = 0;
    String operator = null;
    boolean start_input_n2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.B1);
        button2 = findViewById(R.id.B2);
        button3 = findViewById(R.id.B3);
        button4 = findViewById(R.id.B4);
        button5 = findViewById(R.id.B5);
        button6 = findViewById(R.id.B6);
        button7 = findViewById(R.id.B7);
        button8 = findViewById(R.id.B8);
        button9 = findViewById(R.id.B9);
        button_plus = findViewById(R.id.B_plus);
        button_minus = findViewById(R.id.B_minus);
        button_multiply = findViewById(R.id.B_multiply);
        button_divide = findViewById(R.id.B_divide);
        button_clear = findViewById(R.id.clear);
        button_equal = findViewById(R.id.equal);
        txtView = findViewById(R.id.TV);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 1;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 1;
                    txtView.setText(String.valueOf(n1));

                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 2;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 2;
                    txtView.setText(String.valueOf(n1));

                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 3;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 3;
                    txtView.setText(String.valueOf(n1));

                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 4;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 4;
                    txtView.setText(String.valueOf(n1));

                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 5;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 5;
                    txtView.setText(String.valueOf(n1));

                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 6;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 6;
                    txtView.setText(String.valueOf(n1));

                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 7;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 7;
                    txtView.setText(String.valueOf(n1));

                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 8;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 8;
                    txtView.setText(String.valueOf(n1));

                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (start_input_n2) {
                    n2 = (n2 * 10) + 9;
                    txtView.setText(String.valueOf(n2));

                } else {
                    n1 = (n1 * 10) + 9;
                    txtView.setText(String.valueOf(n1));

                }
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_input_n2 = true;
                txtView.setText("");
                operator = "+";
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_input_n2 = true;
                txtView.setText("");
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_input_n2 = true;
                txtView.setText("");
            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_input_n2 = true;
                txtView.setText("");
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(String.valueOf(n1 + n2));
                switch (operator) {
                    case "+":
                        txtView.setText(n1 + n2);
                        break;
                    case "-":
                        txtView.setText(n1 - n2);
                        break;
                    case "/":
                        txtView.setText(n1 / n2);
                        break;
                    case "*":
                        txtView.setText(n1 * n2);
                        break;
                }
            }

        });


        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");
                n1 = 0;
                n2 = 0;
                start_input_n2 = false;
            }
        });
    }
}
