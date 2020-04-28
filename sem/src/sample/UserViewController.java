package sample;


        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.CheckBox;
        import javafx.scene.control.Label;
        import javafx.scene.layout.AnchorPane;
        import java.io.IOException;

public class UserViewController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label lblCarPriceOut;

    @FXML
    private Label lblCarPriceOut1;

    @FXML
    private CheckBox ckbNaviPrice;

    @FXML
    private CheckBox ckbAirConditionPrice;

    @FXML
    private CheckBox ckbTowhitch;

    @FXML
    private CheckBox ckbSunroof;

    @FXML
    private Label lblTowhitchPrice;

    @FXML
    private Label lblSunroofPrice;

    @FXML
    private Button userButton;

    @FXML
    private Label lblAirConditionPrice;

    @FXML
    private Label lblGPSNaviPrice;


    @FXML
    private void changeToAdminView() throws IOException {
      Main.changeView("adminview.fxml");

    }
}

