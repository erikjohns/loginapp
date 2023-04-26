package com.example.functioninglogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button signUpBtn;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUpBtn = findViewById(R.id.signUpButton);
        loginBtn = findViewById(R.id.logInButton);

        signUpBtn.setOnClickListener(v -> openSignUp());

        loginBtn.setOnClickListener(v -> openLogin());
    }

    public void openSignUp() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
        finish();
    }

    public void openLogin() {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
        finish();
    }
}