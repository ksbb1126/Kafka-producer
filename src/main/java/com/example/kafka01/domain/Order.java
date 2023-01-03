package com.example.kafka01.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer orderNum;
    private String name;
    private String storeName;
}
