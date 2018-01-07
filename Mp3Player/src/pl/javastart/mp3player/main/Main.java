package pl.javastart.mp3player.main;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
	final String appName = "Mp3Player v0.4";
	try {
	    URL source = getClass().getResource("/pl/javastart/mp3player/view/MainPane.fxml");
	    Parent parent = (Parent) FXMLLoader.load(source);
	    Scene scene = new Scene(parent);
	    primaryStage.setTitle(appName);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public static void main(String[] args) {
	launch(args);

    }

}
