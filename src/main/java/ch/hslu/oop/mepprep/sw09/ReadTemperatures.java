package ch.hslu.oop.mepprep.sw09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ReadTemperatures {
    private static final Logger LOG = LogManager.getLogger(ReadTemperatures.class);

    public static void main(String[] args) {
        LOG.debug("Programm start.");
        String input;
        Scanner scnaner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scnaner.nextLine();
            if (!input.equals("exit")) {
                LOG.debug("ExceptionCatch start.");
                try {
                    LOG.debug("Try-Block start.");
                    Temperatur temp = Temperatur.createFromKelvin(Float.valueOf(input));
                    LOG.debug(temp);
                } catch (NumberFormatException e) {
                    LOG.error(e);
                    System.out.println("please use temperature values.");
                } catch (IllegalArgumentException e) {
                    LOG.error(e);
                    System.out.println("Please use only valuable values.");
                }
                LOG.debug("ExceptionCatch end.");
            }
        } while (!input.equals("exit"));
        LOG.debug("Programm end");
    }

}
