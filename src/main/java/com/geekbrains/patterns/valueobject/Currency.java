package com.geekbrains.patterns.valueobject;

import java.math.BigDecimal;

public record Currency(BigDecimal amount, CurrencyType type) {
}
