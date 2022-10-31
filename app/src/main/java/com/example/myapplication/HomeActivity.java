package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);



    }

    //load option menu from an activity

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //handle option menu click events

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.help_menu:
                Toast.makeText( HomeActivity.this, "help clicked", Toast.LENGTH_SHORT).show();
                Intent intent_main = new Intent(this, LoginActivity.class);
                startActivity(intent_main);
                break;
            case R.id.logout_menu:
                Toast.makeText( HomeActivity.this, "logout clicked", Toast.LENGTH_SHORT).show();
            case R.id.settings_menu:
                Toast.makeText( HomeActivity.this, "settings clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}