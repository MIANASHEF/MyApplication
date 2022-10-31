package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
   private EditText editTextEmail, editTextPassword;
   private Button buttonLogin, buttonSignUp;

   private final String valid_mail = "admin";
   private final String valid_password = "1";
   SharedPreferences preferences;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("My Dialog Title");
        dialog.setMessage("Are you Sure you want to exit");
// dialog.setIcon(R.drawable.ic_baseline_audiotrack_24);
        dialog.setNegativeButton("No", null);
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                LoginActivity.this.finish();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSignUp = findViewById(R.id.buttonSignUp);
    }
    public void login(View view) {

        String input_mail = editTextEmail.getText().toString();
        String input_password = editTextPassword.getText().toString();

        String registeredMail = preferences.getString("username","");
        String registeredPassword = preferences.getString("password","");

        if(input_mail.equals(registeredMail) && input_password.equals(registeredPassword)){
            Intent i_mail = new Intent(this, HomeActivity.class);
            startActivity(i_mail);
        }else{
            Toast.makeText(this, "Incorrect credentials!", Toast.LENGTH_SHORT).show();
        }


        if(editTextEmail.getText().toString().equals(""))
            Toast.makeText(this, "Empty Email", Toast.LENGTH_SHORT).show();
        else if (editTextPassword.getText().toString().equals(""))
            Toast.makeText(this, "Empty Password", Toast.LENGTH_SHORT).show();
        else
        {
            Intent i = new Intent( this, HomeActivity.class);
            startActivity(i);
        }
    }


    public void signup(View view) {
        Intent i_signup = new Intent(this, SignUpActivity.class);
        startActivity(i_signup);
    }



}
