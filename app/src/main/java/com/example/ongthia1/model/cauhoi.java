package com.example.ongthia1.model;

public class cauhoi {
    private int id;//mã câu hỏi
    private String vanbanhoi;//hiẻn thị  văn bản đẻ hỏi
    private String ima;// duogn dan tói ảnh
    private int sodapan;//sso dáp án hiẻn thị  cho  mỗi cau hỏi
    private String text1,text2,text3,text4;// văn bản  hiển  thị  cho các đáp án
    private boolean dapan1,dapan2,dapan3,dapan4;//ddap só cho các đáp án

    public cauhoi(int id, String vanbanhoi, String ima, int sodapan, String text1, String text2, String text3, String text4, boolean dapan1, boolean dapan2, boolean dapan3, boolean dapan4) {
        this.id = id;
        this.vanbanhoi = vanbanhoi;
        this.ima = ima;
        this.sodapan = sodapan;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.dapan1 = dapan1;
        this.dapan2 = dapan2;
        this.dapan3 = dapan3;
        this.dapan4 = dapan4;
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

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public boolean isDapan1() {
        return dapan1;
    }

    public void setDapan1(boolean dapan1) {
        this.dapan1 = dapan1;
    }

    public boolean isDapan2() {
        return dapan2;
    }

    public void setDapan2(boolean dapan2) {
        this.dapan2 = dapan2;
    }

    public boolean isDapan3() {
        return dapan3;
    }

    public void setDapan3(boolean dapan3) {
        this.dapan3 = dapan3;
    }

    public boolean isDapan4() {
        return dapan4;
    }

    public void setDapan4(boolean dapan4) {
        this.dapan4 = dapan4;
    }
}
