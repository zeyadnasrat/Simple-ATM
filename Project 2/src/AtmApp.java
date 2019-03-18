import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AtmApp extends Application  {
	
	 public static void main (String args[])
	 {
		 launch(args) ;
	 }
	 
	 public void start(Stage primaryStage) throws Exception {
		 
		 primaryStage.setTitle("ATM Application");
		 LoginForm loginform = new LoginForm(primaryStage) ;
		 MainMenu mainmenu = new MainMenu(primaryStage) ;
		 Transaction transaction = new Transaction (primaryStage) ;
		  
			 
		 loginform.PrepareScene1() ;
		 mainmenu.PrepareScene2() ;
		 transaction.depositWithdrawlScene3();
		 
		 
		 loginform.setMainmenu(mainmenu);
		 mainmenu.setLoginform(loginform);
		 mainmenu.setTransaction(transaction);
		 transaction.setMainmenu(mainmenu);
		
		 
		 
		 
		 primaryStage.setScene(loginform .getScene1());
			
			 
			primaryStage.show();
	 
	 }

}
