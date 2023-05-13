package AimsProject.hust.soict.ict.test.store;
import AimsProject.hust.soict.ict.aims.disc.DigitalVideoDisc;
import AimsProject.hust.soict.ict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDigitalVideoDisc(dvd2);
        store.display();
        store.removeDigitalVideoDisc(dvd2);
        store.display();
    }
}
