package com.geekbrains.patterns.singleton;

public class WorkSpace {

    private static volatile WorkSpace INSTANCE;

    private WorkSpace() {
    }

    public synchronized static WorkSpace getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WorkSpace();
        }
        return INSTANCE;
    }

    public UserService userService() {
        return UserService.getInstance();
    }

    public OrderService orderService() {
        return new OrderService();
    }

}
