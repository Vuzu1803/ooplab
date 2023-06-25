/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aims_project;

import com.mycompany.aims_project.Cart.Cart;
import com.mycompany.aims_project.Media.*;
import com.mycompany.aims_project.Store.Store;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Gray
 */
public class AIMS_Project {

    private static int stage = 0;
    private static int opt;
    public static Store store = new Store();
    public static Cart cart = new Cart();
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    //stage 0 
    public static void clearConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void initSetup() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        Book book = new Book("The Valley of Fear", "Detective", 20.00f);
        Book book1 = new Book("A Living Remedy: A Memoir", "Biography", 202.00f);
        Book book2 = new Book("On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f);
        store.addMedia(book);
        store.addMedia(book1);
        store.addMedia(book2);

        CompactDisc cd1 = new CompactDisc("Time isn't real", "Music", "Grabbitz", 1500.98f);
        Track track1CD1 = new Track("What now", 10);
        Track track2CD1 = new Track("87 seconds", 280);
        Track track3CD1 = new Track("RIP", 208);
        cd1.addTrack(track1CD1);
        cd1.addTrack(track2CD1);
        cd1.addTrack(track3CD1);

        CompactDisc cd2 = new CompactDisc("Santana", "Music", "Santana", 2000.22f);
        Track track1CD2 = new Track("Maria Maria", 180 + 34);
        Track track2CD2 = new Track("Smooth", 180 + 30);
        Track track3CD2 = new Track("Black magic woman", 60 * 2 + 39);
        cd2.addTrack(track1CD2);
        cd2.addTrack(track2CD2);
        cd2.addTrack(track3CD2);

        CompactDisc cd3 = new CompactDisc("Purpose", "Music", "Justin Bieber", 1000.98f);
        Track track1CD3 = new Track("The Feeling", 4 * 60 + 5);
        Track track2CD3 = new Track("No Sense", 4 * 60 + 35);
        cd3.addTrack(track1CD3);
        cd3.addTrack(track2CD3);

        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);

        clearConsole();
    }

    public static void showMenu() throws IOException {

        do {

            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            opt = Integer.parseInt(in.readLine());
            switch (opt) {
                case 0 -> {
                    stage = -1;
                    System.out.println("Bye bye!");
                }
                case 1 -> {
                    stage = 1;
                    storeMenu();
                }
                case 2 -> {
                    addMediatostore();
                }
                case 3 -> {
                    cart.print();
                    cartMenu();
                }
                default ->
                    System.out.println("Invalid option!");
            }
        } while (stage != -1);
    }

    //stage 1
    public static void addMediatostore() throws IOException {
        stage = 1;
        System.out.println("""
                                           Enter type of the media you want to create : 
                                           1. Book
                                           2. CD
                                           3. DVD
                                           0. Cancel
                                           Please choose a number 1-2-3-0""");
        opt = Integer.parseInt(in.readLine());
        String name, category;
        float cost;
        switch (opt) {
            case 1 -> {
                System.out.println("Enter name of book: ");
                name = in.readLine();
                System.out.println("Enter category: ");
                category = in.readLine();
                System.out.println("Enter cost");
                cost = Float.parseFloat(in.readLine());
                store.addMedia(new Book(name, category, cost));

            }
            case 2 -> {
                String artist;
                System.out.println("Enter name of CD: ");
                name = in.readLine();
                System.out.println("Enter category: ");
                category = in.readLine();
                System.out.println("Enter artist name: ");
                artist = in.readLine();
                System.out.println("Enter cost");
                cost = Float.parseFloat(in.readLine());
                store.addMedia(new CompactDisc(name, category, artist, cost));

            }
            case 3 -> {
                String director;
                int length;
                System.out.println("Enter name of DVD: ");
                name = in.readLine();
                System.out.println("Enter category: ");
                category = in.readLine();
                System.out.println("Enter director name: ");
                director = in.readLine();
                System.out.println("Enter length: ");
                length = Integer.parseInt(in.readLine());
                System.out.println("Enter cost: ");
                cost = Float.parseFloat(in.readLine());
                store.addMedia(new DigitalVideoDisc(name, category, director, length, cost));

            }
            default ->
                System.out.println("Operation canceled");
        }
    }

    public static void storeMenu() throws IOException {
        do {
            stage = 1;
            store.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            opt = Integer.parseInt(in.readLine());
            switch (opt) {
                case 0 -> {
                    stage = 0;
                }
                case 1 -> {
                    Media tmp = mediaDetails();
                    System.out.println(tmp.toString());
                    mediaDetailsMenu(tmp);
                }

                case 2 -> {
                    Media tbAdd = mediaDetails();
                    cart.addMedia(tbAdd);
                }
                case 3 -> {
                    Media playable = mediaDetails();
                    playMedia(playable);
                }
                case 4 -> {
                    cart.print();
                    cartMenu();
                }
                default ->
                    System.out.println("Invalid option!");
            }
        } while (stage != 0);
    }

    public static void cartMenu() throws IOException {
        stage = 1;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            opt = Integer.parseInt(in.readLine());
            switch (opt) {
                case 0 -> {
                    stage = 0;
                }
                case 1 -> {
                    filterMedia();
                }
                case 2 -> {
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Sort by title-cost");
                    System.out.println("2. Sort by cost-title");
                    System.out.println("Please choose a number: 0-1-2");
                    opt = Integer.parseInt(in.readLine());
                    switch (opt) {
                        case 1 -> {
                            cart.sortMedia(1);
                            cart.print();
                        }
                        case 2 -> {
                            cart.sortMedia(2);
                            cart.print();
                        }
                        default ->
                            System.out.println("Invalid option! ");
                    }
                }
                case 3 -> {
                    Media removable = mediaDetails();
                    cart.removeMedia(removable);
                }
                case 4 -> {
                    Media playable = mediaDetails();
                    playMedia(playable);
                }
                case 5 -> {
                    System.out.println("ORDER CREATED!: ");
                    cart.print();
                    cart.emptyCart();
                }
                default ->
                    System.out.println("Invalid option!");

            }
        } while (stage != 0);
    }

//STAGE 2
    public static void mediaDetailsMenu(Media tmp) throws IOException {
        stage = 2;

        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            opt = Integer.parseInt(in.readLine());
            switch (opt) {
                case 0 -> {
                    stage = 1;
                }
                case 1 -> {
                    cart.addMedia(tmp);
                }
                case 2 -> {
                    playMedia(tmp);
                }
                default ->
                    System.out.println("Invalid option!");
            }
        } while (stage != 1);
    }

//MISC
    private static Media mediaDetails() throws IOException {
        System.out.println("Enter media title: ");
        String title = in.readLine();
        return store.search(title);
    }

    private static void playMedia(Media playable) {
        try {
            DigitalVideoDisc tmp = (DigitalVideoDisc) playable;
            tmp.play();
        } catch (Exception e) {
            try {
                CompactDisc tmp = (CompactDisc) playable;
                tmp.play();
            } catch (Exception e2) {
                System.out.println("The media you're trying to play is either not available or not playable!");
            }
        }
    }

    private static void filterMedia() throws IOException {
        System.out.println("Please type in the media id( an Integer) or a title( a String)");
        String input = in.readLine();
        try {
            int id = Integer.parseInt(input);
            cart.search(id);
        } catch (NumberFormatException e) {
            cart.search(input);
        }
    }

//MAIN
    public static void main(String[] args) throws IOException {
        initSetup();
        System.out.println("WELCOME TO AIMS (An Internet Media Store)!");
        showMenu();
    }

}