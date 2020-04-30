package sample.exceptions;

public class InvalidNameException extends IllegalArgumentException{


        public InvalidNameException(){ super("Product name cannot be blank.");}
}
