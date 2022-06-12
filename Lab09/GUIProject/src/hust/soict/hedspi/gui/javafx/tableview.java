package hust.soict.hedspi.gui.javafx;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class tableview extends Application {

  @Override
  public void start(Stage stage) {

      TableView<UserAccount> table = new TableView<UserAccount>();

      // Create column UserName (Data type of String).
      TableColumn<UserAccount, String> userNameCol //
              = new TableColumn<UserAccount, String>("User Name");

      // Create column Email (Data type of String).
      TableColumn<UserAccount, String> emailCol//
              = new TableColumn<UserAccount, String>("Email");

      // Create column FullName (Data type of String).
      TableColumn<UserAccount, String> fullNameCol//
              = new TableColumn<UserAccount, String>("Full Name");

      // Create 2 sub column for FullName.
      TableColumn<UserAccount, String> firstNameCol //
              = new TableColumn<UserAccount, String>("First Name");

      TableColumn<UserAccount, String> lastNameCol //
              = new TableColumn<UserAccount, String>("Last Name");

      // Add sub columns to the FullName
      fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);

      // Active Column
      TableColumn<UserAccount, Boolean> activeCol//
              = new TableColumn<UserAccount, Boolean>("Active");

      table.getColumns().addAll(userNameCol, emailCol, fullNameCol, activeCol);

      StackPane root = new StackPane();
      root.setPadding(new Insets(5));
      root.getChildren().add(table);

      stage.setTitle("TableView (o7planning.org)");

      Scene scene = new Scene(root, 450, 300);
      stage.setScene(scene);
      stage.show();
  }

  public static void main(String[] args) {
      launch(args);
  }
  public class UserAccount {

	   private Long id;
	   private String userName;
	   private String email;
	   private String firstName;
	   private String lastName;
	   private boolean active;

	   public UserAccount(Long id, String userName, String email, //
	           String firstName, String lastName, boolean active) {
	       this.id = id;
	       this.userName = userName;
	       this.email = email;
	       this.firstName = firstName;
	       this.lastName = lastName;
	       this.active = active;
	   }

	   public Long getId() {
	       return id;
	   }

	   public void setId(Long id) {
	       this.id = id;
	   }

	   public String getUserName() {
	       return userName;
	   }

	   public void setUserName(String userName) {
	       this.userName = userName;
	   }

	   public String getEmail() {
	       return email;
	   }

	   public void setEmail(String email) {
	       this.email = email;
	   }

	   public String getFirstName() {
	       return firstName;
	   }

	   public void setFirstName(String firstName) {
	       this.firstName = firstName;
	   }

	   public String getLastName() {
	       return lastName;
	   }

	   public void setLastName(String lastName) {
	       this.lastName = lastName;
	   }

	   public boolean isActive() {
	       return active;
	   }

	   public void setActive(boolean active) {
	       this.active = active;
	   }

	}
}
