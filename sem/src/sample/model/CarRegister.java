package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CarRegister implements Serializable {
    private static final long serialVersionUID = 1;

        private transient ObservableList<Car> carRegister = FXCollections.observableArrayList();

        public List<Car> getRegister() {
            return carRegister;
        }

    public void addCar(Car c) {
        carRegister.add(c);
    }

    public void removeAll() {
        carRegister.clear();
    }

    public void attachTableView(TableView tv) {
        tv.setItems(carRegister);
    }

    public Car searchRegisterByProductName(String name) {
        Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);

        for(Car c : carRegister) {
            Matcher matcher = pattern.matcher(c.getProductName());

            if(matcher.find()) {
                return c;
            }
        }

        return null;
    }

    public ObservableList<Car> filterByProductName(String productName) {
        return carRegister.stream().
                filter(c -> c.getProductName().toLowerCase().
                        matches(String.format("%s%s%s",".*", productName.toLowerCase(), ".*"))).
                collect(Collectors.toCollection(FXCollections::observableArrayList));
    }

    public ObservableList<Car> filterByPrice(int price) {
        return carRegister.stream().
                filter(p -> p.getPrice() == price).
                collect(Collectors.toCollection(FXCollections::observableArrayList));
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Car c : carRegister) {
            sb.append(c.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeObject(new ArrayList<>(carRegister));
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        List<Car> list = (List<Car>) s.readObject();
        carRegister = FXCollections.observableArrayList();
        carRegister.addAll(list);
    }

}


