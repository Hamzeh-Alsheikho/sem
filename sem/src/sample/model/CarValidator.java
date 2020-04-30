package sample.model;

import javafx.beans.property.SimpleStringProperty;

public class CarValidator {

    static boolean productName(String productName){ return !productName.isBlank() && productName.matches("[^\\d]+");}

    static boolean price(int price) {
        return price >= 0 ;
    }
}
