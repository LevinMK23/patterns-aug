package com.geekbrains.patterns.factory.thread;

public class ThreadUtils {

    public static void cancel() {
        Thread thread = Thread.currentThread();
        if (thread instanceof CancelableThread ct) {
            ct.cancel();
        }
    }

    public static void interruptCancelled() {
        Thread thread = Thread.currentThread();
        if (thread instanceof CancelableThread ct) {
            if (ct.isCancel()) {
                ct.interrupt();
            }
        }
    }

}
