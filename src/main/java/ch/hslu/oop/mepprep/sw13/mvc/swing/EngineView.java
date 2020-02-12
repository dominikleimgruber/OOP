package ch.hslu.oop.mepprep.sw13.mvc.swing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

public final class EngineView extends JFrame {

    private static final Logger LOG = LogManager.getLogger(EngineView.class);
    private final JButton btnOn;
    private final JButton btnOff;
    private final JButton btnReset;
    private final JButton btnIncRpm;
    private final JButton btnDecRpm;
    private final JLabel output;
    private final Engine engine;

    public EngineView(String title, Engine engine) {
        super(title);

        this.engine = engine;
        this.engine.addPropertyChangeListener(this::handleEngine);
        this.btnOn = new JButton("Turn on");
        this.btnOff = new JButton("Turn off");
        this.btnReset = new JButton("Reset");
        this.btnIncRpm = new JButton("Increase with 500");
        this.btnDecRpm = new JButton("Decrease with 500");
        this.output = new JLabel("Turned off");

        JPanel rpmButtons = new JPanel();
        rpmButtons.setLayout(new GridLayout());
        rpmButtons.add(this.btnIncRpm);
        rpmButtons.add(this.btnDecRpm);

        output.setHorizontalAlignment(JLabel.CENTER);
        output.setOpaque(true);

        this.setLayout(new BorderLayout());
        this.add(this.btnOn, BorderLayout.NORTH);
        this.add(this.btnOff, BorderLayout.SOUTH);
        this.add(this.btnReset, BorderLayout.WEST);
        this.add(this.output, BorderLayout.CENTER);
        this.add(rpmButtons, BorderLayout.EAST);

        this.pack();

        this.btnDecRpm.setEnabled(false);
        this.btnIncRpm.setEnabled(false);
        this.btnOff.setEnabled(false);
        LOG.debug("View activated.");

    }

    public void registerBtnOn(ActionListener listener) {
        this.btnOn.addActionListener(listener);
    }

    public void registerBtnOff(ActionListener listener) {
        this.btnOff.addActionListener(listener);
    }

    public void registerBtnReset(ActionListener listener) {
        this.btnReset.addActionListener(listener);
    }

    public void registerBtnIncRpm(ActionListener listener) {
        this.btnIncRpm.addActionListener(listener);
    }

    public void registerBtnDecRpm(ActionListener listener) {
        this.btnDecRpm.addActionListener(listener);
    }

    private void handleEngine(PropertyChangeEvent event) {

        if (event.getPropertyName().equals("currentState")) {
            State change = (State) event.getNewValue();
            switch (change) {
                case ON:
                    handleEngineOn();
                    break;
                case OFF:
                    handleEngineOff();
                    break;
                case FAILURE:
                    handleEngineFailure();
                    break;
            }
        }else if(event.getPropertyName().equals("rpm")){
            this.output.setText("RPM: " + event.getNewValue());
        }

    }

    private void handleEngineFailure() {
        this.output.setText("FAILURE");
        this.btnOff.setEnabled(false);
        this.btnDecRpm.setEnabled(false);
        this.btnIncRpm.setEnabled(false);
        output.setForeground(Color.BLACK);
        output.setBackground(Color.RED);
        JOptionPane.showMessageDialog(null, "RPM to high, engine overheated, please press the reset button!","Failure", JOptionPane.WARNING_MESSAGE);
    }

    private void handleEngineOff() {
        this.output.setText("Engine turned off");
        this.btnOff.setEnabled(false);
        this.btnDecRpm.setEnabled(false);
        this.btnIncRpm.setEnabled(false);
        this.btnOn.setEnabled(true);
        output.setForeground(Color.WHITE);
        output.setBackground(Color.BLACK);
    }

    private void handleEngineOn() {
        this.output.setText("RPM: " + engine.getRpm());
        this.btnOff.setEnabled(true);
        this.btnDecRpm.setEnabled(true);
        this.btnIncRpm.setEnabled(true);
        this.btnOn.setEnabled(false);
        output.setForeground(Color.BLACK);
        output.setBackground(Color.GREEN);
    }


}
