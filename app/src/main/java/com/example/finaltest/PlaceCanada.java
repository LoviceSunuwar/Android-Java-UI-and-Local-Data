package com.example.finaltest;

public class PlaceCanada {
    String c_name, c_description;
    int c_image;
    Double c_price;

    public PlaceCanada(String c_name, String c_description, int c_image, Double price) {
        this.c_name = c_name;
        this.c_description = c_description;
        //this.c_country = c_country;
        this.c_image = c_image;
        this.c_price = price;
    }



    public String getC_name() {
        return c_name;
    }

    public String getC_description() {
        return c_description;
    }


    public int getC_image() {
        return c_image;
    }

    public Double getPrice() {
        return c_price;
    }
}
