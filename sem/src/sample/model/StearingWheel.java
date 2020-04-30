package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class StearingWheel extends CarComponent {

    public StearingWheel() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }

}
