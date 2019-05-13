package com.example.ongthia1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ongthia1.Activity.Activity_chonde;
import com.example.ongthia1.Activity.Meothi;
import com.example.ongthia1.Activity.Ontap;
import com.example.ongthia1.Activity.thiThu;
import com.example.ongthia1.data.Database;
import com.example.ongthia1.model.cauhoi;
import com.example.ongthia1.model.traloi;

public class MainActivity extends AppCompatActivity {

    Database database;
    cauhoi cauhoi;
    traloi traloi;

    Button buttonChonde, buttonThiThu;
    Button buttonOnthi, buttonmeothi, buttonsahinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //chuỷen layot chọn dêf
        buttonChonde= (Button) findViewById(R.id.buttonThiTheoDe);
        buttonChonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Activity_chonde.class);
                startActivity(intent);
            }
        });

        //chuỷen layot On tâp
        buttonOnthi= (Button) findViewById(R.id.buttonOnthi);
        buttonOnthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Ontap.class);
                startActivity(intent);
            }
        });
        //chuỷen layot meo thi
        buttonmeothi= (Button) findViewById(R.id.buttonMeothi);
        buttonmeothi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Meothi.class);
                startActivity(intent);
            }
        });

        buttonChonde= (Button) findViewById(R.id.buttonThiTheoDe);
        buttonChonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Activity_chonde.class);
                startActivity(intent);
            }
        });

        buttonChonde= (Button) findViewById(R.id.buttonThiTheoDe);
        buttonChonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Activity_chonde.class);
                startActivity(intent);
            }
        });

        buttonThiThu = (Button) findViewById(R.id.buttonThiThu);
        buttonThiThu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, thiThu.class);
                startActivity(intent);
            }
        });

        //tao database
       // database = new Database(this,"thiBLXA1.sqlite",null,1);
     ///tao các bảng
        // database.QueryData("CREATE TABLE IF NOT EXISTS CauHoiA1(Id INTEGER PRIMARY KEY AUTOINCREMENT,VanBanhHoi VARCHAR(500), DapAn1 BOOLEAN(1) , DapAn2 BOOLEAN(1) , DapAn3 BOOLEAN(1) ,DapAn4 BOOLEAN(1)  )");



    }



}
