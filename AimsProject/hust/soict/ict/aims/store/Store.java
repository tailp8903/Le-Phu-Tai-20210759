package AimsProject.hust.soict.ict.aims.store;
import AimsProject.hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsInStore[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), 
                                                disc.getDirector(), disc.getLength(), disc.getCost());
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int check = -1;
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < qtyOrdered; i++){
                if (itemsInStore[i].getTitle().equals(disc.getTitle()) && 
                    itemsInStore[i].getCategory().equals(disc.getCategory()) &&
                    itemsInStore[i].getDirector().equals(disc.getDirector()) &&
                    itemsInStore[i].getLength() == disc.getLength() &&
                    itemsInStore[i].getCost() == disc.getCost()){
                    check = i;
                    break;
                }
                // if (itemsInStore[i].equals(disc)){
                //     check = i;
                //     break;
                // }
            }
            if (check == -1){
                System.out.println("Not found!");
            }
            else{
                for (int i = check; i < qtyOrdered - 1; i++){
                    itemsInStore[i] = new DigitalVideoDisc(itemsInStore[i + 1].getTitle(), itemsInStore[i + 1].getCategory(), 
                                                            itemsInStore[i + 1].getDirector(), itemsInStore[i + 1].getLength(), 
                                                            itemsInStore[i + 1].getCost());
                }
                System.out.println("Successfully removed!");
                qtyOrdered--;
            }
        }
    }

    public void display(){
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < qtyOrdered; i++){
                System.out.println("Name: " + itemsInStore[i].getTitle() + "; Category: " + itemsInStore[i].getCategory() + "; Director: " + itemsInStore[i].getDirector() + "; Length: " + itemsInStore[i].getLength() + "; Cost: " + itemsInStore[i].getCost());
            }
        }
    }

}
