package AimsProject.hust.soict.ict.aims.cart;

import java.util.ArrayList;
import java.util.Observable;

import AimsProject.hust.soict.ict.aims.media.Media;

// import java.util.Objects;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private Observable<Media> itemsOrdered = new FXCollections.observableArrayList();

    public void display(){
        if (itemsOrdered.size() == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < itemsOrdered.size(); i++){
                System.out.println("Name: " + itemsOrdered.get(i).getTitle() + "; Category: " + itemsOrdered.get(i).getCategory() + "; Director: " + itemsOrdered.get(i).getDirector() + "; Length: " + itemsOrdered.get(i).getLength() + "; Cost: " + itemsOrdered.get(i).getCost());
            }
        }
    }

    public int getNumberOfItem(){
        return itemsOrdered.size();
    }

    public void addMedia(Media disc){
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }
    }
    public void removeMedia(Media disc){
        int check = -1;
        if (itemsOrdered.size() == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < itemsOrdered.size(); i++){
                if (itemsOrdered.get(i).getTitle().equals(disc.getTitle()) && 
                    itemsOrdered.get(i).getCategory().equals(disc.getCategory()) &&
                    itemsOrdered.get(i).getDirector().equals(disc.getDirector()) &&
                    itemsOrdered.get(i).getLength() == disc.getLength() &&
                    itemsOrdered.get(i).getCost() == disc.getCost()){
                    check = i;
                    break;
                }
            }
            if (check == -1){
                System.out.println("Not found!");
            }
            else{
                itemsOrdered.remove(disc);
            }
        }
    }
    public float totalCost(){
        float ans = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++){
            ans += itemsOrdered.get(i).getCost();
        }
        return ans;
    }
}
