package ch.hslu.oop.mepprep.sw11.part1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ReadTemperatures {
    private static final Logger LOG = LogManager.getLogger(ReadTemperatures.class);
    private static final TemperaturHistory temperatures = new TemperaturHistory();

    public static void main(String[] args) {
        LOG.debug("Programm start.");
        String input;

        temperatures.addTemperaturEventListener(
                event -> System.out.println("New " + event.getState().getStringValue() + " Value: " + event.getNewValue()));
        temperatures.readData("/Users/dominikleimgruber/Desktop/temperatures.dat");
        Scanner scnaner = new Scanner(System.in);

        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scnaner.nextLine();

            if (!input.equals("exit")) {
                LOG.debug("ExceptionCatch start.");

                try {
                    LOG.debug("Try-Block start.");
                    Temperatur temp = Temperatur.createFromKelvin(Float.valueOf(input));
                    temperatures.add(temp);
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

        System.out.println("Number of temperatures: " + temperatures.getCount());
        System.out.println("Average: " + temperatures.average());
        System.out.println("Minima: " + temperatures.getMin());
        System.out.println("Maxima: " + temperatures.getMax());
        temperatures.writeData("/Users/dominikleimgruber/Desktop/temperatures.dat");

        LOG.debug("Programm end");
    }

}
