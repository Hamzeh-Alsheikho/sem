package sample;

import java.io.IOException;
import java.nio.file.Path;

public interface FileSaver {
    void save(CarRegister registry, Path filePath) throws IOException;
}
