package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class GpsNavigation extends CarComponent {

    public GpsNavigation() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }
}
