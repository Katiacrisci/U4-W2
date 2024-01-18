package day3.esercizio1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Customer {
    private Long id;
    private String name;
    private Integer tier;
}
