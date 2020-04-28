package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminViewController {

    @FXML
    private AnchorPane rootPaneadmin;

    @FXML
    private TextField txtCarProductName;

    @FXML
    private TextField txtCarPrice;

    @FXML
    private TextField txtComponentProductName;

    @FXML
    private TextField txtComponentPrice;

    @FXML
    private TextField txtColourProductName;

    @FXML
    private Button adminButton;

    @FXML
    private Label lblErrorMessage;

    @FXML
    void btnAdd(ActionEvent event) {

    }

    @FXML
    private void changeToUserView() throws IOException {
        Main.changeView("userview.fxml");


    }

}
