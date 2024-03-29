package hust.soict.hedspi.gui.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class treeview extends Application {

    @Override
    public void start(Stage primaryStage) {

        BookCategory catJava = new BookCategory("JAVA-00", "Java");
        BookCategory catJSP = new BookCategory("JAVA-01", "Jsp");
        BookCategory catSpring = new BookCategory("JAVA-02", "Spring");

        // Root Item
        TreeItem<BookCategory> rootItem = new TreeItem<BookCategory>(catJava);
        rootItem.setExpanded(true);

        // JSP Item
        TreeItem<BookCategory> itemJSP = new TreeItem<BookCategory>(catJSP);

        // Spring Item
        TreeItem<BookCategory> itemSpring = new TreeItem<>(catSpring);

        // Add to Root
        rootItem.getChildren().addAll(itemJSP, itemSpring);

        TreeView<BookCategory> tree = new TreeView<BookCategory>(rootItem);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(tree);

        primaryStage.setTitle("JavaFX TreeView (o7planning.org)");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    public class BookCategory {

        private String code;
        private String name;

        public BookCategory() {

        }

        public BookCategory(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
       
        @Override
        public String toString()  {
            return this.name;
        }

    }
    
}