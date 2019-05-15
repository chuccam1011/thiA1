package com.example.ongthia1.Activity;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ongthia1.R;

public class Thi extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thi);


         Button butCautiep=(Button)findViewById(R.id.buttonCauTiep);
         Button buttonNopBai=(Button)findViewById(R.id.buttonNopbai);

        final String[] url = new String[1];
        final String url1="file:///android_asset/cau";
        final String url2=".html";
        final int[] idcauhoi = new int[1];



        final WebView ww = (WebView) findViewById(R.id.webViewThi);
        ww.getSettings().setJavaScriptEnabled(true);
        ww.getSettings().setBuiltInZoomControls(true);

        idcauhoi[0] =1;//n

        ww.loadUrl("file:///android_asset/cau1.html");

        butCautiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              idcauhoi[0] = idcauhoi[0] +1;
                url[0] =url1+Integer.toString(idcauhoi[0]) +url2;
                ww.loadUrl(url[0]);
                //Toast.makeText(Thi.this,url[0],Toast.LENGTH_SHORT).show();
            }
        });



    }
}
