package sample.model;

import sample.exceptions.InvalidPriceException;

abstract class Upholstery extends CarComponent{

    public Upholstery(){
        if(!PriceValidator.price(getPrice())){
            throw new InvalidPriceException();
        }
        else setPrice(getPrice());
    }

}
