package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Car {
    private static final long serialvirson =1;

    private transient SimpleStringProperty model;
    private transient SimpleIntegerProperty price;


    public Car(String model, int price) {
        this.model = new SimpleStringProperty(model);
        this.price = new SimpleIntegerProperty(price);
    }

    public String getModel() {
        return model.getValue();
    }

    public int getPrice() {
        return price.getValue();
    }


}
