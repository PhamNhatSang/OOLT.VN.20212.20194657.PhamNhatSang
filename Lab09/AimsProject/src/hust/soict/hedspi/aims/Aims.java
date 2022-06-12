package hust.soict.hedspi.aims;
import java.util.ArrayList;

import java.beans.EventHandler;
import java.util.*; 
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
import javafx.event.ActionEvent;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class Aims extends Application {
	private Button CreateOrder;  // Declare a "Button" control
	private Button Additem;
	private Button RemoveItem;
	private Button Display;
	
	private Order[] order= new Order[5];
	private Order orderTMP=new Order();
	  int i=0;
	   public void start(Stage primaryStage) {
	      // Allocate controls
	      
	      
	      CreateOrder =new Button("Create Order");
	      Additem =new Button("Add item");
	      RemoveItem=new Button("Remove Item");
	      Display =new Button("Display");
	      //atnCount.setOnAction(evt->tfCount.setText(--count+  ""));
	      CreateOrder.setOnAction(evt->CreateOrder());
	      //btnCount.setOnAction(evt -> tfCount.setText(++count + ""));
	      Additem.setOnAction(evt->AddiTem(primaryStage));
	      RemoveItem.setOnAction(evt->DeleteItem(primaryStage));
	      Display.setOnAction(evt->Display(primaryStage));
	      // Create a scene graph of node rooted at a FlowPane
	      FlowPane flow = new FlowPane();

	      flow.setPadding(new Insets(10, 12, 15, 12));  // top, right, bottom, left
	      flow.setVgap(10);  // Vertical gap between nodes in pixels
	      flow.setHgap(10);  // Horizontal gap between nodes in pixels
	      flow.setAlignment(Pos.TOP_CENTER);  // Alignment
	      flow.getChildren().addAll(CreateOrder, Additem, RemoveItem,Display);
	   // Setup scene and stage
	      primaryStage.setScene(new Scene(flow, 500, 120));
	      primaryStage.setTitle("Order Management Application: ");
	      primaryStage.show();
	   }
	public static void main(String[] args) {
		 launch(args);
		

}
	public void CreateOrder() {
		if(i >=5) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error for Order");

			// Header Text: null
			alert.setHeaderText(null);
			alert.setContentText("Can't create order because full");

			alert.showAndWait();
	    }else {
	    	order[i]= new Order();
			++i;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Notice");

			// Header Text: null
			alert.setHeaderText(null);
			alert.setContentText(" Create success");
			alert.showAndWait();
		
	    
		}
	}

public void AddiTem(Stage primary) {
	Button book =new Button("Book");
	Button dvd =new Button("DigitalVideoDisc");
	Button cd =new Button("CompactDisc");
	Button Back= new Button("Back");
	Back.setOnAction(evt->start(primary));
	 FlowPane flow = new FlowPane();
dvd.setOnAction(evt-> ListItemDVD(primary));
book.setOnAction(evt->ListItemBook(primary));
cd.setOnAction(evt->ListItemCD(primary));
     flow.setPadding(new Insets(10, 12, 15, 12));  // top, right, bottom, left
     flow.setVgap(10);  // Vertical gap between nodes in pixels
     flow.setHgap(10);  // Horizontal gap between nodes in pixels
     flow.setAlignment(Pos.TOP_CENTER);  // Alignment
     flow.getChildren().addAll(book, dvd, cd,Back);
  // Setup scene and stage
     primary.setScene(new Scene(flow, 500, 120));
     primary.setTitle("Menu add item ");
     primary.show();
	
	}
public void ListItemDVD(Stage primary) {
	
		Label label = new Label();
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
	       ObservableList<String> dvds = FXCollections.observableArrayList(listdvd[0].getTitle(), listdvd[1].getTitle(), listdvd[2].getTitle(),listdvd[3].getTitle(),listdvd[4].getTitle(),listdvd[5].getTitle(),listdvd[6].getTitle(),listdvd[7].getTitle(),listdvd[8].getTitle(),listdvd[9].getTitle(),listdvd[10].getTitle(),listdvd[11].getTitle());

	       // Create a ListView
	       ListView<String> listView = new ListView<String>(dvds);
	       Button Back = new Button();
	      
	       Back.setText("Back to the menu");
	       Back.setOnAction(evt->AddiTem(primary));
	       TextField tfCount= new TextField();
	       tfCount.setPromptText("Insert the title of dvd ");
	       
	       tfCount.setEditable(true);
	       tfCount.setPrefWidth(10);
	       
	       Button Insert = new Button();
	       Insert.setText("Insert ");
	      Insert.setOnAction(evt->{
	    	  int check=0;
	    	  for(int k=0;k<12;k++) {
	    		  if(tfCount.getText().toLowerCase().equals(listdvd[k].getTitle().toLowerCase())==true) {
	    			  check=1;
	    			  
	    				  order[i-1].addMedia(listdvd[k]);
	    				  Alert alert = new Alert(AlertType.CONFIRMATION);
	    					alert.setTitle("Notice");

	    					// Header Text: null
	    					alert.setHeaderText(null);
	    					alert.setContentText("Add to order success");

	    					alert.showAndWait();
	    			  
	    			  
	    		  }
	    	  }
	    	  if(check==0) {
	    		  Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error");

					// Header Text: null
					alert.setHeaderText(null);
					alert.setContentText("The item does't in the list");

					alert.showAndWait(); 
	    	  }
	      });
	       // Only allowed to select single row in the ListView.
	       listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

	     
	       MultipleSelectionModel<String> lvSelModel = listView.getSelectionModel();

		      lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
		         public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

		            String selItems = "";
		            ObservableList<String> selected = listView.getSelectionModel().getSelectedItems();

		             for (int i = 0; i < selected.size(); i++) {
		                selItems +=  selected.get(i); 
		             }
		               
  for(int i=0;i<12;i++) {
	  if(listdvd[i].getTitle().toLowerCase().equals(selItems.toLowerCase())==true) {
		  label.setText("Ttitle: " + selItems+", Category: "+listdvd[i].getCategory()+", Director: "+listdvd[i].getDirector()+", Cost: "+listdvd[i].getCost());
	  }
  }
		            
		         }
		      });
		      VBox root = new VBox();
		       root.getChildren().addAll(listView, label,tfCount,Insert,Back);
	      primary.setTitle("ListView & Insert item");

	       
	      // root.getChildren().addAll(listView, label,btnHello3);
	       
	       //stage.setTitle("ListView & ChangeListener (o7planning.org)");
	       
	       Scene scene = new Scene(root, 800, 600);
	     
	    
	       primary.setScene(scene);
	       primary.show();
	
       
}
public void ListItemBook(Stage primary) {
	Label label = new Label();
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
   ObservableList<String> dvds = FXCollections.observableArrayList(listbook[0].getTitle(),listbook[1].getTitle(),listbook[2].getTitle(),listbook[3].getTitle(),listbook[4].getTitle());
   ListView<String> listView = new ListView<String>(dvds);
   TextField tfCount= new TextField();
   tfCount.setPromptText("Insert the title of Book ");
   tfCount.setEditable(true);
   tfCount.setPrefWidth(10);
   Button Back = new Button();
   
   Back.setText("Back to the menu");
   Back.setOnAction(evt->AddiTem(primary));
   Button Insert = new Button();
   Insert.setText("Insert ");
  Insert.setOnAction(evt->{
	  int check=0;
	  for(int k=0;k<5;k++) {
		  if(tfCount.getText().toLowerCase().equals(listbook[k].getTitle().toLowerCase())==true) {
			  check=1;
			  if(i!=0) {
				  order[i-1].addMedia(listbook[k]);
				  Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle("Notice");

					// Header Text: null
					alert.setHeaderText(null);
					alert.setContentText("Add to order success");

					alert.showAndWait();
			  }else {
				  Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error");

					// Header Text: null
					alert.setHeaderText(null);
					alert.setContentText("You do not create any order");

					alert.showAndWait();
			  }
			  
		  }
	  }
	  if(check==0) {
		  Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");

			// Header Text: null
			alert.setHeaderText(null);
			alert.setContentText("The item is't in the list");

			alert.showAndWait(); 
	  }
  });
   // Only allowed to select single row in the ListView.
   listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

 
   MultipleSelectionModel<String> lvSelModel = listView.getSelectionModel();

      lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
         public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

            String selItems = "";
            ObservableList<String> selected = listView.getSelectionModel().getSelectedItems();

             for (int i = 0; i < selected.size(); i++) {
                selItems +=  selected.get(i); 
             }
               
for(int i=0;i<5;i++) {
if(listbook[i].getTitle().toLowerCase().equals(selItems.toLowerCase())==true) {
  label.setText("Ttitle: " + selItems+", Category: "+listbook[i].getCategory()+", Cost: "+listbook[i].getCost());
}
}
            
         }
      });
      VBox root = new VBox();
       root.getChildren().addAll(listView, label,tfCount,Insert,Back);
  primary.setTitle("ListView & Insert item");

   
  // root.getChildren().addAll(listView, label,btnHello3);
   
   //stage.setTitle("ListView & ChangeListener (o7planning.org)");
   
   Scene scene = new Scene(root, 800, 600);
 

   primary.setScene(scene);
   primary.show();
}
public void ListItemCD(Stage primary) {
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
    ObservableList<String> dvds = FXCollections.observableArrayList(listcd[0].getTitle(),listcd[1].getTitle(),listcd[2].getTitle(),listcd[3].getTitle(),listcd[4].getTitle());
    ListView<String> listView = new ListView<String>(dvds);
	Label label = new Label();

    Button Back = new Button();
    TextField tfCount= new TextField();
    tfCount.setPromptText("Insert the title of Book ");
    tfCount.setEditable(true);
    tfCount.setPrefWidth(10);
    Back.setText("Back to the menu");
    Back.setOnAction(evt->AddiTem(primary));
    Button Insert = new Button();
    Insert.setText("Insert ");
   Insert.setOnAction(evt->{
 	  int check=0;
 	  for(int k=0;k<5;k++) {
 		  if(tfCount.getText().toLowerCase().equals(listcd[k].getTitle().toLowerCase())==true) {
 			  check=1;
 			  if(i!=0) {
 				  order[i-1].addMedia(listcd[k]);
 				  Alert alert = new Alert(AlertType.CONFIRMATION);
 					alert.setTitle("Notice");

 					// Header Text: null
 					alert.setHeaderText(null);
 					alert.setContentText("Add to order success");

 					alert.showAndWait();
 			  }else {
 				  Alert alert = new Alert(AlertType.ERROR);
 					alert.setTitle("Error");

 					// Header Text: null
 					alert.setHeaderText(null);
 					alert.setContentText("You do not create any order");

 					alert.showAndWait();
 			  }
 			  
 		  }
 	  }
 	  if(check==0) {
 		  Alert alert = new Alert(AlertType.ERROR);
 			alert.setTitle("Error");

 			// Header Text: null
 			alert.setHeaderText(null);
 			alert.setContentText("The item is't in the list");

 			alert.showAndWait(); 
 	  }
   });
    // Only allowed to select single row in the ListView.
    listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

  
    MultipleSelectionModel<String> lvSelModel = listView.getSelectionModel();

       lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
          public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

             String selItems = "";
             ObservableList<String> selected = listView.getSelectionModel().getSelectedItems();

              for (int i = 0; i < selected.size(); i++) {
                 selItems +=  selected.get(i); 
              }
                
 for(int i=0;i<5;i++) {
 if(listcd[i].getTitle().toLowerCase().equals(selItems.toLowerCase())==true) {
	 
	 
   label.setText("Ttitle: " + selItems+", Category: "+listcd[i].getCategory()+", Cost: "+listcd[i].getCost()+listcd[i].NameofTrack());
 }
 }
             
          }
       });
       VBox root = new VBox();
        root.getChildren().addAll(listView, label,tfCount,Insert,Back);
   primary.setTitle("ListView & Insert item");

    
   // root.getChildren().addAll(listView, label,btnHello3);
    
    //stage.setTitle("ListView & ChangeListener (o7planning.org)");
    
    Scene scene = new Scene(root, 800, 600);
  

    primary.setScene(scene);
    primary.show();
}
public void DeleteItem(Stage primary) {
	
	TextField tfCount = new TextField();
    tfCount.setEditable(true);
    tfCount.setPromptText("Insert the id you want to delete");
    
    
    Button Remove = new Button("Remove");
    Button Back =new Button("Back");
    Back.setOnAction(evt->start(primary));
    
    Remove.setOnAction(evt -> {
    	if(i==0) {
    		 Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error");

				// Header Text: null
				alert.setHeaderText(null);
				alert.setContentText("You do not create any order");

				alert.showAndWait();
    	}else {
    	if(tfCount.getText().matches("-?\\d+(\\.\\d+)?")==true) {
    		int check=0;
    		for(int k=0;k<order[i-1].getItemsOrdered().size();k++ ) {
    			if(k==Integer.parseInt(tfCount.getText())) {
    				check=1;
    				order[i-1].removeMedia(k);
    				Alert alert = new Alert(AlertType.CONFIRMATION);
 					alert.setTitle("Notice");
 					alert.setHeaderText(null);
 					alert.setContentText("Remove item in order success");

 					alert.showAndWait();
 					
    			}
    		}
    		if(check==0) {
    			Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText(" ID is't in order success");

					alert.showAndWait();
    		}
    	}else {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(null);
			alert.setContentText(" ID is't a number");
			alert.showAndWait();
    	}
    	
    }});
    
    // Create a scene graph of node rooted at a FlowPane
    FlowPane flow = new FlowPane();

    flow.setPadding(new Insets(10, 12, 15, 12));  // top, right, bottom, left
    flow.setVgap(10);  // Vertical gap between nodes in pixels
    flow.setHgap(10);  // Horizontal gap between nodes in pixels
    flow.setAlignment(Pos.CENTER);  // Alignment
    flow.getChildren().addAll(Remove, tfCount, Back);
 // Setup scene and stage
    primary.setScene(new Scene(flow, 300, 120));
    primary.setTitle("Remove item");
    primary.show();
}

public void Display(Stage primary) {
	
	Button back = new Button();
	back.setText("Back");
	back.setOnAction(evt->start(primary));
	if(i==0) {
		 Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Notice");

			// Header Text: null
			alert.setHeaderText(null);
			alert.setContentText("Does't  have any orders");

			alert.showAndWait();
	}else {
		Button[] listbutton= new Button[i];
		int k=0;
		VBox root = new VBox();
		
		for( k=0;k<i;k++) {
			listbutton[k]=new Button();
			listbutton[k].setText("Order "+(k+1));
			
			root.getChildren().addAll(listbutton[k]);
			if(k==0) {
				listbutton[0].setOnAction(evt->SHowOrder( primary, order[0]));
			}
			if(k==1) {
				listbutton[1].setOnAction(evt->SHowOrder( primary, order[1]));
			}
			if(k==2) {
				listbutton[2].setOnAction(evt->SHowOrder( primary, order[2]));
			}
			if(k==3) {
				listbutton[3].setOnAction(evt->SHowOrder( primary, order[3]));
			}
			if(k==4) {
				listbutton[4].setOnAction(evt->SHowOrder( primary, order[4]));
			}
		}
		
		primary.setTitle("Display item");
	 Scene scene = new Scene(root, 300, 300);
	 root.getChildren().addAll(back);
	 primary.setScene(scene);
	 primary.show();
	}

	 
	}
	
	
	

public void SHowOrder(Stage primary,Order order1) {
	
	 ArrayList<Media> it =  new ArrayList<Media>();
	it =order1.getItemsOrdered();
	 ObservableList<String> dvds =FXCollections.observableArrayList();
	 for(int k=0;k<it.size();k++) {
		 dvds.add(it.get(k).getDetail());
	 }
	    ListView<String> listView = new ListView<String>(dvds);
	    Button back =new Button();
	    back.setText("Back");
	    back.setOnAction(evt->Display(primary));
	    
	    VBox root = new VBox();
        root.getChildren().addAll(listView,back);
   primary.setTitle("ListView  item");

    
    Scene scene = new Scene(root, 800, 600);
  

    primary.setScene(scene);
    primary.show();
	    
	    
}
	
	
}
