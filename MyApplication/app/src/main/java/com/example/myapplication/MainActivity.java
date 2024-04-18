package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v) {
        Intent i = new Intent(this, HomeActivity.class);

        TextView t = findViewById(R.id.username);
        String name = t.getText().toString();
        i.putExtra("uname", name);

        TextView p = findViewById(R.id.password);
        String password = p.getText().toString();

        if (password.equals("Charle")) {

            startActivity(i);
        }else{
            Toast.makeText(this, "Uy Mali, Try again Boss!", Toast.LENGTH_SHORT).show();
        }
    }
}
