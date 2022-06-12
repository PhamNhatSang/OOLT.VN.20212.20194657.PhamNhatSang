package hust.soict.hedspi.gui.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class test1 extends javafx.application.Application {
	   private Label response;

	   public void start(Stage myStage) {
	      myStage.setTitle("ListView Demo");
	      FlowPane rootNode = new FlowPane(10, 10);
	      rootNode.setAlignment(Pos.CENTER);
	      Scene myScene = new Scene(rootNode, 200, 120);
	      myStage.setScene(myScene);
	      response = new Label("Select Type");

	      ObservableList<String> dataList = FXCollections.observableArrayList("HTML", "CSS", "Java");

	      // Create the list view.
	      ListView<String> listView = new ListView<String>(dataList);

	      // Set the preferred height and width.
	      listView.setPrefSize(80, 80);

	      // Get the list view selection model.
	      MultipleSelectionModel<String> lvSelModel = listView.getSelectionModel();

	      lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {
	         public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {

	            String selItems = "";
	            ObservableList<String> selected = listView.getSelectionModel().getSelectedItems();

	             for (int i = 0; i < selected.size(); i++) {
	                selItems += "\n      " + selected.get(i); 
	             }
	               

	            response.setText("selected: " + selItems);
	         }
	      });

	      // Add the label and list view to the scene graph.
	      rootNode.getChildren().addAll(listView, response);

	     
	      myStage.show();
	   }
	   public static void main(String[] args) {

		      launch(args);
		   }
	}