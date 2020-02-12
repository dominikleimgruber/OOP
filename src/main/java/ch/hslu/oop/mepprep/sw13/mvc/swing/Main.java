package ch.hslu.oop.mepprep.sw13.mvc.swing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("Application starts");
        new EngineController(new Engine());
    }
}
