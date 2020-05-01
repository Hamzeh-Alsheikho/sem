package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOpenerCsv implements FileOpener {
    @Override
    public void open(CarRegister register, Path filePath) throws IOException {
        register.removeAll();
        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                register.addCar(parseProductName(line));
            }
        }
    }

    private Car parseProductName(String line) throws InvalidProductNameFormatException {
        String[] split = line.split(";");
        if (split.length != 2) {
            throw new InvalidProductNameFormatException("You must use ; for separating data field.");
        }

        String productname = split[0];

        int price = parseNumber(split[1], "Price must be integer");


        return new Car(productname, price);

    }

    private int parseNumber(String str, String errorMessage) throws IllegalArgumentException {
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(errorMessage);
        }

        return number;
    }
}
