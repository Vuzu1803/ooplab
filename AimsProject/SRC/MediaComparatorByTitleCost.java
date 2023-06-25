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
public class MediaComparatorByTittleCost implements Comparator<Media>{   

    @Override
    public int compare(Media o1, Media o2) {
        int comp  = o1.getTitle().compareTo(o2.getTitle());
        
        if(comp == 0){
            return Float.compare(o1.getCost(), o2.getCost());
        }
        
        return comp;
    }
     
}