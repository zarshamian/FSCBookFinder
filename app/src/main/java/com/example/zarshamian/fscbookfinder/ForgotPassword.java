package com.example.zarshamian.fscbookfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    TextView forgotPasswordTextView;
    EditText emailField;
    Button forgotPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        forgotPasswordTextView = (TextView) findViewById(R.id.forgotpassword);
        emailField = (EditText) findViewById(R.id.FPemail);
        forgotPasswordButton = (Button) findViewById(R.id.forgotPasswordBtn);
    }

    public void FPsubmit(View view) {
        Toast.makeText(ForgotPassword.this, "We will now send an email to reset your password", Toast.LENGTH_SHORT).show();
    }
}
