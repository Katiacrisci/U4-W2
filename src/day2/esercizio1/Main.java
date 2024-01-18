package day2.esercizio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserisci un intero N che rappresenti il numero di elementi da inserire");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        Set<String> wordSet = new HashSet<>(quantity);
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Scrivi una parola");
            String word = scanner.next("\\w+");
            boolean isDuplicate = !wordSet.add(word);
            if (isDuplicate) {
                duplicates.add(word);
            }
        }
        for (String dup : duplicates) {
            if (dup.contains("sdfvs")) {
                System.out.println("A duplicate: " + dup);
            }
        }
        System.out.println("elenco parole duplicate" + duplicates);
        System.out.printf("Numero di parole distinte: %d", wordSet.size());
        System.out.println(wordSet);









    }
}
