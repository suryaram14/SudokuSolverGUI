package sudoku;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SudokuGrid extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// set text fields for 9x9 sudoku grid
		// construct new GridPane()
		// align space and size of each grid  
		
		// TODO Auto-generated method stub
		TextField[][] txt_field = new TextField[9][9];
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(5);
		grid.setPadding(new Insets(10,10,10,10));
		
		
		// set a text field for each row and col
		// on the gui there will be a 9x9 grid each with a text field to input board to solve
		for(int row = 0; row < 9; row++) {
			for(int col = 0; col < 9; col++) {
				TextField tField = new TextField();
				tField.setAlignment(Pos.CENTER);
				txt_field[row][col] = tField;
				grid.add(tField, row, col);
			}
		}
		
		
		// construct a new clear button
		// construct a vbox and put button inside of vbox area
		// position button towards bottom right under the grid
		// when clicked on, all the text fields will become blank
		Button clear_button = new Button("Clear Board");
		VBox vBox = new VBox(15);
		vBox.getChildren().add(clear_button);
		vBox.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(vBox, 5, 11, 3, 1);
		
		
		clear_button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
						txt_field[row][col].setText("");
						
					}
				}
			}		
		});
		
		
		
		// construct a new solve button
		// construct a vbox and put button inside of vbox area
		// position button towards bottom right under the grid
		// when clicked on, the board will solve with the help of the SudokuSolver class
		Button solve_button = new Button("Solve Board");
		VBox VBox = new VBox(15);
		VBox.getChildren().add(solve_button);
		VBox.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(VBox, 7, 11, 3, 1);
		
		
		solve_button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int row = 0; row < 9; row++) {
					for(int col = 0; col < 9; col++) {
						
					}
				}
			}
		});
		
		
		Scene scene = new Scene(grid, 450, 450);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
