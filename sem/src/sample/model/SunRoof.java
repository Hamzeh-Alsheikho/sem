package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class SunRoof extends CarComponent {

    public SunRoof() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }
}
