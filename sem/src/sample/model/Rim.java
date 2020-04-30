package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class Rim extends CarComponent {

    public Rim() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }

}
