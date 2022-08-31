package com.geekbrains.patterns.builder;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Person(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        age = builder.age;
    }

    public static class Builder {

        private String name;
        private String surname;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
