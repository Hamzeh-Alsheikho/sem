package sample;

/*import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Car;
import sample.CarRegister;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
*/

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.awt.event.KeyEvent;
import java.io.IOException;

public class AdminViewController {

    @FXML
    private AnchorPane rootPaneadmin;

    @FXML
    private TableView<Car> tblvCar;

    @FXML
    private TableColumn<TableView<Car>, String> productNameColum;

    @FXML
    private TableColumn<TableView<Car>, Integer> priceColum;

    @FXML
    ChoiceBox<String> filterChoice;

    private CarRegister carRegister = new CarRegister();
    private RegisterCar registerCar;
    private ConvertersWithErrorHandling.IntegerStringConverter intStrConverter
            = new ConvertersWithErrorHandling.IntegerStringConverter();
    public Stage stage;


    @FXML
    public void initialize() {
        registerCar = new RegisterCar(rootPaneadmin);
        updateCarList();
        filterChoice.setValue("Product Name");
        priceColum.setCellFactory(TextFieldTableCell.forTableColumn(intStrConverter));
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void btnAdd(ActionEvent event) {
        registerCar();
        updateCarList();
    }

    private void registerCar() {
        Car newCar = registerCar.createCarfromGUIandResetFields();
        if (newCar != null) {
            carRegister.addCar(newCar);
        }
    }

    private void updateCarList() {
        carRegister.attachTableView(tblvCar);
    }

    @FXML
    private void filterChoiceChanged() {
        filter();
    }

    @FXML
    private void searchTxtEntered() {
        filter();
    }

    private void filter() {
        if (txtSearch.getText().isBlank()) {
            updateCarList();
            return;
        }

        ObservableList<Car> result = null;
        switch (filterChoice.getValue().toLowerCase()) {
            case "productname" : result = carRegister.filterByProductName(txtSearch.getText()); break;
            case "price" : try {
                result = carRegister.filterByPrice(Integer.parseInt(txtSearch.getText()));
            } catch (NumberFormatException e) {} break;

        }

        if(result == null) {
            tblvCar.setItems(FXCollections.observableArrayList());
        } else {
            tblvCar.setItems(result);
        }
    }

    @FXML
    private void openFileMenuClicked() {
        FileHandler.openFile(stage, carRegister);
        txtSearch.setText("");
        updateCarList();
    }

    @FXML
    private void saveFileMenuClicked() {
        FileHandler.saveFile(stage, carRegister);
    }

    @FXML
    TextField txtSearch;





    @FXML
    void nameEdited(ActionEvent event) {

    }

    @FXML
    void openFileMenuClicked(ActionEvent event) {

    }


    @FXML
    void saveFileMenuClicked(ActionEvent event) {

    }

    @FXML
    void searchTxtEntered(KeyEvent event) {

    }

    public void productNameColum(TableColumn.CellEditEvent cellEditEvent) {
    }

    public void priceColum(TableColumn.CellEditEvent cellEditEvent) {
    }

   /* @FXML
    private void changeToUserView() throws IOException {
        Main.changeView("userview.fxml");
    }*/

    public void productDrop(MouseEvent mouseEvent) {
    }

    public void btnDeleteProduct(ActionEvent actionEvent) {
    }

    public void btnSave(ActionEvent actionEvent) {
    }
}







/*
    ObservableList list = FXCollections.observableArrayList();


    @FXML
    private AnchorPane rootPaneadmin;

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button adminButton;

    @FXML
    private ChoiceBox<String> productDrop;

    @FXML
    private TableView<Car> tblvCar;

    @FXML
    private TableColumn<TableView<Car>, String> tblvClProductName;

    @FXML
    private TableColumn<TableView<Car>, Integer> tblvClPrice;

    @FXML
    private Button btnDeleteProduct;

    private CarRegister carRegister = new CarRegister();
    private RegisterCar registerCar;

    @FXML
    void btnAdd(ActionEvent event) {
        registerCar();
        updateCarList();
    }

    private void registerCar() {
        Car newCar = registerCar.createCarfromGUIandResetFields();
        if (newCar != null) {
            carRegister.addCar(newCar);
        }
    }

    private void updateCarList() {
        carRegister.attachTableView(tblvCar);
    }

    public void btnDeleteProduct(ActionEvent actionEvent) {
    }

    public void productDrop(MouseEvent mouseEvent) {
    }

    private void choiceBoxloadData() {
        list.removeAll(list);
        String a = "Car type";
        String b = "Components";
        String c = "Extra Options";
        list.addAll(a, b, c);
        productDrop.getItems().addAll(list);
    }

    @FXML
    private TextField txtProduct;

    @FXML
    private TextField txtPrice;

    public void btnSave(ActionEvent actionEvent) {
    }

    @FXML
    private void changeToUserView() throws IOException {
        Main.changeView("userview.fxml");

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        registerCar = new RegisterCar(rootPaneadmin);
        updateCarList();

    }*/

