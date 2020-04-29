package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.text.TabableView;
import java.io.Serializable;
import java.util.List;

public class CarRegister implements Serializable {
    private transient ObservableList<Car> cregister = FXCollections.observableArrayList();
    public List<Car> getRigester(){
        return cregister;
    }
    public void addCar(Car c){cregister.add(c);}
    public void removeAll() { cregister.clear();}
    //public void attachTableView (TabableView tv){ tv.}

    public String saveCar (String name, int price){
        Car enCar = new Car(name,price);
        cregister.add(enCar);
        return "";
    }

}
