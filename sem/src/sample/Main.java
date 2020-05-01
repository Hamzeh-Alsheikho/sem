package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*public class Main extends Application {

    private static Scene scene;
    //private String fxml;

   /* @Override
    public void start(Stage stage) throws IOException {
        //scene = new Scene(loadFXML("userview.fxml"), 900, 700);
        scene = new Scene(loadFXML("adminview.fxml"), 900, 700);
        stage.setTitle("Semester spring 2020");
        stage.setScene(scene);
        stage.show();
    }*/

   /* @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("adminview", stage));
        stage.setScene(scene);
        stage.show();
    }*/



    /*public static void changeView(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /*private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
        return fxmlLoader.load();*/

    /*private static Parent loadFXML(String fxml, Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        Parent root = (Parent)fxmlLoader.load();
        AdminViewController controller = (AdminViewController) fxmlLoader.getController();
        controller.setStage(stage);
        return root;
    }


    public static void main(String[] args) {
        launch(args);
    }
}*/

public class Main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML(stage));
        stage.setScene(scene);
        stage.show();
    }

    private static Parent loadFXML(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("admin" + ".fxml"));
        Parent root = fxmlLoader.load();
        AdminViewController controller = (AdminViewController) fxmlLoader.getController();
        controller.setStage(stage);
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

}