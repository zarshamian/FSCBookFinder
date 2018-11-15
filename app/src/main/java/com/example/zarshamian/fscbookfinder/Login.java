package com.example.zarshamian.fscbookfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    TextView loginTextView;
    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;
    Button forgotPasswordButton;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginTextView = (TextView) findViewById(R.id.login_text);
        usernameEditText = (EditText) findViewById(R.id.username);
        passwordEditText = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginBtn);
        forgotPasswordButton = (Button) findViewById(R.id.forgotPasswordBtn);
        signUpButton = (Button) findViewById(R.id.registerBtn);
    }

    public void login(View view) {

        //check if fields are empty
        if (usernameEditText.length() == 0 || passwordEditText.length() == 0)
        {
            Toast.makeText(Login.this, "Empty fields! Fill all fields and try again.", Toast.LENGTH_SHORT).show();
        }

        //check if information is in database
        //successfully log in
        else
        {
            Intent homeIntent = new Intent(Login.this, Home.class);
            startActivity(homeIntent);
        }

    }

    public void register(View view) {
        //take to registration form

        Intent registerIntent = new Intent(Login.this, Register.class);
        startActivity(registerIntent);


    }

    public void forgot_password(View view) {
        //take to forgot password form
        Intent forgotPasswordIntent = new Intent(Login.this, ForgotPassword.class);
        startActivity(forgotPasswordIntent);

    }
}
