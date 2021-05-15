package com.example.profile;

public class LanguagesModel {
    String title;
    String description;
    int image;

    public LanguagesModel(String title,String description, int image ) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
