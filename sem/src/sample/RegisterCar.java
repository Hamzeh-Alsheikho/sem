package sample;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

class RegisterCar {

    private AnchorPane guiData;

    RegisterCar(AnchorPane guiData) {
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

        String productName = getString((TextField) guiData.lookup("#Product Name"));
        int price = getInt((TextField) guiData.lookup("#Price"));


        return new Car(productName,price);
    }

    private String getString(TextField txtProduct) {
        return txtProduct.getText();
    }

    private int getInt(TextField txtPrice) {
        return Integer.parseInt(getString(txtPrice));
    }

    private void resetFields() {

        ((TextField) guiData.lookup("#productName")).setText("");
        ((TextField) guiData.lookup("#price")).setText("");

    }

}
