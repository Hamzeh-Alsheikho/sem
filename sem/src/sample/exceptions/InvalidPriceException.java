package sample.exceptions;


public class InvalidPriceException extends IllegalArgumentException{

    public InvalidPriceException(){ super("Price must be 0 or more");}


}
