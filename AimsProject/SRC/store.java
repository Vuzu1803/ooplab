/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Store;

import com.mycompany.aims_project.Media.Media;
import java.util.ArrayList;

/**
 *
 * @author Gray
 */
public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }   
    
    public void addMedia(Media media) {
        itemsInStore.add(media);
    }

    public void removeMedia(Media media) {
        itemsInStore.remove(media);
    }

    public void print() {
        System.out.println("***********************************MEDIA LIST***********************************");
        for (int i = 0; i < itemsInStore.size(); ++i) {
            System.out.println(1 + i + "." + itemsInStore.get(i));
        }
        System.out.println("***********************************  END   ***********************************");

        System.out.print("\n\n");
    }

    public Media search(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
    
    
}