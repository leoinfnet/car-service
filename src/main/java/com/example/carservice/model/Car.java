package com.example.carservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data@AllArgsConstructor@NoArgsConstructor@Builder
@Table(name = "cars")
public class Car {
    @Id
    private Integer id;
    private String name;

}
