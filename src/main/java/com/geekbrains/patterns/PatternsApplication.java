package com.geekbrains.patterns;

import com.geekbrains.patterns.builder.Person;
import com.geekbrains.patterns.builder.User;
import com.geekbrains.patterns.factory.ExecutorFactory;
import com.geekbrains.patterns.singleton.WorkSpace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.Executors;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PatternsApplication.class, args);
        WorkSpace.getInstance().orderService();
        ExecutorFactory factory = applicationContext.getBean(ExecutorFactory.class);
        Executors.newFixedThreadPool(1);
        // factory.createExecutor()

        Person person = Person.builder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setAge(20)
                .build();

        User user = User.builder()
                .age(20)
                .name("Ivan")
                .surname("Ivanov")
                .build();
    }

}
