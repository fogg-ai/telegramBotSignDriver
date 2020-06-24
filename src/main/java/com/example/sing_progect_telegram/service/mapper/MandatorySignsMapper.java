package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;
import com.example.sing_progect_telegram.service.dto.MandatorySignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface MandatorySignsMapper extends EntityMapper<MandatorySignsDto, MandatorySigns>{

    MandatorySigns toEntity(MandatorySignsDto mandatorySignsDto);

    MandatorySignsDto toDto(MandatorySigns mandatorySigns);
}

