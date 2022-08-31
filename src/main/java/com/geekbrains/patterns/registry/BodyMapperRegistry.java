package com.geekbrains.patterns.registry;

import com.geekbrains.patterns.registry.mappers.BannerBodyMapper;
import com.geekbrains.patterns.registry.mappers.BodyMapper;
import com.geekbrains.patterns.registry.mappers.ModelsBodyMapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BodyMapperRegistry {

    private final BannerBodyMapper bannerBodyMapper;
    private final ModelsBodyMapper modelsBodyMapper;

    private final Map<IncutBodyType, BodyMapper> mappers;

    public BodyMapperRegistry(
            BannerBodyMapper bannerBodyMapper,
            ModelsBodyMapper modelsBodyMapper
    ) {
        this.bannerBodyMapper = bannerBodyMapper;
        this.modelsBodyMapper = modelsBodyMapper;
        mappers = Map.of(
                IncutBodyType.BANNER, bannerBodyMapper,
                IncutBodyType.MODELS, modelsBodyMapper
        );
    }

    public BodyMapper getMapper(IncutBodyType type) {
        return mappers.get(type);
    }
}
