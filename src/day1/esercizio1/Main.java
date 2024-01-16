package day1.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 10);
            System.out.println(numbers[i]);
        }
        System.out.println("Inserisci un numero per indicare che posizione sostituire");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        while (position != 0) {
            while (position < 1 || position > 5) {
                logger.error("valore non valido. Inserire un valore da 1 a 5");
                position = scanner.nextInt();
            }
            System.out.printf("L'elemento in posizione %d ha valore %d\n", position, numbers[position - 1]);
            System.out.println("Inserisci il nuovo elemento");
            int newNumber = scanner.nextInt();
            numbers[position - 1] = newNumber;
            System.out.println(Arrays.toString(numbers));
            System.out.println("Inserisci un numero per indicare che posizione sostituire");
            position = scanner.nextInt();



        }


    }
}
