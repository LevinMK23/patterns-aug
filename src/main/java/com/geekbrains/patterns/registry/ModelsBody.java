package com.geekbrains.patterns.registry;

import java.util.List;

public record ModelsBody(List<Long> models) implements Body {
}
