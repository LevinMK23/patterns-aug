package com.geekbrains.patterns.valueobject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static com.geekbrains.patterns.valueobject.ConversionRule.convert;

@Slf4j
public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        Map<Complex, Boolean> map = new HashMap<>();
        map.put(new Complex(1, 2), true);
        map.put(new Complex(1, 2), true);
        System.out.println(map.size());
        Complex complex = new Complex(1, 2);
        Complex copy = new Complex(complex.real(), complex.imagine());
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(complex);
        Complex readValue = mapper.readValue(json, Complex.class);
        log.debug("{}", readValue);

        Currency rub = new Currency(BigDecimal.valueOf(1000), CurrencyType.RUB);
        log.debug("{}", convert(rub, CurrencyType.USD));

    }
}
