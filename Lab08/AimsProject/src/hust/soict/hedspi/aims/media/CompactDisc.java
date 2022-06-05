package hust.soict.hedspi.aims.media;
import java.util.*; 

public class CompactDisc extends Disc implements Playable{
private String artist;
private  ArrayList<Track> tracks = new ArrayList<Track>();
public CompactDisc() {
	super();
}
public CompactDisc(String title,String category,float cost,int length,String director,String artist,ArrayList<Track> tracks) {
	super(title,category,cost,length,director);
	this.artist=artist;
	this.tracks=tracks;
}
public String getArtist() {
	return artist;
}
public boolean CheckTrack(Track tracks) {
	for(int i=0;i<this.tracks.size();i++) {
		if(this.tracks.get(i).equals(tracks)==true) {
			return true;
		}
	}
	return false;
}
public void addTrack(Track tracks) {
	for(int i=0;i<this.tracks.size();i++) {
		if(CheckTrack(tracks)==true) {
			System.out.println("The track had been exsited");
			return;
		}
	}
	this.tracks.add(tracks);
	System.out.println("Add success");
}
public void removeTrack(Track tracks) {
	for(int i=0;i<this.tracks.size();i++) {
		if(CheckTrack(tracks)==true) {
			this.tracks.remove(i);
			System.out.println("The track is deleted");
			return;
			
		}
	}
	System.out.println("Can't find the item");
}
public int getLength() {
	int sumLength=0;
	for(int i=0;i<this.tracks.size();i++) {
		sumLength+=this.tracks.get(i).getLength();
	}
	return sumLength;
}
public void play() {
	System.out.println("Some imformation of CD: Artist: "+this.getArtist()+"-"+"Director: "+super.getDirector()+"-"+"Length: "+this.getLength());
    for(int i=0;i<this.tracks.size();i++) {
    	this.tracks.get(i).play();
    	System.out.println("**********************");
    }
}
public void Print() {
	 System.out.println("["+"CD]"+"["+super.getDirector()+"]-["+"["+super.getCategory()+"]-["+super.getCost()+"]-["+super.getTitle()+"]-["+this.getArtist()+"]-["+this.getLength()+"]");
	 for(int i=0;i<tracks.size();i++) {
		 System.out.println("Track" +i+" title: "+tracks.get(i).getTitle());
		 System.out.println("Track" +i+" length: "+tracks.get(i).getLength());

	 }
}
public int GetsizeofTrack() {
	return this.tracks.size();
}

public int compareTo(CompactDisc obj) {
	
	assert (CompactDisc)obj != null :"Error because has null";
 	assert getClass().getSimpleName() == obj.getClass().getSimpleName() :"Error because does't match class";
    CompactDisc tmp = (CompactDisc) obj;
    if(tmp.GetsizeofTrack()==this.tracks.size()) {
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
if(tmp.GetsizeofTrack()<this.tracks.size()) {
    	return 1;
    }
return -1;
}
}
