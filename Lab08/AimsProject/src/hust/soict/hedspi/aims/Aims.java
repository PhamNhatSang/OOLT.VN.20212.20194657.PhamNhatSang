package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.*; 
import java.util.List;
import java.util.Scanner;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

public class Aims {

	
	
	public static void main(String[] args) {
	//showMenu();
		java.util.Collection collection = new java.util.ArrayList();
		DigitalVideoDisc [] listdvd =new DigitalVideoDisc[12];
	       listdvd[0]=new DigitalVideoDisc( "Dac Nhan Tam","BookDVD",33.65f,120,"Dale Carnegie");
	       listdvd[1]=new DigitalVideoDisc( "Tuesdays with Morrie","BookDVD",88.55f,140,"Mitch Albom");
	       listdvd[2]=new DigitalVideoDisc( "To kill a mocking bird","BookDVD",64.65f,156,"Harper Lee");
	       listdvd[3]=new DigitalVideoDisc( "The Story of a Seagull and the Cat Who Taught Her to Fly","BookDVD",125.4f,122,"Luis Sepúlveda");
	       listdvd[4]=new DigitalVideoDisc( "Alice’s adventures in wonderland","BookDVD",99.43f,170,"Lewis Carrol");
	       listdvd[5]=new DigitalVideoDisc( "The Little Prince","BookDVD",40.65f,127,"Saint-Exupéry");
	       listdvd[6]=new DigitalVideoDisc( "The Catcher In The Rye","BookDVD",44.65f,222,"J.D.Salinger");
	       listdvd[7]=new DigitalVideoDisc( "One Piece","Anime",155.65f,1200,"Oda");
	       listdvd[8]=new DigitalVideoDisc( "Kimetsu no Yaiba","Anime",96.65f,180,"Sotozaki Haruo");
	       listdvd[9]=new DigitalVideoDisc( "Avengers Endgame","Action Movie",48.65f,166,"Kevin Kleird");
	       listdvd[10]=new DigitalVideoDisc( "Doctor Strange in Multiverse of Madness","Action Movie",80.65f,126,"Sam Raimi");
	       listdvd[11]=new DigitalVideoDisc( "Gone with the wine","BookDVD",30.65f,121,"Victor Fleming");
			
	       List<String> author1 = new ArrayList<String>();	
	       List<String> author2 = new ArrayList<String>();
	       List<String> author3 = new ArrayList<String>();
	       List<String> author4 = new ArrayList<String>();
	       List<String> author5 = new ArrayList<String>();
	       author1.add("Sharim Khann");
	       author1.add("Ernest Hemingway");
	       author1.add("Franz Kafka");
	       author2.add("J.R.R.Tolkien");
	       author2.add("Gabriel Garcia Marquez");
	       author2.add("Harper Lee");
	       author3.add("Hong Nuong Tu");
	       author3.add("Brian Tracy");
	       author3.add("Jordan Belfort");
	       author4.add("Tony");
	       author4.add("Alonso Fernández de Avellaneda");
	       author4.add("Alexandra Ripley");
	       author5.add("Sebastian Faulkes");
	       author5.add("Anthony Horowitz");
	       author5.add("Vasily Staroy");
	       
	      Book [] listbook =new Book[5]; 
	      listbook[0]= new Book("The god of the ring","Adventure book",16.50f,author2);
	      listbook[1]= new Book("The Alchemist","Adventure book",24.63f,author4);
	      listbook[2]= new Book("The godfather ","Mafia book",35.53f,author3);
	      listbook[3]= new Book("The Old Man and the Sea","Emotion book",22.33f,author1);
	      listbook[4]= new Book("Don Quixote","History book",15.89f,author5);
          CompactDisc [] listcd= new CompactDisc[5];
          ArrayList<Track> track1 = new ArrayList<Track>();
          ArrayList<Track> track2 = new ArrayList<Track>();
          ArrayList<Track> track3 = new ArrayList<Track>();
          ArrayList<Track> track4 = new ArrayList<Track>();
          ArrayList<Track> track5 = new ArrayList<Track>();
         track1.add(new Track("Perfect",6));
         track1.add(new Track("Shape of you",7));
         track1.add(new Track("Photograph",8));
         track1.add(new Track("Overpass Graffiti",5));
         track2.add(new Track("Blank Space",7));
         track2.add(new Track("Bad Blood",4));
         track2.add(new Track("Love Story",5));
         track2.add(new Track("Shake it off",8));
         track3.add(new Track("Payphone",5));
         track3.add(new Track("Animals",6));
         track3.add(new Track("Girls like you",6));
         track3.add(new Track("Sugar",9));
         track4.add(new Track("The night",4));
         track4.add(new Track("Wake me up",9));
         track4.add(new Track("Waiting for love",6));
         track4.add(new Track("Hey Brother",7));
         track5.add(new Track("We don't talk anymore",7));
         track5.add(new Track("Attention",5));
         track5.add(new Track("One Call Away",8));
         track5.add(new Track("Cheating on you",9));
         listcd[0] =new CompactDisc("The Songs of Ed Sheran","Music",88.65f,26,"AsB Media","Ed Sheran",track1);
         
         listcd[1] =new CompactDisc("The Songs of TayLor","Music",128.65f,24,"ADC Entertainment","Taylor Swift",track2);
         listcd[2] =new CompactDisc("The Songs of Maroon 5","Music",135.65f,26,"Maroon Entertainment","Maroon 5",track3);
         listcd[3] =new CompactDisc("The Songs of Avicii","Music EDM",166.75f,26,"AVC Media","Avicii",track4);
         listcd[4] =new CompactDisc("The Songs of Charlie Puth","Music",148.85f,27,"Free Studio","Charlie Puth",track5);
         
 Order or= new Order();
 
   collection.add(listdvd[0]);
   collection.add(listdvd[1]);
   collection.add(listdvd[2]);
   collection.add(listdvd[3]);
   collection.add(listdvd[4]);
   collection.add(listdvd[5]);
   collection.add(listdvd[6]);
   collection.add(listdvd[7]);
   collection.add(listdvd[8]);
   collection.add(listdvd[9]);
   collection.add(listdvd[10]);
   //collection.add(listbook[0]);
  // collection.add(listbook[1]);
   //collection.add(listbook[2]);
   //collection.add(listbook[3]);
  // collection.add(listbook[4]);
  // collection.add(listcd[0]);
  // collection.add(listcd[1]);
  // collection.add(listcd[2]);
   
   java.util.Iterator iterator = collection.iterator();
      System.out.println("-----------------------");
      System.out.println("The Medias curently in the order ");
      
      while(iterator.hasNext()) {
    	  ((DigitalVideoDisc)iterator.next()).Print();
      }
     java.util.Collections.sort((java.util.List)collection);
        iterator=collection.iterator();
        System.out.println("-----------------------");
        System.out.println("The Medias after sort ");
        while(iterator.hasNext()) {
        	System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
       collection.remove(listdvd[0]);
       collection.remove(listdvd[1]);
       collection.remove(listdvd[2]);
       collection.remove(listdvd[3]);
       collection.remove(listdvd[4]);
       collection.remove(listdvd[5]);
       collection.remove(listdvd[6]);
       collection.remove(listdvd[7]);
       collection.remove(listdvd[8]);
       collection.remove(listdvd[9]);
       collection.remove(listdvd[10]);
       collection.add(listcd[0]);
       collection.add(listcd[1]);
       collection.add(listcd[2]);
       collection.add(listcd[3]);
       collection.add(listcd[4]);
       iterator = collection.iterator();
       System.out.println("-----------------------");
       System.out.println("The CD curently in the order ");
       while(iterator.hasNext()) {
     	  ((CompactDisc)iterator.next()).Print();
       }
       java.util.Collections.sort((java.util.List)collection); 
       iterator=collection.iterator();
        System.out.println("-----------------------");
        System.out.println("The Cd after sort ");
        while(iterator.hasNext()) {
        	CompactDisc cd=(CompactDisc)iterator.next();
        	System.out.println(cd.getTitle()+" "+cd.GetsizeofTrack()+" "+cd.getLength());
        }
        List<CompactDisc> discs = new ArrayList<CompactDisc>(); 
        for(int i=0;i<5;i++) {
        	discs.add(listcd[i]);
        }
        
        java.util.Collections.sort(discs);
        for(int i=0;i<5;i++) {
        	System.out.println(discs.get(i).getTitle());
        }

}
	public static void showMenu() {
		Order order= new Order();
		
		while(true) {  
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner keyboard = new Scanner(System.in);
		int choice = keyboard.nextInt();
		if(choice==1) {
			order= new Order();
		}
        if(choice==2) {
			order.Creatitem();
		}
if(choice==3) {
	System.out.print("Nhap id can xoa: ");
	int id = keyboard.nextInt();
	order.removeMedia(id);
	
		}
if(choice==4) {
	order.Printlist();
	
}
if(choice==0) {
	System.out.println("exit success");
	break;
	
}
		}
}
    public static Order CreatnewOrder() {
    	Order order=new Order();
    	return order;
    }
   
	
}
