package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	
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
 public void play() throws PlayerException {
	 if(this.getLength()>0) {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	 }else {
		 throw new PlayerException("Error:DVD length is non-positve");
	 }
	}

 /*public int compareTo(DigitalVideoDisc obj) {
		
	assert (DigitalVideoDisc)obj != null :"Error because has null";
 	assert getClass().getSimpleName() == obj.getClass().getSimpleName() :"Error because does't match class";
DigitalVideoDisc tmp = (DigitalVideoDisc) obj;
 if(tmp.getCost()==this.getCost()) {
	 if(tmp.getLength()==this.getLength()) {
		 if(tmp.getTitle().compareTo(this.getTitle())==0) {
			 return 0;
		 }
		 if(tmp.getTitle().compareTo(this.getTitle())<0) {
			 return 1;
		 }
		 return -1;
	 }
 if(tmp.getLength()<this.getLength()) {
		 return 1;
	 }
 return -1;
	 
 }
 if(tmp.getCost()<this.getCost()) {
	 return 1;
 }
 return -1;
}*/
 public String toString() {
	 return this.getTitle();
 }
 public String getDetail() {
	 String tmp="["+"DVD]"+"["+super.getCategory()+"]-["+super.getDirector()+"]-["+super.getCost()+"]-["+super.getTitle()+"]";
	 return tmp;
 }
}
 
