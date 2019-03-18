import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	
	
	double Balance = 0 ;
	Scene scene3 ;
	MainMenu mainmenu ;
	Stage stage ;
	
	public Transaction(Stage primaryStage) {
		this.stage=primaryStage ;
	}


	
	public  void depositWithdrawlScene3() {
   
	Label enter = new Label("Enter the amount you want to deposit :") ;
	TextField depositamount = new TextField();
	Label showmoney = new Label() ;
	
	GridPane grid = new GridPane() ;
	grid.add(enter, 0, 0);
	grid.add(depositamount , 0, 1);
	grid.add(showmoney, 0, 2);
	
	
	Double x = Double.parseDouble(depositamount.getText());
	 Balance = Balance + x ;
	 
	 showmoney.setText("   You have deposited  "+ Balance +" succesfully");
	 
	 scene3 = new Scene(grid,400,400) ;
	 } 
	
	 
	 


	public Scene getScene3() {
		return scene3;
	}

	public MainMenu getMainmenu() {
		return mainmenu;
	}

	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}
	
	public double getBalance()
	   {  
		return this.Balance ;
		}
	 
 }




