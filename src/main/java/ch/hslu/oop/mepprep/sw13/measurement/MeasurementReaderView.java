package ch.hslu.oop.mepprep.sw13.measurement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URL;

public class MeasurementReaderView extends Application {

    private static final Logger LOG = LogManager.getLogger(MeasurementReaderView.class);
    private Stage stage;

    @Override
    public void start(final Stage stage) {

        this.stage = stage;
        this.stage.setTitle("Read Measurements");
        Parent pane;
        try {
            final URL fxmlUrl = getClass().getResource("measurementReader.fxml");
            final FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl);
            fxmlLoader.setController(new MeasurementReaderController(this));
            pane = fxmlLoader.load();
            this.stage.setScene(new Scene(pane));
            this.stage.show();
            LOG.info("GUI-Stage aktiviert und sichtbar.");
        } catch (IOException e) {
            LOG.error("FXML-Datei nicht gefunden/lesbar.", e);
        }
    }

    public Stage getStage() {
        return stage;
    }

    /**
     * main-Methode startet die JavaFX-Application.
     *
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        LOG.info("Applikation startet...");
        launch(args);
    }
}
