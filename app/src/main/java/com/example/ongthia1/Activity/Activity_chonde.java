package com.example.ongthia1.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ongthia1.R;

public class Activity_chonde extends AppCompatActivity {

    private Button buttonDe1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chonde);

        buttonDe1 = (Button) findViewById(R.id.buttonDe1);
        buttonDe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_chonde.this, thi.class);
                startActivity(intent);
            }
        });

    }
}
