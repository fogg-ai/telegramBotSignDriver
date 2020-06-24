package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.ProhibitionSigns;
import com.example.sing_progect_telegram.model.RoadSigns;
import com.example.sing_progect_telegram.service.dto.ProhibitionSignsDto;
import com.example.sing_progect_telegram.service.dto.RoadSignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface RoadSignsMapper extends EntityMapper<RoadSignsDto, RoadSigns>{

    RoadSigns toEntity(RoadSignsDto roadSignsDto);

    RoadSignsDto toDto(RoadSigns roadSigns);
}

