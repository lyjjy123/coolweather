package com.example.coolweather.db;


public class Provice extends DataSupport{
    private int id;
    private String proviceName;
    private int proviceCode;

    public Provice(int id, String proviceName, int proviceCode) {
        this.id = id;
        this.proviceName = proviceName;
        this.proviceCode = proviceCode;
    }

    public Provice(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return proviceName;
    }

    public void setProviceName(String proviceName) {
        this.proviceName = proviceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
