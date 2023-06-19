package com.appcybersecurity.trab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home2 extends AppCompatActivity {

    ImageView tipsImage;
    ImageView HackersImage;
    ImageView VirusImage;
    ImageView InternetImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        tipsImage = findViewById(R.id.TipsImage);
        HackersImage = findViewById(R.id.HackerImage);
        VirusImage = findViewById(R.id.VirusImage);
        InternetImage = findViewById(R.id.EthernetImage);

        tipsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTips();
            }
        });

        HackersImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHackers();
            }
        });

        VirusImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVirus();
            }
        });

        InternetImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInternet();
            }
        });
    }

    public void openTips() {
        Intent intent = new Intent(this, TipsPage.class);
        startActivity(intent);
    }

    public void openHackers() {
        Intent intent = new Intent(this, HackersPage.class);
        startActivity(intent);
    }

    public void openVirus() {
        Intent intent = new Intent(this, VirusPage.class);
        startActivity(intent);
    }

    public void openInternet() {
        Intent intent = new Intent(this, EthernetPage.class);
        startActivity(intent);
    }
}