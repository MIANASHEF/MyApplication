package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private EditText etMail, etPassword;
    private Button btnRegister, btnCancel;
    private TextView tvWelcome;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etMail= findViewById(R.id.editTextTextEmailAddress);
        etPassword = findViewById(R.id.editTextTextPassword);
        btnRegister = findViewById(R.id.buttonRegister);
        btnCancel = findViewById(R.id.buttonCancel);

        preferences = getSharedPreferences("Userinfo", 0);
    }

     public void register(View  view){

     String input_mail = etMail.getText().toString();
     String input_password = etPassword.getText().toString();
     if(input_mail.length()>0){
         //open preferences file
         SharedPreferences.Editor editor = preferences.edit();
         //save key,value data
         editor.putString("username", input_mail);
         editor.putString("password", input_password);

         editor.apply();
         Toast.makeText(this, "User registered", Toast.LENGTH_SHORT).show();
         Intent intent_main = new Intent(this, LoginActivity.class);
         startActivity(intent_main);
                              }
          else{
         Toast.makeText(this, "Empty values, please insert!", Toast.LENGTH_SHORT).show();
              }
                                     }
         public void cancel(View view){
        Intent intert_main = new Intent(this, LoginActivity.class);
        startActivity(intert_main);
         }
}