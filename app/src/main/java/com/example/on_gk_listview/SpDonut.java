package com.example.on_gk_listview;

public class SpDonut {
    private String name;
    private String chuThich;
    private String giaTien;
    private int imageDonut;

    public SpDonut(String name, String chuThich, String giaTien, int imageDonut) {
        this.name = name;
        this.chuThich = chuThich;
        this.giaTien = giaTien;
        this.imageDonut = imageDonut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChuThich() {
        return chuThich;
    }

    public void setChuThich(String chuThich) {
        this.chuThich = chuThich;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public int getImageDonut() {
        return imageDonut;
    }

    public void setImageDonut(int imageDonut) {
        this.imageDonut = imageDonut;
    }
}
