package com.geekbrains.patterns.valueobject;

import java.math.BigDecimal;

public class ConversionRule {

    private static final Double[][] conversionTable;

    static {
        conversionTable = new Double[][]{
                {1., 1/60., 1/61.},
                {1/60., 1., 0.99},
                {1/61., 0.99, 1.}
        };
    }

    public static Double getCoefficient(CurrencyType from, CurrencyType to) {
        return conversionTable[from.ordinal()][to.ordinal()];
    }

    public static Currency convert(Currency from, CurrencyType to) {
        return new Currency(
                from.amount().multiply(BigDecimal.valueOf(getCoefficient(from.type(), to))),
                to
        );
    }

}
