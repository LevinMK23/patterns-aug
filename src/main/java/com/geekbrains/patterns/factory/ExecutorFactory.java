package com.geekbrains.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class ExecutorFactory {

    public IExecutor createExecutor(GfaRunConfiguration configuration) {
        return new GfaExecutor(configuration);
    }

    public IExecutor createExecutor(SimulationRunConfiguration configuration) {
        return new SimulationExecutor(configuration);
    }

}
