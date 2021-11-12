package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText EditText;
    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        EditText = findViewById(R.id.edt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Enter numbers properly", Toast.LENGTH_LONG).show();

                    return;
                }
                mValueOne = Float.parseFloat(EditText.getText() +
                        "");
                mAddition = true;
                EditText.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Enter numbers properly", Toast.LENGTH_LONG).show();
                    return;
                }
                mValueOne = Float.parseFloat(EditText.getText() +
                        "");
                mSubtract = true;
                EditText.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Enter numbers properly", Toast.LENGTH_LONG).show();
                    return;
                }
                mValueOne = Float.parseFloat(EditText.getText() +
                        "");
                mMultiplication = true;
                EditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Enter numbers properly", Toast.LENGTH_LONG).show();
                    return;
                }
                mValueOne = Float.parseFloat(EditText.getText() +
                        "");
                mDivision = true;
                EditText.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText.getText().toString().matches("")) {
                    Toast.makeText(getApplicationContext(),
                            "Enter numbers properly", Toast.LENGTH_LONG).show();
                    return;
                }
                mValueTwo = Float.parseFloat(EditText.getText() +
                        "");
                if (mAddition == true) {
                    EditText.setText(mValueOne + mValueTwo +
                            "");
                    mAddition = false;
                }
                if (mSubtract == true) {
                    EditText.setText(mValueOne - mValueTwo +
                            "");
                    mSubtract = false;
                }
                if (mMultiplication == true) {
                    EditText.setText(mValueOne * mValueTwo +
                            "");
                    mMultiplication = false;
                }
                if (mDivision == true) {
                    if (mValueTwo == 0) {
                        Toast.makeText(getApplicationContext(),
                                "Cannot divide by zero", Toast.LENGTH_LONG).show();
                        return;
                    }
                    EditText.setText(mValueOne / mValueTwo +
                            "");
                    mDivision = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
            }
        });
    }
}