package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminViewController implements Initializable {
    ObservableList list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();

    }
    private CarRegister carRegister = new CarRegister();


    @FXML
    private AnchorPane rootPaneadmin;

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button adminButton;

    @FXML
    private ChoiceBox<String> productDrop;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    void btnAdd(ActionEvent event) {


    }
    public void btnDeleteProduct(ActionEvent actionEvent) {
    }

    public void productDrop(MouseEvent mouseEvent) {
    }
    private void loadData(){
        list.removeAll(list);
        String a="Car type";
        String b="Components";
        String c="Extra Options";
        list.addAll(a,b,c);
        productDrop.getItems().addAll(list);
    }
    public void txtProduct(ActionEvent actionEvent) {
    }

    public void txtPrice(ActionEvent actionEvent) {
    }

    public void btnSave(ActionEvent actionEvent) {
    }

    @FXML
    private void changeToUserView() throws IOException {
        Main.changeView("userview.fxml");


    }



}
