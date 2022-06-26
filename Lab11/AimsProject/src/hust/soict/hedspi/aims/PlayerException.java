package hust.soict.hedspi.aims;
import java.lang.Exception;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PlayerException extends Exception{
public PlayerException() {
	super();
}
public PlayerException(String message)
{super(message);}
}
