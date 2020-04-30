package sample.model;

import sample.exceptions.InvalidPriceException;

public class Motor extends CarComponent {

    int hp;

    public Motor(String name, int price, Type compatibleWithType, int hp) {
        super.setName(name);
        super.setPrice(price);
        super.setCompatibleWithType(compatibleWithType);
        this.hp = hp;

        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());

    }
    public String toString(){
        return String.format("%s;%s", getName(),getPrice());
    }

}
