package hust.soict.hedspi.aims.order;
import java.time.LocalDate;
import java.util.*;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.*; 

public class Order {
	public static final int MAX_NUMBERS_ORDERS=5;
	 private static int nOrders=0; 
 int itemorders=0;
 public static final int MAX_NUMBERS_ORDERED=10;
 private static MyDate dateOrdered;
 private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
 public Order() {
	 if(this.nOrders>=this.MAX_NUMBERS_ORDERS) {
		System.out.println("full size of orders");
		 this.itemorders=this.nOrders;
	 }else {
			this.dateOrdered=new MyDate();
			LocalDate h=java.time.LocalDate.now();
			String date=h.toString();
			int days,months,years;
			String[] checkM = {"January","February","March","April","May","June","July","August","September","October","November","December"};

			String[] daysconvert={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","21th","22th","23th","24th","25th","26th","27th","28th","29th","30th","31st"};
			String [] part=date.split("-");
			days=Integer.parseInt(part[2]);
			months=Integer.parseInt(part[1]);
			years=Integer.parseInt(part[0]);
			this.dateOrdered.setDay(days);
			this.dateOrdered.setMonth(months);
			this.dateOrdered.setYear(years);
	
		 this.nOrders++;
		 this.itemorders=this.nOrders;
		 
	 }
 }
 public void addMedia(Media media) {
	 if(this.itemorders<MAX_NUMBERS_ORDERS) {
		 if(this.itemsOrdered.size()<MAX_NUMBERS_ORDERED) {
		 this.itemsOrdered.add(media);
		// System.out.println("The item has been added");
		 }else {
			// System.out.println("The order is almost full");
		 }
 }else {
	 System.out.println("Can't add because full size of orders");
 }
}
 public  void addMedia(Media [] mediaList) {
		if(this.itemorders<MAX_NUMBERS_ORDERS) {
		for(int i=0;i< mediaList.length;i++) {
			addMedia(mediaList[i]);
			if(i>MAX_NUMBERS_ORDERED) {
				break;
			}
		}
		}else {
			System.out.println("Can't add because full size of orders");
		}
	}
 public  void addMedia(Media media1,Media media2) {
		if(this.itemorders<MAX_NUMBERS_ORDERS) {
			
			if(this.itemsOrdered.size()<MAX_NUMBERS_ORDERED) {
		       addMedia(media1);
			}else {
				media1.Print();
			}
			if(this.itemsOrdered.size()==MAX_NUMBERS_ORDERED) {
				System.out.println("The item quantity has reached its limit.");
			}
			if(this.itemsOrdered.size()<MAX_NUMBERS_ORDERED) {
		        addMedia(media2);
			}else {
				media2.Print();
			}
		}else {
			System.out.println("Can't add because full size of orders");
		}
	}

public  void removeMedia(Media media)  {
	int index;
	for(int i=0;i<this.itemsOrdered.size();i++) {
		if(Media.compare(this.itemsOrdered.get(i),media)==1) {
			this.itemsOrdered.remove(i);
			System.out.println("Remove ok");
			return;
		}
	}
	
	System.out.println("Can't remove because  does't have this element");
}
public void removeMedia(int id) {
	if(id>=0&&id<this.itemorders) {
		for(int i=0;i<this.itemorders;i++) {
			if(i==id) {
				this.itemsOrdered.remove(i);
				return;
			}
		}
	}
	
	System.out.println("Can't remove because  does't have this element");
}
public float totalCost() {
	float sum=0;
	for(int i=0;i<this.itemsOrdered.size();i++) {
		sum+=this.itemsOrdered.get(i).getCost();
	}
	return sum;
}
public void Printlist() {
	System.out.println("***********************Order***********************");
	System.out.print("Date :");
    MyDate.print1(dateOrdered);
	for(int i=0;i<this.itemsOrdered.size();i++) {
		this.itemsOrdered.get(i).Print();
	}
	
	System.out.println("Total cost: "+"["+totalCost()+"]");
	System.out.println("***************************************************");

}

public void Creatitem() {
	
	
     
System.out.println("Select type to add (choose 1,2,3,0)");
System.out.println("--------------------------------");
System.out.println("1. Book");
System.out.println("2. CompactDisc");
System.out.println("3. DigitalVideoDisc");
System.out.println("0. Exit");
System.out.println("--------------------------------");
Scanner keyboard = new Scanner(System.in);
int choice= keyboard.nextInt();
     if(choice==1) {
    	String title;
    	String category;
    	float cost;
    	System.out.println("Input title:");
    	keyboard.nextLine();
    	title=keyboard.nextLine();
    	
    	System.out.println("Input title:"+title);
    	
    	System.out.println("Input category:");
    	category=keyboard.nextLine();
    	System.out.println("Input cost:");
    	
    	cost=keyboard.nextFloat();
   
    	System.out.println("Input the number of authors:");
        int number=keyboard.nextInt();
        keyboard.nextLine();
       List<String> authors = new ArrayList<String>();

        for(int i=0;i<number;i++) {
        	System.out.println("Input name of author");
        	
        	String author=keyboard.nextLine();
        	authors.add(author);
        }
        
    	Book books=new Book(title,category,cost,authors);
    	addMedia(books);
    	
     }
    
     if(choice==2) {
     	String title;
     	String category;
     	String director;
     	String artist;
     	int length=0;
     	ArrayList<Track> tracks = new ArrayList<Track>();
     	float cost;
     	System.out.println("Input title:");
    	keyboard.nextLine();

     	title=keyboard.nextLine();
     	System.out.println("Input category:");
     	
     	category=keyboard.nextLine();
     	System.out.println("Input cost:");
     	
     	cost=keyboard.nextFloat();
        System.out.println("Input director");
        keyboard.nextLine();
        director=keyboard.nextLine();
        System.out.println("Input artist");
        artist=keyboard.nextLine();
     	System.out.println("Input the number of Track:");
         int number=keyboard.nextInt();
     	keyboard.nextLine();

         for(int i=0;i<number;i++) {
        	 System.out.println("Input title of track");
         	String title1=keyboard.nextLine();
         	System.out.println("Input length of track");
         	int len=keyboard.nextInt();
         	keyboard.nextLine();
         	Track trackk=new Track(title1,len);
         	int check=0;
         	for(int j=0;j<tracks.size();j++) {
        		if(tracks.get(j).equals(tracks)==true) {
        			System.out.println("Tracks exsited");
        			check=1;
        		}
        	}
         	if(check==0) {
         		tracks.add(trackk);
         	}
         }
         
         for(int i=0;i<number;i++) {
        	 length+=tracks.get(i).getLength();
         }
         CompactDisc cd=new CompactDisc(title,category,cost,length,director,artist,tracks);
     	
     	addMedia(cd);
     	System.out.println("Do you want to play cd");
     	System.out.println("1.Play");
    	System.out.println("0.No");
     	int wantPlay=keyboard.nextInt();
     	if(wantPlay==1) {
     		cd.play();
     	}
     	
     	
      }
     if(choice==3) {
     	String title;
     	String category;
     	String director;
     	float cost;
     	System.out.println("Input title:");
    	keyboard.nextLine();

     	title=keyboard.nextLine();
     	System.out.println("Input category:");
     	
     	category=keyboard.nextLine();
     	System.out.println("Input cost:");
     	
     	cost=keyboard.nextFloat();
     	
        System.out.println("Input the length of DVD");
        int length=keyboard.nextInt();
        System.out.println("Input the director of DVD");
        keyboard.nextLine();
        director=keyboard.nextLine();
     	DigitalVideoDisc dvd=new DigitalVideoDisc (title,category,cost,length,director);
     	
     	addMedia(dvd);
     	
     	System.out.println("Do you want to play cd");
     	System.out.println("1.Play");
    	System.out.println("0.No");
    
     	int wantPlay=keyboard.nextInt();
     	if(wantPlay==1) {
     		dvd.play();
     	}
      }
	}
/*public Media getALuckyItem() {
	Media media =new Media();
 double i=(Math.random()) * ((this.itemsOrdered.size() - 0)) + 0;
 int index =(int ) i;
 for(int j=0;j<this.itemsOrdered.size();j++) {
	 if(j==index) {
		 this.itemsOrdered.get(j).setCost(0);;
		 return  this.itemsOrdered.get(j);
	 }
 }
 return media;
}*/
public ArrayList<Media> getItemsOrdered() {
	return itemsOrdered;
}
}
