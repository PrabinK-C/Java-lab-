package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
		
				// BorderPane
						BorderPane borderPane = new BorderPane();
						Button topButton = new Button("Top");
						Button leftButton = new Button("Left");
						Button centerButton = new Button("Center");
						Button rightButton = new Button("Right");
						Button bottomButton = new Button("Bottom");
						borderPane.setTop(topButton);
						borderPane.setLeft(leftButton);
						borderPane.setCenter(centerButton);
						borderPane.setRight(rightButton);
						borderPane.setBottom(bottomButton);

						// GridPane
						GridPane gridPane = new GridPane();
						gridPane.setPadding(new Insets(10, 10, 10, 10));
						gridPane.setVgap(5);
						gridPane.setHgap(5);
						Label nameLabel = new Label("Name:");
						TextField nameTextField = new TextField();
						Label emailLabel = new Label("Email:");
						TextField emailTextField = new TextField();
						Button gridPaneButton = new Button("Submit");
						GridPane.setConstraints(nameLabel, 0, 0);
						GridPane.setConstraints(nameTextField, 1, 0);
						GridPane.setConstraints(emailLabel, 0, 1);
						GridPane.setConstraints(emailTextField, 1, 1);
						GridPane.setConstraints(gridPaneButton, 1, 2);
						gridPane.getChildren().addAll(nameLabel, nameTextField, emailLabel, emailTextField, gridPaneButton);

						// HBox
						HBox hBox = new HBox();
						hBox.setPadding(new Insets(10, 10, 10, 10));
						hBox.setSpacing(10);
						Button hBoxButton1 = new Button("Button 1");
						Button hBoxButton2 = new Button("Button 2");
						Button hBoxButton3 = new Button("Button 3");
						hBox.getChildren().addAll(hBoxButton1, hBoxButton2, hBoxButton3);

						// VBox
						VBox vBox = new VBox();
						vBox.setPadding(new Insets(10, 10, 10, 10));
						vBox.setSpacing(10);
						Button vBoxButton1 = new Button("Button 1");
						Button vBoxButton2 = new Button("Button 2");
						Button vBoxButton3 = new Button("Button 3");
						vBox.getChildren().addAll(vBoxButton1, vBoxButton2, vBoxButton3);

						// Create a scene and add all the layouts
						Scene scene = new Scene(borderPane, 400, 300);
						borderPane.setCenter(gridPane);
						borderPane.setTop(hBox);
						borderPane.setLeft(vBox);

						primaryStage.setScene(scene);
						primaryStage.setTitle("Layout Example");
						primaryStage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
