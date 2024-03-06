package com.example.recyclerview;

public class CatModel {
    // This is the data class of our app. It stores the basic details of a cat.
    // THIS ACTS AS A 'MODEL' of MVC architecture
    int image;
    String desc;

    // this is a model class / a data class
    public CatModel(int image, String desc) {
        this.image = image;
        this.desc = desc;
    }
}
