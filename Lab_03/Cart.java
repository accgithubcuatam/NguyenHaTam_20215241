package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null) {
			return;
		} else {
			if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is full!");
			} else {
				itemsOrdered[qtyOrdered] = disc;
				if (qtyOrdered == (MAX_NUMBERS_ORDERED - 1)) {
					System.out.println("The disc '" + itemsOrdered[qtyOrdered].getTitle() + "' has been added!");
					System.out.println("The cart is almost full!");
				} else {
					System.out.println("The disc '" + itemsOrdered[qtyOrdered].getTitle() + "' has been added!");
				}
				qtyOrdered++;
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		if (disc == null) {
			return;
		} else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i] == disc) {
					System.out.println("The disc '" + itemsOrdered[i].getTitle() + "' has been removed!");
					for (int j = i; j < qtyOrdered; j++) {
						itemsOrdered[j] = itemsOrdered[j + 1];
					}
					qtyOrdered--;
				}
			}
		}
	}
	

	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
		for (int i = 0; i < dvdList.length; i++) {
				addDigitalVideoDisc(dvdList[i]);
				qtyOrdered ++;
			}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		qtyOrdered++;
		addDigitalVideoDisc(dvd2);
		qtyOrdered++;
	}
	
	public void print() {
		System.out.println("*******************CART*******************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i]);
		}
	}
	
	public void search(String title) {
		int count = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title) == true) {
				System.out.println("Item found: " + itemsOrdered[i]);
				count++;
			}
		}
		if (count == 0) System.out.println("Not found!");
	}
	
	public void search(int id) {
		int count = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(id) == true) {
				System.out.println(itemsOrdered[i]);
				count++;
			}
		}
		if (count == 0) System.out.println("Not found!");
	}
}
