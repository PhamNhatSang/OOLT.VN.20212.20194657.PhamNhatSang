package hust.soict.hedspi.aims.media;
import java.util.*; 
import java.util.Map;
public class Book extends Media {
private List<String> authors = new ArrayList<String>();
private String content;
private List<String> contentTokens = new ArrayList<String>();
private Map<String,Integer> wordFrequency = new  TreeMap<String,Integer>();
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
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public void processContent() {
	String [] process = this.content.split("[ .]");
   
	List<String> contentTokens2 = new ArrayList<String>();
	for(int i=0;i<process.length;i++) {
		
			contentTokens2.add(process[i].toLowerCase());
	}
	Set<String> distinct = new HashSet<>(contentTokens2);
	for(String token:distinct) {
		
		this.contentTokens.add(token.toLowerCase());
		this.wordFrequency.put(token.toLowerCase(), Collections.frequency(contentTokens2, token.toLowerCase()));
	}
	
}
public static void show(Map<String, Integer> map) {
    Set<String> keySet = map.keySet();
    for (String key : keySet) {
        System.out.println(key + " : " + map.get(key));
    }
}
/*public String toString() {
	this.Print();
	System.out.println("The content of book:");
	System.out.println(this.content);
	System.out.println("Number of token: "+ this.contentTokens.size());
	System.out.println("-------List of token and frequency of each token-------");
	processContent();
	show(this.wordFrequency);
	return "complete";
}*/
public String toString() {
	return super.getTitle();
}
public String getDetail() {
	String tmp="["+"Book]"+"["+this.getCategory()+"]-["+this.getCost()+"]-["+this.getTitle()+"]";
	return tmp;
}
}
