package org.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
public class Customer extends Account{
    private int id;

    private String surname;

    @Builder
    public Customer(String name, List<Bill> bill, String surname, int id, Date date) {
        super(name,bill,date);
        this.surname=surname;
        this.id = id;
    }
}
