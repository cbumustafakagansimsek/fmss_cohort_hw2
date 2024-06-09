package org.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Bill extends Auditing {

    private int id;
    private Company company;
    private Customer customer;
    private double price;

    @Builder
    public Bill(Date date, int id, Company company, Customer customer, double price) {
        super(date);
        this.id = id;
        this.company = company;
        this.customer = customer;
        this.price = price;
    }
}
