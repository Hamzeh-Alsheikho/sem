package sample;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    private enum DialogMode {Open, Save}

    static void saveFile(Stage stage, CarRegister register) {
        File selectedFile = getFileFromFileChooser(DialogMode.Save, stage);

        if (selectedFile != null) {
            String fileExt = getFileExt(selectedFile);
            FileSaver saver = null;

            switch (fileExt) {
                case ".csv" : saver = new FileSaverCsv(); break;
                case ".jobj" : saver = new FileSaverJobj(); break;
                default : Dialogs.showErrorDialog("You can only save to csv or jobj files.");
            }

            if(saver != null) {
                try {
                    saver.save(register, selectedFile.toPath());
                    Dialogs.showSuccessDialog("Register saved successfully");
                } catch (IOException e) {
                    Dialogs.showErrorDialog("Saving failed. Reason: " + e.getMessage());
                }
            }
        }

    }

    static void openFile(Stage stage, CarRegister register) {
        File selectedFile = getFileFromFileChooser(DialogMode.Open, stage);

        if (selectedFile != null) {
            String fileExt = getFileExt(selectedFile);
            FileOpener opener = null;

            switch (fileExt) {
                case ".csv" : opener = new FileOpenerCsv(); break;
                case ".jobj" : opener = new FileOpenerJobj(); break;
                default : Dialogs.showErrorDialog("You can only open csv or jobj files.");
            }

            if(opener != null) {
                try {
                    opener.open(register, selectedFile.toPath());
                } catch (IOException e) {
                    Dialogs.showErrorDialog("Opening failed. Reason: " + e.getMessage());
                }
            }
        }
    }

    private static File getFileFromFileChooser(DialogMode mode, Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                new FileChooser.ExtensionFilter("Serialized files", "*.jobj"));

        if(mode == DialogMode.Open) {
            return fileChooser.showOpenDialog(stage);
        } else {
            return fileChooser.showSaveDialog(stage);
        }
    }

    private static String getFileExt(File file) {
        String fileName = file.getName();
        return fileName.substring(fileName.lastIndexOf('.'));
    }

}
