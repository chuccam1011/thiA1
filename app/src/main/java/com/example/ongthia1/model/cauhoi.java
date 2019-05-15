package com.example.ongthia1.model;

public class cauhoi {
    private String dapan;
    private int id;//mã câu hỏi
    private String vanbanhoi;//hiẻn thị  văn bản đẻ hỏi
    private String ima;// duogn dan tói ảnh
    private int sodapan;//sso dáp án hiẻn thị  cho  mỗi cau hỏi
    private String text1,text2,text3,text4;// văn bản  hiển  thị  cho các đáp án


    public cauhoi(int id, String vanbanhoi, String ima, int sodapan, String text1, String text2, String text3, String text4, boolean dapan1, boolean dapan2, boolean dapan3, boolean dapan4) {
        this.id = id;
        this.vanbanhoi = vanbanhoi;
        this.ima = ima;
        this.sodapan = sodapan;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.dapan = dapan;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVanbanhoi() {
        return vanbanhoi;
    }

    public void setVanbanhoi(String vanbanhoi) {
        this.vanbanhoi = vanbanhoi;
    }

    public String getIma() {
        return ima;
    }

    public void setIma(String ima) {
        this.ima = ima;
    }

    public int getSodapan() {
        return sodapan;
    }

    public void setSodapan(int sodapan) {
        this.sodapan = sodapan;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public String getDapan() {
        return dapan;
    }

    public void setDapan(String dapan) {
        this.dapan = dapan;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

}
