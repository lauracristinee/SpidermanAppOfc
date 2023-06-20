package com.example.spidermanappofc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fim extends AppCompatActivity {
    Button btnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnmenu = (Button) findViewById(R.id.btnvoltamenu);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), menu.class);

                //Intent intent = new Intent( this, menu.class);
                startActivity(intent);
            }
        });
    }
}