package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc (String title,String category,float cost,int length,String director) {
		super(title,category,cost,length,director);
		
	}


 

 public void Print() {
	 System.out.println("["+"DVD]"+"["+super.getCategory()+"]-["+super.getDirector()+"]-["+super.getCost()+"]-["+super.getLength()+"]-["+super.getTitle()+"]");
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
 public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
 
