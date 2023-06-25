/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aims_project.Media;

import java.util.ArrayList;
import com.mycompany.aims_project.Playable.Playable;

/**
 *
 * @author Gray
 */
public class CompactDisc extends Disc implements Playable {

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc() {
        super();

    }

    public CompactDisc(String title, String artist) {
        super(title);
        this.artist = artist;

    }

    public CompactDisc(String title, String category, String artist) {
        super(title, category);
        this.artist = artist;

    }

    public CompactDisc(String title, String category, String aritst, float cost) {
        super(title, category, cost);
        this.artist = aritst;
    }

    public void addTrack(Track newTrack) {
        if (!this.tracks.contains(newTrack)) {
            this.tracks.add(newTrack);
        }
    }

    public void removeTrack(Track rmvble) {
        if (this.tracks.contains(rmvble)) {
            this.tracks.remove(rmvble);
        }
    }

    @Override
    public int getLength() {
        if (tracks.isEmpty()) {
            return 0;
        }
        int temp = 0;
        for (int i = 0; i < tracks.size(); ++i) {
            temp += tracks.get(i).getLength();
        }
        return temp;
    }

    //getters
    public String getArtist() {
        return artist;
    }

    //toString
    @Override
    public String toString() {
        return "CD: " + this.getTitle()
                + " - Produced by: " + getArtist()
                + " - Duration: " + this.getLength()
                + " - Price: " + this.getCost();
    }

    //interface
    @Override
    public void play() {

        System.out.println("You are now listening to \"" + this.getTitle() + "\" \nProduced by: " + this.getArtist());

        for (int i = 0; i < tracks.size(); ++i) {
            System.out.print("Track no." + i + ":");
            tracks.get(i).play();
        }
    }

}