package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class AirCondition extends CarComponent {

    public AirCondition() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
        ;
    }
}
