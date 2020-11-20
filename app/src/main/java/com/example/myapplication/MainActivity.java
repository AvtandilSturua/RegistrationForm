package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    public void onRegBtn (View view){
        EditText Name = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText LastName = (EditText) findViewById(R.id.editTextTextPersonName6);
        EditText Age =(EditText)findViewById(R.id.editTextNumber3);
        if (Name.getText().toString().isEmpty() || LastName.getText().toString().isEmpty()){
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_LONG).show();

        }
        else if(Integer.parseInt(Age.getText().toString()) <1){
            Toast.makeText(this,"1 ze naklebs ver dawer",Toast.LENGTH_LONG).show();
            Age.setText("");
        }
        else if(Integer.parseInt(Age.getText().toString())<18){
            Toast.makeText(this,"Registraciistvis unda iyot 18 welze zemot",Toast.LENGTH_LONG).show();
            Age.setText("");
        }else{
            Toast.makeText(this, "Gilocavt Warmatebit Daregistrirdit", Toast.LENGTH_LONG).show();
             Class = new Class(Name.getText().toString(),LastName.getText().toString(),Age.getText().toString(),Integer.parseInt(Age.getText().toString()));

        }

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}