package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;	
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}

 public DigitalVideoDisc(String title) {
	 super();
	 setTitle(title);
 }
 public DigitalVideoDisc(String title,String category) {
	 this(title);
	 setCategory(category);
 }
 public DigitalVideoDisc(String title,String category,String director) {
	this(title,category);
	 this.director=director;
 }
 public DigitalVideoDisc(String title,String category,String director,int length,float cost) {
	 this(title,category,director);
	 this.length=length;
	 setCost(cost);
 }
 public void Print() {
	 System.out.println("["+"DVD]"+"["+this.getCategory()+"]-["+this.getDirector()+"]-["+this.getCost()+"]-["+this.getLength()+"]-["+this.getTitle()+"]");
 }
 public boolean search(String title) {
	 String[] tmp = title.split(" ");
	 
	 for(int i=0;i<tmp.length;i++) {
		 
		 if(getTitle().toLowerCase().contains(tmp[i].toLowerCase()) == false) {
		 return false;
		 }
	 }
	 return true;
	}
}
 
