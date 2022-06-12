package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.order.Order;

public class Track implements Playable,Comparable<Track> {
private String title;
private int length;
public Track() {
	super();
}
public Track(String title) {
	this.title=title;
}
public Track(String title,int length) {
	this(title);
	this.length=length;
}
public String getTitle() {
	return title;
}
public int getLength() {
	return length;
}
public void play() {
	System.out.println("Playing Track: " + this.getTitle());
	System.out.println("Track length: " + this.getLength());
}
public boolean equals(Object obj) {
	
    if (obj == null)
        return false;
    if (getClass().getSimpleName() != obj.getClass().getSimpleName())
        return false;
    Track tmp = (Track) obj;
    if(this.length==tmp.getLength()&&this.title==tmp.getTitle()) {
    	return true;
    }
    return false;
}

public int compareTo(Track obj) {
	assert obj != null :"Error because has null";
   	assert getClass() == obj.getClass() :"Error because does't match class";
   //Track tmp = (Track) obj;
   if(obj.getTitle().compareTo(this.title)==0) {
   	return 0;
   }
   if(obj.getTitle().compareTo(this.title)<0) {
   	return 1;
   }
    return -1;
	
}
}
