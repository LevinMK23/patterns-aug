package com.geekbrains.patterns.registry;

import lombok.Data;

@Data
public class Incut<T> {

    private Long id;
    private String name;
    private Long bid;
    private IncutBodyType bodyType;
    private T body;

}
