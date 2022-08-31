package com.geekbrains.patterns.factory.thread;

import java.util.concurrent.ThreadFactory;

public class CancelableThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new CancelableThread(r);
    }

}
