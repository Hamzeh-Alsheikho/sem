package sample;

import java.io.IOException;
import java.nio.file.Path;

public interface FileOpener {

    void open(CarRegister carRegister, Path filePath) throws IOException;
}
