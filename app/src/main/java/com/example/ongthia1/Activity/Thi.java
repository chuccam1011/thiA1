package com.example.ongthia1.Activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ongthia1.R;

import java.util.ArrayList;
import java.util.List;

public class Thi extends AppCompatActivity {
    private CheckBox A,B,C,D;
    private Dialog dialog;
    public int debai;//đè bai thi 12 de

    ArrayList<String> ans= new ArrayList<>();
    ArrayList<String> dapan= new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thi);
        final int[] DemCauhoi = {1};


         Button butCautiep=(Button)findViewById(R.id.buttonCauTiep);
         Button buttonNopBai=(Button)findViewById(R.id.buttonNopbai);

         A=(CheckBox)findViewById(R.id.checkBox1);
         B=(CheckBox)findViewById(R.id.checkBox2);
         C=(CheckBox)findViewById(R.id.checkBox3);
         D=(CheckBox)findViewById(R.id.checkBox4);

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
                url[0] =url1+Integer.toString(idcauhoi[0]) +url2;//next sang cau  tiep theo

                GetAns();
                DemCauhoi[0]++;
                if (DemCauhoi[0]<=20){
                    ww.loadUrl(url[0]);
                }else Toast.makeText(Thi.this,"Hoàn thành bài thi !",Toast.LENGTH_LONG).show();

                A.setChecked(false);
                B.setChecked(false);
                C.setChecked(false);
                D.setChecked(false);
                //Toast.makeText(Thi.this,url[0],Toast.LENGTH_SHORT).show();
            }
        });

        buttonNopBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showDialog();
            }
        });

    }
    public void GetAns(){//chưa fix ko chon dap dan

        String an="";
        if(A.isChecked())  {
            an=an+"1";

        }
        if(B.isChecked())  {
            an=an+"2";

        }
        if(C.isChecked())  {
            an=an+"3";

        }
        if(D.isChecked())  {
            an=an+"4";

        }
        //  if(A.isChecked()==false &&B.isChecked()==false && C.isChecked()==false) an="1";
        ans.add(an);
        //  Toast.makeText(MainActivity.this,ans.toString(),Toast.LENGTH_SHORT).show();
    }

    public List GetDapan(){
        ArrayList<String> listdapan= new ArrayList<>();
        //lay dap an tu DB

        return listdapan;
    }

    public int ChamDiem(){
        int diem = 0;
        GetDapan();
        for (int i=1;i<=ans.size();i++){
            if(ans.get(i).equals(dapan.get(i))){
                diem=diem+1;
            }
        }
        return diem;
    }


    public void showDialog() {
        dialog = new Dialog(Thi.this);
        dialog.setTitle("Thông báo kết quả bài thi ");
        dialog.setContentView(R.layout.dialog_ketqua);
        @SuppressLint("WrongViewCast") Button btnDongy=(Button)findViewById(R.id.Dialogdongy);
        TextView textViewDialogKetqua=(TextView)findViewById(R.id.textViewDialogKQ);
        TextView textViewDialogSocaudung=(TextView)findViewById(R.id.textViewDialogSC);

        textViewDialogSocaudung.setText(Integer.toString(ChamDiem())+"/20");
        if (ChamDiem()<18) textViewDialogKetqua.setText("Trượt Rồi ");
        else textViewDialogKetqua.setText("Qua Rồi !");
        dialog.show();
    }

}
