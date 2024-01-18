package day3.esercizio1;

import day3.esercizio1.models.Customer;
import day3.esercizio1.models.Order;
import day3.esercizio1.models.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(202L, "book", "books", 20));
        products.add(new Product(204L, "icecream", "food", 80));
        products.add(new Product(203L, "pizza", "food", 90));
        products.add(new Product(25L, "necklace", "jewelry", 99));
        products.add(new Product(27L, "book", "books", 140));
        products.add(new Product(29L, "book", "books", 170));
        products.add(new Product(40L, "book", "books", 200));
        products.add(new Product(10L, "book", "books", 101));



        List<Product> books = products.stream()
                .filter(product -> product.getCategory().equals("books") && product.getPrice() > 100)
                .toList();
        System.out.println(books);

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(20L, "Shipped", LocalDate.now(), LocalDate.now(), products, new Customer(1L, "Mario Rossi", 1)));








    }
}
