package com.example.a16022970.petcare;

import android.media.Image;

import java.util.ArrayList;
import java.util.Date;

public class Pets {
    private String name;
    private String breed;
    private Date dob;
    private Image image;
    private String xtra;

    public Pets(String name, String breed, Date dob, Image image, String xtra) {
        this.name = name;
        this.breed = breed;
        this.dob = dob;
        this.image = image;
        this.xtra = xtra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getXtra() {
        return xtra;
    }

    public void setXtra(String xtra) {
        this.xtra = xtra;
    }
}
