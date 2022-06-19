package hust.soict.hedspi.aims;
import java.util.*;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
public class BookTest {

	public static void main(String[] args) {
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
	       Book listbook= new Book("The god of the ring","Adventure book",16.50f,author2);
	       listbook.setContent("This tale grew in the telling until it became a history of the Great War of the Ring and included many glimpses of the yet more ancient history that preceded it.It was begun soon after The Hobbit was written and before its publication in 1937");
	       		
	       String check= listbook.toString();
	}
	
}
