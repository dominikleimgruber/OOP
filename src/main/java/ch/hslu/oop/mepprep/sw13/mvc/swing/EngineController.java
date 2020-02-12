package ch.hslu.oop.mepprep.sw13.mvc.swing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.event.ActionEvent;

public final class EngineController {

    private static final Logger LOG = LogManager.getLogger(EngineController.class);
    private final Engine engine;
    private final EngineView view;

    public EngineController(Engine engine) {
        this.engine = engine;
        this.view = new EngineView("EngineControl",this.engine);

        this.view.registerBtnOn(this::setOnAction);
        this.view.registerBtnOff(this::setOffAction);
        this.view.registerBtnReset(this::setResetAction);
        this.view.registerBtnIncRpm(this::setIncAction);
        this.view.registerBtnDecRpm(this::setDecAction);

        this.view.setVisible(true);
        LOG.debug("View visible.");
    }

    private void setDecAction(ActionEvent actionEvent) {
        engine.setRpm(engine.getRpm() - 500);
        LOG.debug("Rpm decreased with 500.");
    }

    private void setIncAction(ActionEvent actionEvent) {
        engine.setRpm(engine.getRpm() + 500);
        LOG.debug("Rpm increased with 500.");
    }

    private void setResetAction(ActionEvent actionEvent) {
        engine.setRpm(0);
        engine.switchOn();
        LOG.debug("Engine has been reset");
    }

    private void setOffAction(ActionEvent actionEvent) {
        engine.switchOff();
        LOG.debug("Engine switched off.");
    }

    private void setOnAction(ActionEvent actionEvent) {
        engine.switchOn();
        LOG.debug("Engine switched on.");
    }
}
