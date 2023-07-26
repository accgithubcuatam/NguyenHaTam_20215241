package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;


public class StoreTest {
        public static void main(String[] args) {
            // Create a new store
            Store store = new Store();

            // Add some DVDs to the store
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            store.addDVD(dvd1);
            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
            store.addDVD(dvd2);
            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);
            store.addDVD(dvd3);

            // Print the items in the store
            store.print();

            // Remove a DVD from the store
            store.removeDVDs(dvd3);

            // Print the items in the store again
            store.print();
        }
    }

