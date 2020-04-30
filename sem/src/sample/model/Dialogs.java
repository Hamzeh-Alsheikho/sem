package sample.model;

import javafx.scene.control.Alert;

public class Dialogs {

    public static void showErrorDialog(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Wrong!");
        alert.setHeaderText("Invalid data!");
        alert.setContentText(msg);

        alert.showAndWait();
    }

    public static void showSuccessDialog(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Carregister");
        alert.setHeaderText("succeed");
        alert.setContentText(msg);

        alert.showAndWait();
    }
}
