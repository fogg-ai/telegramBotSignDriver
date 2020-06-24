package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface InformationSignsMapper extends EntityMapper<InformationSignsDto, InformationSigns>{

    @Mapping(source = "id", target = "id")
    InformationSigns toEntity(InformationSignsDto informationSignsDto);

    InformationSignsDto toDto(InformationSigns informationSigns);
}

