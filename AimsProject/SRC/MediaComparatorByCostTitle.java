/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Comparator;

import com.mycompany.aims_project.Media.Media;
import java.util.Comparator;

/**
 *
 * @author Gray
 */
public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media o1, Media o2) {
       int comp = Float.compare(o1.getCost(), o2.getCost());
       
       if(comp == 0){
           return o1.getTitle().compareTo(o2.getTitle());
       }
       
       return comp;
    }
    
}