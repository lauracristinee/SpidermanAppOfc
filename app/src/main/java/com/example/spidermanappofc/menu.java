package com.example.spidermanappofc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    Button btnb1;
    Button btnb2;
    Button btnb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnb1 = (Button)findViewById(R.id.btnb1);

        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), brinquedo1.class);

                //Intent intent = new Intent( this, brinquedo1.class);
                startActivity(intent);
            }
        });

        btnb2 = (Button)findViewById(R.id.btnb1);

        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), brinquedo2.class);

                //Intent intent = new Intent( this, brinquedo2.class);
                startActivity(intent);
            }
        });

        btnb3 = (Button)findViewById(R.id.btnb1);

        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), brinquedo3.class);

                //Intent intent = new Intent( this, brinquedo3.class);
                startActivity(intent);
            }
        });

    }
}