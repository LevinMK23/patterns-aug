package com.geekbrains.patterns.factory;

public interface IExecutor {

    void execute();

    void stop();

    void pause();

    void processContinue();

    void interrupt();

}
