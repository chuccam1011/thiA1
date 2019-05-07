package com.example.ongthia1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ongthia1.Activity.Activity_chonde;
import com.example.ongthia1.data.Database;
import com.example.ongthia1.model.cauhoi;
import com.example.ongthia1.model.traloi;

public class MainActivity extends AppCompatActivity {

    Database database;
    cauhoi cauhoi;
    traloi traloi;

    Button buttonChonde;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonChonde= (Button) findViewById(R.id.buttonThiTheoDe);
        buttonChonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Activity_chonde.class);
                startActivity(intent);
            }
        });

        //tao database
        database = new Database(this,"thiBLXA1.sqlite",null,1);
     ///tao các bảng
         database.QueryData("CREATE TABLE IF NOT EXISTS CauHoiA1(Id INTEGER PRIMARY KEY AUTOINCREMENT,VanBanhHoi VARCHAR(500), DapAn1 BOOLEAN(1) , DapAn2 BOOLEAN(1) , DapAn3 BOOLEAN(1) ,DapAn4 BOOLEAN(1)  )");



    }



}
