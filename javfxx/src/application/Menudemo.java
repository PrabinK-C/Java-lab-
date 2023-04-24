package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menudemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create the menu bar and menus
        MenuBar menuBar = new MenuBar();
        Menu securityMenu = new Menu("Security");
        Menu networkMenu = new Menu("Network");

        // Add the security menu items
        MenuItem patternLock = new MenuItem("Pattern Lock");
        MenuItem fingerprint = new MenuItem("Fingerprint");
        securityMenu.getItems().addAll(patternLock, fingerprint);

        // Add the network menu items
        MenuItem wifi = new MenuItem("Wi-Fi");
        MenuItem bluetooth = new MenuItem("Bluetooth");
        networkMenu.getItems().addAll(wifi, bluetooth);

        // Add the menus to the menu bar
        menuBar.getMenus().addAll(securityMenu, networkMenu);

        // Create a VBox to hold the menu bar
        VBox vbox = new VBox(menuBar);

        // Create the scene and set it on the stage
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
