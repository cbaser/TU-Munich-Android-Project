package com.bmw.cakin.automotiveservices.activites;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import com.bmw.cakin.automotiveservices.R;
import com.bmw.cakin.automotiveservices.backend.BackendController;
import com.bmw.cakin.automotiveservices.backend.BackendHelper;

public class LoginActivity extends AppCompatActivity {
    private Button loginBtn;
    private EditText userName_edit,password_edit;
    private ImageView backView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName_edit = (EditText) findViewById(R.id.userName_edit);
        password_edit = (EditText) findViewById(R.id.password_edit);
        loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackendHelper backendHelper = new BackendHelper();
                String response =   backendHelper.tryLogin("Login",userName_edit.getText().toString(),password_edit.getText().toString());

             if(response.equals("admin")){
                 Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                 startActivity(intent);
             }
            }
        });


        backView=(ImageView) findViewById(R.id.backButton);
        backView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this,OpeningActivity.class);
                startActivity(it);
            }
        });
    }









}


