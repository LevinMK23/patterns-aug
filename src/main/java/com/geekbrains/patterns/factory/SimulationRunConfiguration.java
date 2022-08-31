package com.geekbrains.patterns.factory;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SimulationRunConfiguration implements RunConfiguration {

    private Long id;

    private Double speed;

    private LocalDateTime currentTime;

    public long getId() {
        return id;
    }
}
