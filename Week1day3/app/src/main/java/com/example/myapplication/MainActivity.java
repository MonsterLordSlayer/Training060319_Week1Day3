package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
class Person{
    public String FirstName;
    public String LastName;
    public String StreetAddress;
    public String City;
    public String State;
    public String Zip;
}
public class MainActivity extends AppCompatActivity {
    Person p;
    TextView Info;
    TextView Info2;
    TextView Info3;
    TextView Info4;
    TextView Info5;
    TextView Info6;
    EditText Input;
    EditText Input2;
    EditText Input3;
    EditText Input4;
    EditText Input5;
    EditText Input6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Info=findViewById(R.id.Info1);
        Input=findViewById(R.id.Input);
        Info2=findViewById(R.id.Info2);
        Input2=findViewById(R.id.Input2);
        Info3=findViewById(R.id.Info3);
        Input3=findViewById(R.id.Input3);
        Info4=findViewById(R.id.Info4);
        Input4=findViewById(R.id.Input4);
        Info5=findViewById(R.id.Info5);
        Input5=findViewById(R.id.Input5);
        Info6=findViewById(R.id.Info6);
        Input6=findViewById(R.id.Input6);
    }

    public void sometitle(View view) {
        p=new Person();
        String userInput = Input.getText().toString();
        p.FirstName=userInput;
        Info.setText("First name"+userInput);

        userInput = Input2.getText().toString();
        p.LastName=userInput;
        Info2.setText("Last name"+userInput);

        userInput = Input3.getText().toString();
        p.StreetAddress=userInput;
        Info3.setText("Street Address"+userInput);

        userInput = Input4.getText().toString();
        p.City=userInput;
        Info4.setText("City"+userInput);

        userInput = Input5.getText().toString();
        p.Zip=userInput;
        Info5.setText("Zip"+userInput);

        userInput = Input6.getText().toString();
        p.State=userInput;
        Info6.setText("State"+userInput);
    }
}

