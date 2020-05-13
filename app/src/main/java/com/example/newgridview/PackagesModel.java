package com.example.newgridview;

public class PackagesModel {
    Integer images;
    String price;

    public PackagesModel(Integer images, String price) {
        this.images = images;
        this.price = price;
    }

    public Integer getImages() {
        return images;
    }

    public void setImages(Integer images) {
        this.images = images;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
