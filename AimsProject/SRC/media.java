/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import java.util.Comparator;
import java.util.Objects;
import com.mycompany.aims_project.Comparator.MediaComparatorByCostTitle;
import com.mycompany.aims_project.Comparator.MediaComparatorByTittleCost;
/**
 *
 * @author Gray
 */
public abstract class Media {
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTittleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private static int mediactr = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media() {
    }

    public Media(String title) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
    }

    public Media(String title, String category) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        ++mediactr;
        this.id = mediactr;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Media tmp) {
            return tmp.title.equals(this.title);
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.title);
        return hash;
    }
}