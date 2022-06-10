package com.example.homepagemultimedia.models;

import com.example.homepagemultimedia.R;

public class Product {
    private String title;
    private String rating;
    private String type;
    private String relDate;
    private String developerName;
    private String price;

    public Product(String title, String rating, String type, String relDate, String developerName, String price) {
        this.title = title;
        this.rating = rating;
        this.type = type;
        this.relDate = relDate;
        this.developerName = developerName;
        this.price = price;
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
}
