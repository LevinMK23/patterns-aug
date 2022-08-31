package com.geekbrains.patterns.registry.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekbrains.patterns.registry.BannerBody;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BannerBodyMapper implements BodyMapper {

    private final ObjectMapper mapper;

    @SneakyThrows
    @Override
    public BannerBody map(Object source) {
        String json = mapper.writeValueAsString(source);
        return mapper.readValue(json, BannerBody.class);
    }

}
