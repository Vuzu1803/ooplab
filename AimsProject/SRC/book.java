/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import java.util.ArrayList;

/**
 *
 * @author Gray
 */
public class Book extends Media {

    private ArrayList<String> authors = new ArrayList<>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public void addAuthor(String AuthorName) {
        if (!this.authors.contains(AuthorName)) {
            this.authors.add(AuthorName);
        }
    }

    public void removeAuthor(String AuthorName) {
        if (this.authors.contains(AuthorName)) {
            this.authors.remove(AuthorName);
        }
    }

    @Override
    public String toString() {
        return "Book: "+this.getTitle()+" - Category: "+this.getCategory()+" - Price: "+this.getCost();
                
    }
    
    

}