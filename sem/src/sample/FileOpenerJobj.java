package sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOpenerJobj implements FileOpener {
    @Override
    public void open(CarRegister carRegister, Path filePath) throws IOException {
        try (InputStream fin = Files.newInputStream(filePath);
             ObjectInputStream oin = new ObjectInputStream(fin)) {
            CarRegister register = (CarRegister) oin.readObject();
            carRegister.removeAll();
            register.getRegister().forEach(carRegister::addCar);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IOException("Something is wrong with the implementation. See debug information");
        }
    }
}
