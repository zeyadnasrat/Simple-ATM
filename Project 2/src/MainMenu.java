import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenu {
	Scene scene2 ; 
	Transaction transaction ;
	LoginForm loginform ;
	Stage stage ;
		
	

	
public MainMenu(Stage primaryStage) {
		 this.stage = primaryStage ;
	}

public void PrepareScene2()
    {
	Button depositbutton = new Button ("Deposit") ;
	Button withdrawlbutton= new Button ("Withdrawl") ;
	Button balancebutton = new Button ("Balance Inquiry") ;
	Button previousbutton = new Button ("Previous") ;
	Button nextbutton = new Button ("	Next") ;
	Label show = new Label() ;
	
 GridPane grid = new GridPane() ;
 grid.add(depositbutton, 0, 1);
 grid.add(withdrawlbutton, 0, 2);
 grid.add(balancebutton, 0, 3);
 grid.add(previousbutton, 0, 4);
 grid.add(nextbutton, 0, 5);
 grid.add(show, 1, 3);
 
 
 balancebutton.setOnAction(new EventHandler<ActionEvent>() {
	 
	 
	@Override
	public void handle(ActionEvent arg0) {
		
		if (transaction.getBalance()==0.0)
		{
			show.setText("   Your current balance is : 0 ");
			
		}
		
	}
	 
 });
  
 
 depositbutton.setOnAction(new EventHandler<ActionEvent>() {
	 
	 
	@Override
	public void handle(ActionEvent arg0)
	{
		stage.setScene(transaction.getScene3());
		
	}
	 
 });
  
 
 
scene2 = new Scene(grid,400,400) ;

   }
public Scene getScene2()
{
	return this.scene2 ;
}
public LoginForm getLoginform() {
	return loginform;
}
public void setLoginform(LoginForm loginform) {
	this.loginform = loginform;
}


public Transaction getTransaction() {
	return transaction;
}

public void setTransaction(Transaction transaction) {
	this.transaction = transaction;
}






}
