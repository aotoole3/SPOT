package application;

import org.opencv.core.Core;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class ObjRecognition extends Application
{
	/**
	 * Main class for the application
	 */
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			// load the FXML resource
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("ObjRecognition.fxml"));
			// set a whitesmoke background
			root.setStyle("-fx-background-color: whitesmoke;");
			// create and style a scene
			Scene scene = new Scene(root, 1900, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// create the stage with the given title and the previously created
			// scene
			primaryStage.setTitle("Car Recognition");
			primaryStage.setScene(scene);
			// show the GUI
			primaryStage.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		// load the native OpenCV library
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		launch(args);
	}
}
