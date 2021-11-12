package com.example.arduinobilling;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText t1, t2, t3, t4, t5,t6,t7,t8,t9; Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.uno);
        t2 = findViewById(R.id.wifi);
        t3 = findViewById(R.id.bluetooth);
        t4 = findViewById(R.id.rfid);
        t5 = findViewById(R.id.uno2);
        t6 = findViewById(R.id.wifi2);
        t7 = findViewById(R.id.bluetooth2);
        t8 = findViewById(R.id.rfid2);
        t9 = findViewById(R.id.Total);
        b1 = findViewById(R.id.submitButton);
        b2 = findViewById(R.id.clearButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(t1.getText().toString());
                int b = Integer.parseInt(t2.getText().toString());
                int c = Integer.parseInt(t3.getText().toString());
                int d = Integer.parseInt(t4.getText().toString());
                int w = a*300;
                int x = b*500;
                int y = c*250;
                int z = d*200;
                int s = w+x+y+z;
                t5.setText(String.valueOf(w));
                t6.setText(String.valueOf(x));
                t7.setText(String.valueOf(y));
                t8.setText(String.valueOf(z));
                t9.setText(String.valueOf(s));
            } });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
            } });
    } }