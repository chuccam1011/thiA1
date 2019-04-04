package com.example.ongthia1.model;

public class traloi {
    private int id;// mã câu hỏi
    private boolean traloi1,tralo2,traloi3,traloi4;// trả lời cho các đáp án

    public traloi(int id, boolean traloi1, boolean tralo2, boolean traloi3, boolean traloi4) {
        this.id = id;
        this.traloi1 = traloi1;
        this.tralo2 = tralo2;
        this.traloi3 = traloi3;
        this.traloi4 = traloi4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTraloi1() {
        return traloi1;
    }

    public void setTraloi1(boolean traloi1) {
        this.traloi1 = traloi1;
    }

    public boolean isTralo2() {
        return tralo2;
    }

    public void setTralo2(boolean tralo2) {
        this.tralo2 = tralo2;
    }

    public boolean isTraloi3() {
        return traloi3;
    }

    public void setTraloi3(boolean traloi3) {
        this.traloi3 = traloi3;
    }

    public boolean isTraloi4() {
        return traloi4;
    }

    public void setTraloi4(boolean traloi4) {
        this.traloi4 = traloi4;
    }
}
