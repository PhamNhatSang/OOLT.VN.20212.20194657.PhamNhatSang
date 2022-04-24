import java.util.Scanner;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		// Create a new dvd object and set the fields
        DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King");
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
        DigitalVideoDisc dvd11= new DigitalVideoDisc("Senkaiuuu");
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
        DigitalVideoDisc dvd10= new DigitalVideoDisc("Senkaiiiii");
        dvd10.setCategory("Anime");
        dvd10.setCost(33.00f);
        dvd10.setDirector("Makoto ");
        dvd10.setLength(56);
        anOrder.addDigitalVideoDisc(dvd10);
        anOrder.removeDigitalVideoDisc(dvd11);
        anOrder.removeDigitalVideoDisc(dvd6);
        anOrder.removeDigitalVideoDisc(dvd1);
       
        
        
        System.out.println("Total Cost is:");
        System.out.println(anOrder.totalCost());
	}

}
