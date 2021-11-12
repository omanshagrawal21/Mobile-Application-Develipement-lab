package com.example.currencyconverter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity { EditText t1, t2;
    RadioGroup rg;
    RadioButton rb;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.input);
        t2 = findViewById(R.id.result);
        rg = findViewById(R.id.radioGroup);
        b = findViewById(R.id.convertButton); b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = rg.getCheckedRadioButtonId();
                rb = findViewById(radioId);
                float rs = Float.parseFloat(t1.getText().toString()); String str = rb.getText().toString();
                if(str.equals("USD")) t2.setText(String.valueOf(rs*13/1000));
                else if(str.equals("EURO")) t2.setText(String.valueOf(rs*11/1000));
                else if(str.equals("YEN")) t2.setText(String.valueOf(rs*151/100));
                else
                    t2.setText("");
            }
        });
    }
}