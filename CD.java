/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD {
    private long ID;
    private String collection;
    private String type;
    private String title;
    private double price;
    private int yearRelease;

    public CD(long ID, String collection, String type, String title, double price, int yearRelease) {
        this.ID = ID;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearRelease = yearRelease;
    }

    public CD() {
        
    }

    public long getID() {
        return ID;
    }

    public String getCollection() {
        return collection;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYearRelease() {
        return yearRelease;
    }
    
    
        
    
    
    public void Output(){
        System.out.println("CD ID: " + ID + "\n Collection: " + collection + "\n Type: " + type + "\n Title: " + title + "\n Price: " + price + "\n Released in: " + yearRelease);
    }
    

}