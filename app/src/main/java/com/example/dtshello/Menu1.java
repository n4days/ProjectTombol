package com.example.dtshello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {

    Button buttonMenu1;
    Button buttonMenu2;
    Button buttonMenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        buttonMenu1 = (Button) findViewById(R.id.btnMenu1);

        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu1.this, Menu1.class);
                startActivity(intent);
            }
        });

        buttonMenu2 = (Button) findViewById(R.id.btnMenu2);

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu1.this, Menu2.class);
                startActivity(intent);
            }
        });

        buttonMenu3 = (Button) findViewById(R.id.btnMenu3);

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu1.this, Menu3.class);
                startActivity(intent);
            }
        });
    }
}