package sample;

import java.io.IOException;

public class InvalidProductNameFormatException extends IOException {
    InvalidProductNameFormatException(String message) {
        super(message);
    }
}