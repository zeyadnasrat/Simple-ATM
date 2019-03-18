import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm  {
	LoginValidation authentication ;
	 Scene scene1; 
	 MainMenu mainmenu ;
	Stage stage ;
 
	public LoginForm(Stage primarystage) {
		this.stage = primarystage ;
	}

	public void PrepareScene1() {
		LoginValidation authentication = new LoginValidation() ;
		// TODO Auto-generated method stub
		Label cardnumberLabel = new Label("           Enter card number") ;
		
		TextField cardnumberField = new TextField();
		Button loginButton = new Button("Login") ; 
		Label validation = new Label() ;
		
		GridPane grid = new GridPane() ;
		grid.add(cardnumberLabel , 0, 0);
		grid.add(cardnumberField, 0, 6);
	    grid.add(loginButton, 0, 7);
	    grid.add(validation, 0, 8);
	    
	   loginButton.setOnAction(new EventHandler<ActionEvent>() {
		  
    public void handle (ActionEvent event)
    {
    	String cardnumber = cardnumberField.getText();
    	boolean valid = authentication.validate(cardnumber) ;
    	if (valid)
    	{
    		validation.setText("WELCOME");
    		stage.setScene(mainmenu.getScene2());
    	}
    	else 
    	{
    		validation.setText("INVALID CREDIT NUMBER");
    	}
    	
	}
	   } ) ;
	   
	 scene1 = new Scene(grid,400,400) ;

}
	
public Scene getScene1()
{
	return this.scene1 ;
}

public MainMenu getMainmenu() {
	return mainmenu;
}

public void setMainmenu(MainMenu mainmenu) {
	this.mainmenu = mainmenu;
}

}
