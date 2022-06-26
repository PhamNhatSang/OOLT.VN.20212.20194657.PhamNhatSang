package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc Dnt =new DigitalVideoDisc( "Dac Nhan Tam","Book",33.65f,120,"Dale Carnegie");
		DigitalVideoDisc twm =new DigitalVideoDisc( "Tuesdays with Morrie","Book",88.55f,140,"Mitch Albom");
		System.out.println("Dvd Dnt is :");
		Dnt.Print();
		System.out.println("Dvd twm is :");
		twm.Print();
		swap(Dnt,twm);
		System.out.println("After swap");
		System.out.println("Dvd Dnt is :");
		Dnt.Print();
		System.out.println("Dvd twm is :");
		twm.Print();
		
	}
	public static void Swapdirector(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
	}
	public static void Swapcategory(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
	}
	public static void Swaptitle(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
		
	}
	public static void Swaplenght(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
	}
	public static void Swapcost(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		
		
	}
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		Swapdirector(dvd1,dvd2);
		Swapcategory(dvd1,dvd2);
		Swaptitle(dvd1,dvd2);
		Swaplenght(dvd1,dvd2);
		Swapcost(dvd1,dvd2);
	}
	public static void changeTitle(DigitalVideoDisc dvd,String title) {
		
		
	}
	public static void checkDVD(DigitalVideoDisc dvd) {
		assert dvd.getCategory() != null && dvd.getDirector() !=null &&dvd.getTitle()!=null: "Error because DVD has null";
				 
		assert dvd.getCategory() != "" && dvd.getDirector() != "" && dvd.getTitle() !="" :"Error because have empty ";
	}

}
