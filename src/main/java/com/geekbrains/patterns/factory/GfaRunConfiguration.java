package com.geekbrains.patterns.factory;

import lombok.Data;

// Entity
@Data
public class GfaRunConfiguration implements RunConfiguration {

    private long id;

    private double min;

    private double max;

    public long getId() {
        return id;
    }
}
