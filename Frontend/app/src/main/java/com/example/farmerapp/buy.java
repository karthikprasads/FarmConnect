package com.example.farmerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class buy extends AppCompatActivity {
    ImageView bot1, homebtn, sellbtn, cartbtn;
    ImageView backbtn , probtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        backbtn = findViewById(R.id.backButton);
        probtn = findViewById(R.id.imageView3);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy.this, MainActivity.class);
                startActivity(intent);
            }
        });
        probtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy.this, profile.class);
                startActivity(intent);
            }
        });
        bot1 =  findViewById(R.id.imageview3);
        homebtn =findViewById(R.id.imageview1);
        sellbtn =findViewById(R.id.imageview4);
        cartbtn = findViewById(R.id.imageview5);
//        probtn = findViewById(R.id.imageView3);
//        bot1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(buy.this,bot.class);
//                startActivity(intent);
//            }
//        });
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sellbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy.this, sell.class);
                startActivity(intent);
            }
        });
        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy.this, cart.class);
                startActivity(intent);
            }
        });
//        probtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(buy.this, profile.class);
//                startActivity(intent);
//            }
//        });
    }
}