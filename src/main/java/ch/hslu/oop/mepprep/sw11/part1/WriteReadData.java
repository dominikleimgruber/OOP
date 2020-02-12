package ch.hslu.oop.mepprep.sw11.part1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class WriteReadData {


    private static final Logger LOG = LogManager.getLogger(WriteReadData.class);

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("/Users/dominikleimgruber/Desktop/test.dat"))) {
            dos.writeDouble(Double.MAX_VALUE);
            dos.writeFloat(123.123f);
            dos.writeUTF("Hallo Welt");
        } catch (IOException | IllegalArgumentException e) {
            LOG.error(e);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("/Users/dominikleimgruber/Desktop/test.dat"))) {
            LOG.debug(dis.readDouble());
            LOG.debug(dis.readFloat());
            LOG.debug(dis.readUTF());
        } catch (IOException | IllegalArgumentException e) {
            LOG.error(e);
        }
    }
}