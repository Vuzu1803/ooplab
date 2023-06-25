/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Cart;

import com.mycompany.aims_project.Media.Media;
import static com.mycompany.aims_project.Media.Media.COMPARE_BY_COST_TITLE;
import static com.mycompany.aims_project.Media.Media.COMPARE_BY_TITLE_COST;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gray
 */
public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered;

    public Cart() {
        this.itemsOrdered = new ArrayList<>();
    }

    public void addMedia(Media tbAdd) {
        itemsOrdered.add(tbAdd);
    }

    public void removeMedia(Media tbRmv) {
        itemsOrdered.remove(tbRmv);
    }

    public void emptyCart() {
        itemsOrdered.clear();
    }

    public void sortMedia(int opt) {
        if (opt == 1) {
            Collections.sort(itemsOrdered, COMPARE_BY_TITLE_COST);
        } else {
            Collections.sort(itemsOrdered, COMPARE_BY_COST_TITLE);
        }
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(i + 1 + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    //search
    public void search(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println(media.toString());
            }
        }

    }

    public void search(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
            }
        }

    }
}