package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

public class MainActivity extends AppCompatActivity {

    private EditText password;
    private EditText name;
    private TextView info;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPersonName);
        btn = findViewById(R.id.button);
        info = findViewById(R.id.info);
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(), password.getText().toString());

            }


        });
    }
    private void validate(String userName, String userPassword) {
        if ((userName.equals("shah")) && (userPassword.equals("91"))) {
            info.setText("Successful!");
        } else if (!name.getText().toString().trim().isEmpty()||
                !password.getText().toString().trim().isEmpty()) {
            info.setText("fill in the field!");
        } else if (password.length() > 4) {
            info.setText("Password must contain 4 characters only");
        } else {
            info.setText("Incorrect password or name!");
        }
    }
}