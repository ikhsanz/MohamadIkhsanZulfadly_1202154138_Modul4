package com.example.boncelius.asynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }

    public void tampilNama(View view) {
        Intent i = new Intent(getApplicationContext(),TampilNama.class);
        startActivity(i);
    }

    public void tampilGambar(View view) {
    }
}
