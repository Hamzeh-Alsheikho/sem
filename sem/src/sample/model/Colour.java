package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class Colour extends CarComponent {



    public Colour(int price) {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }

}
