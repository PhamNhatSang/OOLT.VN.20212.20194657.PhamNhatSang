package hust.soict.hedspi.gui.javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFXCounter extends Application {
	private TextField tfCount;
	   private Button btnCount;
	   private int count = 1;
	   private Button atnCount;
	  
	   public void start(Stage primaryStage) {
	      // Allocate controls
		   String name ="1";
	      tfCount = new TextField(name);
	      tfCount.setEditable(true);
	      
	      
	      btnCount = new Button("Count");
	      atnCount =new Button("Down");
	      atnCount.setOnAction(evt->tfCount.setText(--count+  ""));
	      
	      btnCount.setOnAction(evt -> tfCount.setText(++count + ""));
	      
	      // Create a scene graph of node rooted at a FlowPane
	      FlowPane flow = new FlowPane();

	      flow.setPadding(new Insets(10, 12, 15, 12));  // top, right, bottom, left
	      flow.setVgap(10);  // Vertical gap between nodes in pixels
	      flow.setHgap(10);  // Horizontal gap between nodes in pixels
	      flow.setAlignment(Pos.CENTER);  // Alignment
	      flow.getChildren().addAll(btnCount, tfCount, atnCount);
	   // Setup scene and stage
	      primaryStage.setScene(new Scene(flow, 300, 120));
	      primaryStage.setTitle("JavaFX Counter");
	      primaryStage.show();
	   }
	 
	   public static void main(String[] args) {
		  launch(args);  
	    }

}
