package sample.model;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RegisterCar {

    private GridPane guiData;

    RegisterCar(GridPane guiData) {
        this.guiData = guiData;
    }

    Car createCarfromGUIandResetFields() {
        try {
            Car c = createCar();
            resetFields();
            Dialogs.showSuccessDialog(c.getProductName());
            return c;
        } catch (NumberFormatException nfe) {
            Dialogs.showErrorDialog("\n" +
                    "Enter integers for Price");
        } catch (IllegalArgumentException iae) {
            Dialogs.showErrorDialog(iae.getMessage());
        }

        return null;
    }

    private Car createCar() {

        String productName = getString((TextField) guiData.lookup("#productName"));
        int price = getInt((TextField) guiData.lookup("#price"));


        return new Car(productName,price);
    }

    private String getString(TextField field) {
        return field.getText();
    }

    private int getInt(TextField field) {
        return Integer.parseInt(getString(field));
    }

    private void resetFields() {

        ((TextField) guiData.lookup("#productName")).setText("");
        ((TextField) guiData.lookup("#price")).setText("");

    }

}
