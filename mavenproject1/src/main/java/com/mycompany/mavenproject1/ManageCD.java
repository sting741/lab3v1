/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ManageCD {
   private ArrayList<CD> CDList = new ArrayList<>();
        private static Scanner sc = new Scanner(System.in);
    public ManageCD() {
    }
   
    public ManageCD(ArrayList<CD> CDList) {
        this.CDList = CDList;
    }
    
    public void Input(){
        System.out.println("Enter numbers of CDs: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
           System.out.println("Enter CDs ID: ");
           long id = sc.nextLong();
           System.out.println("Enter collection of CDs \n 1:game \n 2:music \n 3:movie ");
           int tem = sc.nextInt();
           String collection;
           switch (tem) {
                case 1:
                     collection = "game";
                    break;
                case 2:
                     collection = "music";
                    break;
                case 3:
                     collection = "movie";
                    break;
                default:
                    throw new AssertionError();
            }
           System.out.println("Enter type of CDs \n 1:audio \n 2:video ");
           int temp = sc.nextInt();
           String type;
           switch (temp) {
                case 1:
                     type = "audio";
                    break;
                case 2:
                     type = "video";
                    break;
                default:
                    throw new AssertionError();
            }
           System.out.println("Enter title of CDs: ");
           String title = sc.next();
           System.out.println("Enter price of CDs: ");
           double price = sc.nextDouble();
           System.out.println("Enter year of release: ");
           int year = sc.nextInt();
           CD cd = new CD(id, collection, type, title, price, year);
           CDList.add(cd);
        }
    }
    
    public void Output(){
        for (int i = 0; i < CDList.size(); i++) {
            CDList.get(i).Output();
        }
    }
    
    public void SearchCDTitle(){
        System.out.println("Enter title u want to search: ");
        String t = sc.next();
        boolean flag = false;
        for (int i = 0; i < CDList.size(); i++) {
            if (CDList.get(i).getTitle().equals(t)) {
                CDList.get(i).Output();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("CD not found, try another one.");
        } 
    }
    
    public void SearchCDCollection(){
        System.out.println("Enter title u want to search: \n 1:game \n 2:music \n 3:movie ");
        int temp = sc.nextInt();
           String typetosearch;
           switch (temp) {
                case 1:
                     typetosearch = "audio";
                    break;
                case 2:
                     typetosearch = "video";
                    break;
                default:
                    throw new AssertionError();
            }
        
    }
}
