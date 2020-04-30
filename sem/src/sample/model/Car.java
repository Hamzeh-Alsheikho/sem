package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import sample.exceptions.InvalidNameException;
import sample.exceptions.InvalidPriceException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Car {


    private transient SimpleStringProperty productName;
    private transient SimpleIntegerProperty price;

    public Car(String productName, int price) {

        if (!CarValidator.productName(productName)) {
            throw new InvalidNameException();
        }

        if (!CarValidator.price(price)) {
            throw new InvalidNameException();
        }

        this.productName = new SimpleStringProperty(productName);
        this.price = new SimpleIntegerProperty(price);

    }

    public String getProductName() {
        return productName.getValue();
    }

    public final void setProductName(String productName) {
        if (!CarValidator.productName(productName)) {
            throw new InvalidNameException();
        }

        this.productName.set(productName);
    }

    public int getPrice() {
        return price.getValue();
    }

    public final void setPrice(int price) {
        if (!CarValidator.price(price)) {
            throw new InvalidPriceException();
        }

        this.price.set(price);
    }

    @Override
    public String toString() {
        return String.format("%s;%s",
                productName.getValue(), price.getValue());
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeUTF(getProductName());
        s.writeInt(getPrice());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        String productName = s.readUTF();
        int price = s.readInt();

        this.productName = new SimpleStringProperty();
        this.price = new SimpleIntegerProperty();

        setProductName(productName);
        setPrice(price);

    }
}
