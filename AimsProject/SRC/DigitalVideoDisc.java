/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import com.mycompany.aims_project.Playable.Playable;

/**
 *
 * @author Gray
 */
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost,director);
    }
         
    @Override
    public String toString() {
        return "DVD: " + this.getTitle()
                + " - Category: " + this.getCategory()
                + " - Director: " + this.getDirector()
                + " - DVD length: " + this.getLength()
                + " - Cost: " + this.getCost() + "$";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

}