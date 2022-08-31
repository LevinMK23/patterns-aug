package com.geekbrains.patterns.registry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class IncutController {

    private final ObjectMapper mapper;
    private final BodyMapperRegistry bodyMapperRegistry;


    @SuppressWarnings("unchecked")
    @PostMapping("/incuts")
    public Incut<Body> postIncut(@RequestBody Incut<?> incut) throws JsonProcessingException {
        String json = mapper.writeValueAsString(incut.getBody());
        Body value = (Body) mapper.readValue(json, incut.getBodyType().getMappedClass());
        ((Incut<Body>)incut).setBody(value);
        return (Incut<Body>) incut;
    }

}
