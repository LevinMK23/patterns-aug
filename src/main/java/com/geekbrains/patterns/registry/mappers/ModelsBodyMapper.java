package com.geekbrains.patterns.registry.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekbrains.patterns.registry.Body;
import com.geekbrains.patterns.registry.ModelsBody;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModelsBodyMapper implements BodyMapper {

    private final ObjectMapper mapper;

    @SneakyThrows
    @Override
    public ModelsBody map(Object source) {
        String json = mapper.writeValueAsString(source);
        return mapper.readValue(json, ModelsBody.class);
    }
}
