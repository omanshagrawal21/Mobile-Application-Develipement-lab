package com.example.loginapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText name, pwd;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        pwd=findViewById(R.id.pwd);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
            if(name.getText().toString().equals("Omansh")
                        &&pwd.getText().toString().equals("19bce7440"))
                Toast.makeText(getApplicationContext(),
                        "Login Successful",Toast.LENGTH_LONG).show();
else
            Toast.makeText(getApplicationContext(),
                    "Login Failed",Toast.LENGTH_LONG).show(); }
        }); }
    }