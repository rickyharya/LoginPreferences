package com.rickyhr.loginpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rickyhr.loginpreference.database.SessionManager;

public class MainActivity extends AppCompatActivity {
    TextView nama;
    Button btnLogot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.tvNama);
        btnLogot = findViewById(R.id.buttonlogot);

        final SessionManager sm = new SessionManager(getApplicationContext());
        nama.setText("Selamat Datang, ");
        btnLogot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sm.logoutUser();
                Intent i = new Intent(getApplicationContext(), activity_login.class);
                startActivity(i);
            }
        });
    }
}
