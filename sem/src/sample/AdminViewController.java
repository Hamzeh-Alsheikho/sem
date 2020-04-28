package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminViewController {

    @FXML
    private AnchorPane rootPaneadmin;

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button adminButton;

    @FXML
    private ChoiceBox<?> productDrop;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    void btnAdd(ActionEvent event) {

    }

    @FXML
    private void changeToUserView() throws IOException {
        Main.changeView("userview.fxml");


    }

    public void btnDeleteProduct(ActionEvent actionEvent) {
    }

    public void productDrop(MouseEvent mouseEvent) {
    }
}
