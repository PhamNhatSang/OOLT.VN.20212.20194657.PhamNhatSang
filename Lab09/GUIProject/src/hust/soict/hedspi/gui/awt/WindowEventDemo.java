package hust.soict.hedspi.gui.awt;
import java.awt.*;        // Using AWT containers and components
import java.awt.event.*;  // Using AWT events classes and listener interfaces

// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemo extends Frame {

   private TextField tfCount;  // Declare a TextField component
   private Button btnCount;    // Declare a Button component
   int count=0 ;      // Counter's value

   // Constructor to setup the GUI components and event handlers
   public WindowEventDemo() {
      setLayout(new FlowLayout()); // "super" Frame sets to FlowLayout

      add(new Label("Counter"));   // "super" Frame adds an anonymous Label

      tfCount = new TextField("avc", 10); // Construct the TextField
      tfCount.setEditable(false);       // read-only
      add(tfCount);                     // "super" Frame adds TextField

      btnCount = new Button("Count");  // Construct the Button
      add(btnCount);                   // "super" Frame adds Button

      btnCount.addActionListener(new BtnCountListener());
        // btnCount (source object) fires ActionEvent upon clicking
        // btnCount adds an anonymous instance of BtnCountListener
        //   as an ActionEvent listener

      addWindowListener(new MyWindowListener());
        // "super" Frame (source object) fires WindowEvent.
        // "super" Frame adds an anonymous instance of MyWindowListener
        //   as a WindowEvent listener.

      setTitle("WindowEvent Demo"); // "super" Frame sets title
      setSize(300, 100);            // "super" Frame sets initial size
      setVisible(true);             // "super" Frame shows
   }

   // The entry main() method
   public static void main(String[] args) {
      new WindowEventDemo();  // Let the construct do the job
   }

   // Define an inner class to handle ActionEvent of btnCount
   private class BtnCountListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent evt) {
    	  String str2;
    	  String str3=tfCount.getText();
    	  StringBuilder str1 = new StringBuilder(str3);
    	  str2=str1.reverse().toString();
    	  
         tfCount.setText(str2 + "");
      }
   }

   // Define an inner class to handle WindowEvent of this Frame
   private class MyWindowListener implements WindowListener {
	      // Called back upon clicking close-window button
	      @Override
	      public void windowClosing(WindowEvent evt) {
	         System.exit(0);  // Terminate the program
	      }

	      // Not Used, BUT need to provide an empty body to compile.
	      @Override public void windowOpened(WindowEvent evt) { }
	      @Override public void windowClosed(WindowEvent evt) { }
	      // For Debugging
	      @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
	      @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
	      @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
	      @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
	   }
}
