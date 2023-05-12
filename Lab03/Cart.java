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

    public void print(){
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            System.out.println("***********************CART***********************");
            for (int i = 0; i < qtyOrdered; i++){
                System.out.println(itemsOrdered[i].getID() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
            }
            System.out.println("Total cost: " + totalCost());
            System.out.println("***************************************************");
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

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (int i = 0; i < dvdList.length; i++){
            addDigitalVideoDisc(dvdList[i]);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
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
                System.out.println("Successfully removed!");
                qtyOrdered--;
            }
        }
    }

    public void searchID(int id){
        int exist = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getID() == id){
                System.out.println(itemsOrdered[i].getID() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
                exist++;
                break;
            }
        }
        if (exist == 0){
            System.out.println("Not found!");
        }
    }

    public void searchTitle(String title){
        int exist = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].getTitle().equals(title)){
                System.out.println(itemsOrdered[i].getID() + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
                exist++;
                break;
            }
        }
        if (exist == 0){
            System.out.println("Not found!");
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
