package com.geekbrains.patterns.registry;

import java.util.Arrays;
import java.util.Set;

public class MappingUtils {

    public static<T> T map(T from, T to, Set<String> ignore) {
        Arrays.stream(from.getClass().getDeclaredFields())
                .filter(field -> !ignore.contains(field.getName()))
                .forEach(field -> {
                    field.setAccessible(true);
                    try {
                        Object value = field.get(from);
                        field.set(to, value);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
        return to;
    }

}
