package com.example.assignment2;


/**
 * Created by DEll1 on 10/15/2017.
 */
public class ContactClass {

    private String name;
    private String phone;
    private String imageUrl;

    public ContactClass(String name, String phone, String imageUrl) {
        this.name = name;
        this.phone = phone;
        this.imageUrl=imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
