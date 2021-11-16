package com.example.timepicker;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; import android.widget.TextView; import android.widget.TimePicker;
public class MainActivity extends AppCompatActivity { TextView t1;
    TimePicker tp;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        tp=findViewById(R.id.TimePicker1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            String currentTime="Time:"+tp.getCurrentHour()+":"+tp.getCurrentMinute();
            t1.setText(currentTime);
        } });
    } }