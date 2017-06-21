package com.example.offlinefrontpagedemo;

public class Speaker {

    private String name;
    private String image;
    private String bio;

    public Speaker(String name, String image, String bio) {
        this.name = name;
        this.image = image;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getBio() {
        return bio;
    }

}
