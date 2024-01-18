package day3.esercizio1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

//    public String toString() {
//        return this.name + " " + this.category + " " + this.price;
//    }
}

