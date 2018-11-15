package com.example.zarshamian.fscbookfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    TextView registerTextView;
    EditText firstNameEditText;
    EditText lastNameEditText;
    EditText emailEditText;
    EditText passwordEditText;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerTextView = (TextView) findViewById(R.id.register_textview);
        firstNameEditText = (EditText) findViewById(R.id.first_name);
        lastNameEditText = (EditText) findViewById(R.id.last_name);
        emailEditText = (EditText) findViewById(R.id.email);
        passwordEditText = (EditText) findViewById(R.id.password);
        registerButton = (Button) findViewById(R.id.registerform_btn);


    }

    public void end_registration(View view) {

        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();


        //entry validation; check if fields are empty
        if (firstName.isEmpty() || lastName.isEmpty() ||  email.isEmpty() || password.isEmpty()) {
            Toast.makeText(Register.this, "Empty fields! Fill all fields and try again.", Toast.LENGTH_SHORT).show();
        }
        //validate that first name is more than three characters and less than thirty characters
        else if (firstName.length() < 3 || firstName.length() > 30 )
        {
            Toast.makeText(Register.this, "The First Name field has invalid input. Try again.", Toast.LENGTH_SHORT).show();
        }
        //validate that last name is more than two characters and less than thirty characters
        else if (lastName.length() < 2 || lastName.length() > 30)
        {
            Toast.makeText(Register.this, "The Family (Last) Name field has invalid input. Try again.", Toast.LENGTH_SHORT).show();
        }
        //validate that email entry follows requested format, has ending of @farmingdale.edu
        else if (email.contains("@farmingdale.edu") == false)
        {
            Toast.makeText(Register.this, "The email entered is not an FSC email account. Try again.", Toast.LENGTH_SHORT).show();
        }
        //validate that password is more than eight characters
        else if (password.length() < 8)
        {
            Toast.makeText(Register.this, "The Password field has invalid input. Try again.", Toast.LENGTH_SHORT).show();
        }


        //successful registration, add to database and return to login screen
        else {
            Toast.makeText(Register.this, "Registration successful! You will now be returned to the login screen.", Toast.LENGTH_SHORT).show();
            Intent loginIntent = new Intent(Register.this, Login.class);
            startActivity(loginIntent);
        }
    }
}
