package lab02;

// import java.util.Objects;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private static int qtyOrdered = 0;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void display(){
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < qtyOrdered; i++){
                System.out.println("Name: " + itemsOrdered[i].getTitle() + "; Category: " + itemsOrdered[i].getCategory() + "; Director: " + itemsOrdered[i].getDirector() + "; Length: " + itemsOrdered[i].getLength() + "; Cost: " + itemsOrdered[i].getCost());
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsOrdered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), 
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
                if (itemsOrdered[i].getTitle().equals(disc.getTitle()) && 
                    itemsOrdered[i].getCategory().equals(disc.getCategory()) &&
                    itemsOrdered[i].getDirector().equals(disc.getDirector()) &&
                    itemsOrdered[i].getLength() == disc.getLength() &&
                    itemsOrdered[i].getCost() == disc.getCost()){
                    check = i;
                    break;
                }
                // if (itemsOrdered[i].equals(disc)){
                //     check = i;
                //     break;
                // }
            }
            if (check == -1){
                System.out.println("Not found!");
            }
            else{
                for (int i = check; i < qtyOrdered - 1; i++){
                    itemsOrdered[i] = new DigitalVideoDisc(itemsOrdered[i + 1].getTitle(), itemsOrdered[i + 1].getCategory(), 
                                                            itemsOrdered[i + 1].getDirector(), itemsOrdered[i + 1].getLength(), 
                                                            itemsOrdered[i + 1].getCost());
                }
                qtyOrdered--;
            }
        }
    }
    public float totalCost(){
        float ans = 0.0f;
        for (int i = 0; i < qtyOrdered; i++){
            ans += itemsOrdered[i].getCost();
        }
        
        return ans;
    }
}
