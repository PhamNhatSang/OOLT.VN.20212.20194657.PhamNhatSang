package hust.soict.hedspi.aims;
import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.test.disc.TestPassingParameter;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		Order anOrder1 = new Order();
		Order anOrder2 = new Order();
		Order anOrder3 = new Order();
		Order anOrder4 = new Order();
		Order anOrder5 = new Order();

		 DigitalVideoDisc dvd1= new DigitalVideoDisc("Star ");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.5f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);
       
        DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("Jonh Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4= new DigitalVideoDisc("Rain of blue");
        dvd4.setCategory("Anime");
        dvd4.setCost(16.77f);
        dvd4.setDirector("Makoto Aoi");
        dvd4.setLength(30);
        anOrder.addDigitalVideoDisc(dvd4);
        
        DigitalVideoDisc dvd5= new DigitalVideoDisc("Tenki no ko");
        dvd5.setCategory("Anime");
        dvd5.setCost(34.66f);
        dvd5.setDirector("Makoto Shinkai");
        dvd5.setLength(50);
        anOrder.addDigitalVideoDisc(dvd5);
        DigitalVideoDisc dvd6= new DigitalVideoDisc("Kimetsu no Yaiba");
        dvd6.setCategory("Anime");
        dvd6.setCost(34.00f);
        dvd6.setDirector("Natsumi");
        dvd6.setLength(50);
        anOrder.addDigitalVideoDisc(dvd6);
        DigitalVideoDisc dvd7= new DigitalVideoDisc("Senkaijjj");
        dvd7.setCategory("Anime");
        dvd7.setCost(33.00f);
        dvd7.setDirector("Makoto ");
        dvd7.setLength(56);
        anOrder.addDigitalVideoDisc(dvd7);
        DigitalVideoDisc dvd11= new DigitalVideoDisc("Senkaiuuuhh");
        dvd11.setCategory("Anime");
        dvd11.setCost(33.00f);
        dvd11.setDirector("Makoto ");
        dvd11.setLength(56);
        anOrder.addDigitalVideoDisc(dvd11);
        
        DigitalVideoDisc dvd8= new DigitalVideoDisc("When we meet");
        dvd8.setCategory("Drama");
        dvd8.setCost(43.00f);
        dvd8.setDirector("Stephen ");
        dvd8.setLength(56);
        anOrder.addDigitalVideoDisc(dvd8);
        
        DigitalVideoDisc dvd9= new DigitalVideoDisc("Senkaiiii");
        dvd9.setCategory("Anime");
        dvd9.setCost(33.00f);
        dvd9.setDirector("Makoto ");
        dvd9.setLength(56);
        anOrder.addDigitalVideoDisc(dvd9);
        DigitalVideoDisc dvd10= new DigitalVideoDisc("Senkaiiihjkhi");
        dvd10.setCategory("Anime");
        dvd10.setCost(33.00f);
        dvd10.setDirector("Makoto ");
        dvd10.setLength(56);
       anOrder1.addDigitalVideoDisc(dvd1);
       anOrder1.addDigitalVideoDisc(dvd2);
       anOrder1.addDigitalVideoDisc(dvd3);
       anOrder1.addDigitalVideoDisc(dvd4);
       anOrder1.addDigitalVideoDisc(dvd5);
       anOrder1.addDigitalVideoDisc(dvd6);
       anOrder1.addDigitalVideoDisc(dvd7);
       anOrder1.addDigitalVideoDisc(dvd8,dvd9);
       anOrder1.addDigitalVideoDisc(dvd10,dvd11);
       anOrder.removeDigitalVideoDisc(dvd11);
       anOrder.removeDigitalVideoDisc(dvd6);
       anOrder.removeDigitalVideoDisc(dvd1);
       anOrder5.addDigitalVideoDisc(dvd10);
       DigitalVideoDisc [] listdvd =new DigitalVideoDisc[12];
       listdvd[0]=new DigitalVideoDisc( "Dac Nhan Tam","Book","Dale Carnegie",120,33.65f);
       listdvd[1]=new DigitalVideoDisc( "Tuesdays with Morrie","Book","Mitch Albom",140,88.55f);
       listdvd[2]=new DigitalVideoDisc( "To kill a mocking bird","Book","Harper Lee",156,64.65f);
       listdvd[3]=new DigitalVideoDisc( "The Story of a Seagull and the Cat Who Taught Her to Fly","Book","Luis Sepúlveda",122,125.4f);
       listdvd[4]=new DigitalVideoDisc( "Alice’s adventures in wonderland","Book","Lewis Carrol",170,99.43f);
       listdvd[5]=new DigitalVideoDisc( "The Little Prince","Book","Saint-Exupéry",127,40.65f);
       listdvd[6]=new DigitalVideoDisc( "The Catcher In The Rye","Book","J.D.Salinger",222,44.65f);
       listdvd[7]=new DigitalVideoDisc( "One Piece","Anime","Oda",1200,155.65f);
       listdvd[8]=new DigitalVideoDisc( "Kimetsu no Yaiba","Anime","Sotozaki Haruo",180,96.65f);
       listdvd[9]=new DigitalVideoDisc( "Avengers Endgame","Movie","Kevin Kleird",166,48.65f);
       listdvd[10]=new DigitalVideoDisc( "Doctor Strange in Multiverse of Madness","Movie","Sam Raimi",126,80.65f);
       listdvd[11]=new DigitalVideoDisc( "Gone with the win","Book","Victor Fleming",121,30.65f);
    	anOrder2.addDigitalVideoDisc(listdvd);
        anOrder1.Printlist();
        anOrder2.Printlist();
        anOrder.Printlist();
        DigitalVideoDisc dvd13 =new DigitalVideoDisc("white king");
        TestPassingParameter.checkDVD(dvd13);
        
        System.out.println("Total Cost is:");
        System.out.println(anOrder.totalCost());
	}
	
	

}
