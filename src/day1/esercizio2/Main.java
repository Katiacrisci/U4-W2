package day1.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Inserire un valore per i km percorsi");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        System.out.println("Inserire un valore per i litri consumati");
        int lt = scanner.nextInt();
        float consumo;
        try {
            consumo = calcolaKmL(km, lt);
        } catch (ArithmeticException ex) {
            consumo = 0;
            logger.warn("divisione per 0 non valida");

        }
        System.out.println("Hai consumato " + consumo + "km/lt");

    }

    private static float calcolaKmL(int km, int lt) {
        if (lt == 0) {
            throw new ArithmeticException();
        }
        return (float) km / lt;


    }

}

