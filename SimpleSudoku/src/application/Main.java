package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
			Scene scene = new Scene(root);
		
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//String css = this.getClass().getResource("application.css").toExternalForm();
			//scenes.getStyleSheet.add(css);
			Image icon = new Image("SSProjLogo.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Simple Sudoku");

			primaryStage.setScene(scene);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	Timer myTimer = new Timer();
    myTimer.schedule(new TimerTask(){

      @Override
      public void run() {
        System.out.println("hello world");
      }
    }, 10000);
    
	public static void main(String[] args) {
		launch(args);
	}
}
