package com.example.carrenting.model;

import java.util.Date;
import lombok.Data;

@Data
public class Rate {
    private Integer id;
    private Double price;
    private String startDate;
    private String endDate;
}
