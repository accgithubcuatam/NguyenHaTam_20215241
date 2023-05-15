package hust.soict.ict.aims.store;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Store {
	public DigitalVideoDisc itemsInStore[];
	private static int index = 0;
	public void addDVD(DigitalVideoDisc dvd) {
		if (null == dvd) {
			return;
		} else {
			this.itemsInStore[index] = dvd;
			index++;
		}
	}
	public void removeDVD(DigitalVideoDisc dvd) {
		if (null == dvd) {
			return;
		} else {
			for (int i = 0; i < index; i++) {
				if (itemsInStore[i] == dvd) {
					for (int j = i; j < index; j++) {
						itemsInStore[j] = itemsInStore[j + 1];
					}
					index--;
				}
			}
		}
	}
}
