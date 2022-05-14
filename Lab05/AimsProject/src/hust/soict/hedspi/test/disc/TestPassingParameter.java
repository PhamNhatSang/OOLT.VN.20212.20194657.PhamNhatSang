package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc Dnt =new DigitalVideoDisc( "Dac Nhan Tam","Book","Dale Carnegie",120,33.65f);
		DigitalVideoDisc twm =new DigitalVideoDisc( "Tuesdays with Morrie","Book","Mitch Albom",140,88.55f);
		System.out.println("Dvd Dnt is :");
		Dnt.PrintD();
		System.out.println("Dvd twm is :");
		twm.PrintD();
		swap(Dnt,twm);
		System.out.println("After swap");
		System.out.println("Dvd Dnt is :");
		Dnt.PrintD();
		System.out.println("Dvd twm is :");
		twm.PrintD();
		
	}
	public static void Swapdirector(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp =new DigitalVideoDisc("tmp");
		tmp.setDirector(dvd1.getDirector());
		dvd1.setDirector(dvd2.getDirector());
		dvd2.setDirector(tmp.getDirector());
	}
	public static void Swapcategory(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp =new DigitalVideoDisc("tmp");
		tmp.setCategory(dvd1.getCategory());
		dvd1.setCategory(dvd2.getCategory());
		dvd2.setCategory(tmp.getCategory());
	}
	public static void Swaptitle(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp =new DigitalVideoDisc("tmp");
		tmp.setTitle(dvd1.getTitle());
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tmp.getTitle());
		
	}
	public static void Swaplenght(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp =new DigitalVideoDisc("tmp");
		tmp.setLength(dvd1.getLength());
		dvd1.setLength(dvd2.getLength());
		dvd2.setLength(tmp.getLength());
	}
	public static void Swapcost(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp =new DigitalVideoDisc("tmp");
		tmp.setCost(dvd1.getCost());
		dvd1.setCost(dvd2.getCost());
		dvd2.setCost(tmp.getCost());
	}
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		Swapdirector(dvd1,dvd2);
		Swapcategory(dvd1,dvd2);
		Swaptitle(dvd1,dvd2);
		Swaplenght(dvd1,dvd2);
		Swapcost(dvd1,dvd2);
	}
	public static void changeTitle(DigitalVideoDisc dvd,String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd =new DigitalVideoDisc(oldTitle);
	}
	public static void checkDVD(DigitalVideoDisc dvd) {
		assert dvd.getCategory() != null && dvd.getDirector() !=null &&dvd.getTitle()!=null: "Error because DVD has null";
				 
		assert dvd.getCategory() != "" && dvd.getDirector() != "" && dvd.getTitle() !="" :"Error because have empty ";
	}

}
