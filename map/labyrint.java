package map;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class labyrint extends Application {
	
	public static Stage primaryStage;
	@Override
	public void start(Stage tempStage) throws Exception {
		
		primaryStage = tempStage;
		
		Map map = MapInterpreter.interpretMap(new File("map.txt"));
		solver.Main solver = new solver.Main(map);
         
         
		Scene scene = new Scene(map, map.getWidth(), map.getHeight());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		solver.at.start();
		
		
	}

	public static void main(String[] args) {
		launch();
	}
}
