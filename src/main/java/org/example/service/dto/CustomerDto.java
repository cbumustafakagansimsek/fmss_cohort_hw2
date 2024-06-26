package org.example.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CustomerDto {
    private int id;
    private String name;
    private String surname;
    private Date date;
}
