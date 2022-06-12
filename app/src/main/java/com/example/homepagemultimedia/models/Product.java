package com.example.homepagemultimedia.models;

import com.example.homepagemultimedia.R;

public class Product {
    private String title;
    private String rating;
    private String type;
    private String relDate;
    private String developerName;
    private String price;
    private String description;
//    private int pImage;
//
//    public int getpImage() {
//        return pImage;
//    }
//
//    public void setpImage(int pImage) {
//        this.pImage = pImage;
//    }


    public Product(String title, String rating, String type, String relDate, String developerName, String price,String description) {
        this.title = title;
        this.rating = rating;
        this.type = type;
        this.relDate = relDate;
        this.developerName = developerName;
        this.price = price;
        this.description=description;
//        this.pImage = pImage;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelDate() {
        return relDate;
    }

    public void setRelDate(String relDate) {
        this.relDate = relDate;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
