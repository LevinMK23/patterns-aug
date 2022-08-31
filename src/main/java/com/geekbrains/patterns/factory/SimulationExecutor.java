package com.geekbrains.patterns.factory;

public class SimulationExecutor extends ExperimentExecutor {

    public SimulationExecutor(SimulationRunConfiguration runConfiguration) {
        super(runConfiguration);
    }

    public SimulationRunConfiguration getConfiguration() {
        return (SimulationRunConfiguration) runConfiguration;
    }



    @Override
    public void execute() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void processContinue() {

    }

    @Override
    public void interrupt() {

    }
}
