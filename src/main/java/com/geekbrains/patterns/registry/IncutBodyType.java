package com.geekbrains.patterns.registry;

public enum IncutBodyType {

    MODELS(ModelsBody.class),
    BANNER(BannerBody.class),
    CARD(CardBody.class);

    private final Class<?> mappedClass;

    IncutBodyType(Class<?> mapperClass) {
        this.mappedClass = mapperClass;
    }

    public Class<?> getMappedClass() {
        return mappedClass;
    }
}
