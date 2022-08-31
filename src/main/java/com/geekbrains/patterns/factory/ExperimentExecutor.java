package com.geekbrains.patterns.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public abstract class ExperimentExecutor implements IExecutor {

    protected RunConfiguration runConfiguration;

    public ExperimentExecutor(RunConfiguration runConfiguration) {
        this.runConfiguration = runConfiguration;
    }

}
