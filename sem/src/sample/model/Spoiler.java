package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class Spoiler extends CarComponent {

    public Spoiler() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }
}
