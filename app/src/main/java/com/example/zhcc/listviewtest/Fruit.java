package com.example.zhcc.listviewtest;

/**
 * Create by ZHCC on 2018/8/17
 */
public class Fruit {

    private String name;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId= imageId;
    }
}
