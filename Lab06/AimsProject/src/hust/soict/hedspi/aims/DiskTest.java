package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
public class DiskTest {

	public static void main(String[] args) {
		DigitalVideoDisc [] listdvd =new DigitalVideoDisc[12];
	       listdvd[0]=new DigitalVideoDisc( "Dac  Harry Nhan pOtTer Tam","Book","Dale Carnegie",120,33.65f);
	       listdvd[1]=new DigitalVideoDisc( "Tuesdays with Morrie","Book","Mitch Albom",140,88.55f);
	       listdvd[2]=new DigitalVideoDisc( "To kill a mocking bird","Book","Harper Lee",156,64.65f);
	       listdvd[3]=new DigitalVideoDisc( "The Story hArry of a Potter Seagull and the Cat Who Taught Her to Fly","Book","Luis Sepúlveda",122,125.4f);
	       listdvd[4]=new DigitalVideoDisc( "Alice’s adventures in wonderland","Book","Lewis Carrol",170,99.43f);
	       listdvd[5]=new DigitalVideoDisc( "The Little Prince","Book","Saint-Exupéry",127,40.65f);
	       listdvd[6]=new DigitalVideoDisc( "The Catcher In The Rye","Book","J.D.Salinger",222,44.65f);
	       listdvd[7]=new DigitalVideoDisc( "One Piece","Anime","Oda",1200,155.65f);
	       listdvd[8]=new DigitalVideoDisc( "hArry Kimetsu no Yaiba POTTER","Anime","Sotozaki Haruo",180,96.65f);
	       listdvd[9]=new DigitalVideoDisc( "Avengers Endgame","Movie","Kevin Kleird",166,48.65f);
	       listdvd[10]=new DigitalVideoDisc( "Doctor Strange in Multiverse of Madness","Movie","Sam Raimi",126,80.65f);
	       listdvd[11]=new DigitalVideoDisc( "Gone with the win","Book","Victor Fleming",121,30.65f);
	      
	       for(int i=0;i<12;i++) {
	    	   AssertDisk(listdvd[i]);
	    	   System.out.println("listdvd["+i+"]"+"is: " + listdvd[i].search("Harry Potter"));
	       }
	       Order anOrder = new Order();
	       anOrder.addMedia(listdvd);
	       System.out.println("Before have luckyitem: ");
	       anOrder.Printlist();
	       DigitalVideoDisc dvds=(DigitalVideoDisc )anOrder.getALuckyItem();
	       System.out.println("The lucky item is: ["+dvds.getTitle()+"]-"+"["+dvds.getDirector()+"]-"+"["+dvds.getCategory()+"]-"+"["+dvds.getLength()+"]");
	       System.out.println("After have luckyitem: ");
	       anOrder.Printlist();

	}
	
	public static void AssertDisk(DigitalVideoDisc dvd) {
		assert dvd.getCategory()==null||dvd.getDirector()==null||dvd.getTitle()==null :"Error because dvd has null";
		assert dvd.getCategory()==""||dvd.getDirector()==""||dvd.getTitle()=="":"Error because dvd has empty" ;
		assert dvd.getLength()==0: "Error because dvd do not have 0 length";
	}

}
