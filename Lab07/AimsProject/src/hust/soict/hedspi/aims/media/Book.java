package hust.soict.hedspi.aims.media;
import java.util.*; 
public class Book extends Media{
private List<String> authors = new ArrayList<String>();
public Book() {
	super();
	
}
public Book(String title,String category,float cost,List<String> authors) {
	super(title,category,cost);
	this.authors=authors;
}
public void addAuthor(String authorName) {
	for(int i=0;i<this.authors.size();i++) {
		if(this.authors.get(i).equals(authorName)) {
			System.out.println("Author is in list");
			return;
		}
	}
	this.authors.add(authorName);
}
public void removeAuthor(String authorName) {
	for(int i=0;i<this.authors.size();i++) {
		if(this.authors.get(i).equals(authorName)) {
			System.out.println("Remove auhtor done");
			this.authors.remove(i);
			return;
		}
	}
	System.out.println("can't remove be cause does't have this author");
	
}
public void Print() {
	 System.out.println("["+"Book]"+"["+this.getCategory()+"]-["+this.getCost()+"]-["+this.getTitle()+"]");
	 for(int i=0;i<authors.size();i++) {
		 System.out.println("["+authors.get(i)+"]"+" ");

	 }
}
}
