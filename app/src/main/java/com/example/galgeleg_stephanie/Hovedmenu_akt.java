package com.example.galgeleg_stephanie;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Hovedmenu_akt extends AppCompatActivity implements OnClickListener {
    //Erklæring af knapper så de huskes fra alle metoder
    Button spilKnap, indstillingerKnap, hjaelpKnap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hovedmenu);
        hjaelpKnap = findViewById(R.id.knap2);
        hjaelpKnap.setText("Hjælp");

        indstillingerKnap = findViewById(R.id.knap3);
        indstillingerKnap.setText("Indstillinger");

        spilKnap = findViewById(R.id.knap1);
        spilKnap.setText("Spil!");

        hjaelpKnap.setOnClickListener(this);
        indstillingerKnap.setOnClickListener(this);
        spilKnap.setOnClickListener(this);


    }


}
