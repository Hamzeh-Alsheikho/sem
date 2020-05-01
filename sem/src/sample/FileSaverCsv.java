package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSaverCsv implements FileSaver {
    @Override
    public void save(CarRegister registry, Path filePath) throws IOException {
        Files.write(filePath, registry.toString().getBytes());
    }
}
