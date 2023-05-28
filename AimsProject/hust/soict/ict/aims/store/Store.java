package AimsProject.hust.soict.ict.aims.store;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media disc){
        if (itemsInStore.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsInStore.add(disc);
            System.out.println("The disc has been added");
        }
    }

    public void removeMedia(Media disc){
        int check = -1;
        if (itemsInStore.size() == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < itemsInStore.size(); i++){
                if (itemsInStore.get(i).getTitle().equals(disc.getTitle()) && 
                    itemsInStore.get(i).getCategory().equals(disc.getCategory()) &&
                    itemsInStore.get(i).getDirector().equals(disc.getDirector()) &&
                    itemsInStore.get(i).getLength() == disc.getLength() &&
                    itemsInStore.get(i).getCost() == disc.getCost()){
                    check = i;
                    break;
                }
            }
            if (check == -1){
                System.out.println("Not found!");
            }
            else{
                itemsInStore.remove(disc);
                System.out.println("Successfully removed!");
            }
        }
    }

    public void seeInformation(String title){
        if (itemsInStore.size() == 0){
            System.out.println("Empty store");
        }else{
            int check = -1;
            for (int i = 0; i < itemsInStore.size(); i++){
                if (itemsInStore.get(i).getTitle().equals(title)){
                    System.out.println("Name: " + itemsInStore.get(i).getTitle() + "; Category: " + itemsInStore.get(i).getCategory() + "; Director: " + itemsInStore.get(i).getDirector() + "; Length: " + itemsInStore.get(i).getLength() + "; Cost: " + itemsInStore.get(i).getCost());
                    check = 1;
                    break;
                }
            }
            if (check == -1) System.out.println("Not Found!");
        }
    }

    public Media getInformation(String title){
        if (itemsInStore.size() == 0) System.out.println("Empty store");
        else{
            int check = -1;
            for (int i = 0; i < itemsInStore.size(); i++){
                if (itemsInStore.get(i).getTitle().equals(title)){
                    check = 1;
                    return itemsInStore.get(i);
                    break;
                }
            }
            if (check == -1) System.out.println("Not Found!");
        }
    }

    public void display(){
        if (itemsInStore.size() == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < itemsInStore.size(); i++){
                System.out.println("Name: " + itemsInStore.get(i).getTitle() + "; Category: " + itemsInStore.get(i).getCategory() + "; Director: " + itemsInStore.get(i).getDirector() + "; Length: " + itemsInStore.get(i).getLength() + "; Cost: " + itemsInStore.get(i).getCost());
            }
        }
    }
}
