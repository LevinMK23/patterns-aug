package com.geekbrains.patterns.registry;

public record CardBody(int width, int height, int color, String name) implements Body {
}
