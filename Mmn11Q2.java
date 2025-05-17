import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Mmn11Q2 extends Application{ 
	
	public void start(Stage stage) throws Exception{ 
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("Mmn11Q2.fxml")); 
		Scene scene = new Scene(root); 
		stage.setTitle("Mmn11Q2"); 
		stage.setScene(scene); 
		stage.show(); 
	} 
	
	public static void main(String[] args) { 
		launch(args); 
	} 
}
