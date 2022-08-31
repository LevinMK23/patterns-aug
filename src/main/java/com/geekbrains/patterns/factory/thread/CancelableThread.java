package com.geekbrains.patterns.factory.thread;

public class CancelableThread extends Thread {

    public CancelableThread(Runnable target) {
        super(target);
    }

    private volatile boolean cancel;

    public boolean isCancel() {
        return cancel;
    }

    public void cancel() {
        this.cancel = true;
    }
}
