/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import com.mycompany.aims_project.Playable.Playable;
import java.util.Objects;

/**
 *
 * @author Gray
 */
public class Track implements Playable {

    private String title;
    private int length;

    public Track() {
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Track(String title) {
        this.title = title;
    }

    //getters
    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    //interface
    @Override
    public void play() {
        System.out.println("\"" + this.getTitle() + "\" length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Track tmp) {
            return tmp.length == this.length && tmp.title.equals(this.title);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.title);
        return hash;
    }

}