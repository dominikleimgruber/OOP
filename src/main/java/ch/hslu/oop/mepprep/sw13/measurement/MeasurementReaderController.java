package ch.hslu.oop.mepprep.sw13.measurement;

import ch.hslu.oop.mepprep.sw11.part2.MeasurementHistory;
import ch.hslu.oop.mepprep.sw11.part2.ReadFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MeasurementReaderController implements Initializable {

    private static final Logger LOG = LogManager.getLogger(MeasurementReaderController.class);
    private final MeasurementReaderView view;
    private  MeasurementHistory measurements;
    private File file;

    public MeasurementReaderController(MeasurementReaderView measurementReaderView) {

        this.view = measurementReaderView;
    }

    @FXML
    private Button fileChooser;

    @FXML
    private Button btnRead;

    @FXML
    private Label stateLabel;

    @FXML
    private Label fileLabel;

    @FXML
    private Label minLabel;

    @FXML
    private Label maxLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setOnAction(this::handleFileChooser);
        this.btnRead.setOnAction(this::handleBtnOn);
    }

    private void handleBtnOn(ActionEvent actionEvent) {

            stateLabel.setText("State: Running...");
            measurements = new MeasurementHistory(ReadFile.readMeasurements(file.getAbsolutePath()));
            stateLabel.setText("State: Done");
            minLabel.setText("Minima: " + measurements.min().getTemperatur().getCelsius());
            maxLabel.setText("Maxima: " + measurements.max().getTemperatur().getCelsius());

    }

    private void handleFileChooser(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        file = chooser.showOpenDialog(view.getStage());
        stateLabel.setText("State: ");
        minLabel.setText("Minima: ");
        maxLabel.setText("Maxima: ");
        fileLabel.setText(file.getName());
        LOG.debug("File read");
    }
}
