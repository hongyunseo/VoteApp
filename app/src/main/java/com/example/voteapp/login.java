package com.example.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class login extends AppCompatActivity {
    TextView sign;
    TextView login;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //회원가입 버튼
        sign = findViewById(R.id.signin);

        //회원가입 버튼 클릭시, 회원가입 페이지로 이동
        sign.setOnClickListener(v -> {
            Intent intent = new Intent(this, signup.class);
            startActivity(intent);
        });

        login=findViewById(R.id.loginbutton);

        login.setOnClickListener(v ->{
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
