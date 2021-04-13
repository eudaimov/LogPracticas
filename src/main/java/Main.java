import log.ClasesLog;
import log.LombokLog4f;
import log.UtilesLog;
import lombok.NonNull;
import org.apache.commons.io.output.WriterOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("-------------SLF4j----------------");
        // Log con slf4j
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Esto es un mensaje de información");
        logger.error("Esto es un mensaje de error");
        logger.debug("Esto es un mensaje para debugear");
        logger.warn("Esto es un mensaje de peligro");

        System.out.println("-------------Lombok & Log4j----------------");
        //Log con Lombok y Log4j
        LombokLog4f.mensajesLog();

        System.out.println("-------------Log4j----------------");

        //Log unicamente con  Log4j
        UtilesLog.registrarInfo(Main.class, ClasesLog.TipoLog.INFO , "Mensaje solo con Log4j");

    }
}
