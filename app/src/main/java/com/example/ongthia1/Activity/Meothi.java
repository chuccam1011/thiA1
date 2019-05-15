package com.example.ongthia1.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.ongthia1.R;

public class Meothi extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meothi);
        WebView ww = (WebView) findViewById(R.id.webViewMeothi);
        ww.getSettings().setJavaScriptEnabled(true);
        ww.getSettings().setBuiltInZoomControls(true);
        ww.loadUrl("file:///android_asset/meothi.html");

    }
}
