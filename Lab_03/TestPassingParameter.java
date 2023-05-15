package hust.soict.ict.test.disc;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		Wrapper jungleDVDW = new Wrapper(jungleDVD);
		Wrapper cinderellaDVDW = new Wrapper(cinderellaDVD);
		
		
		swap(jungleDVDW, cinderellaDVDW);
		System.out.println("jungle dvd title: " + jungleDVDW.dvd.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVDW.dvd.getTitle());
		/*
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		*/
	}
	
	public static void swap(Wrapper o1, Wrapper o2) {
		DigitalVideoDisc tmp = o1.dvd;
		o1.dvd = o2.dvd;
		o2.dvd = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String Title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(Title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
