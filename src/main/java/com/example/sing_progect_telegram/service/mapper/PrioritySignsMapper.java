package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.model.PrioritySigns;
import com.example.sing_progect_telegram.service.dto.MandatorySignsDto;
import com.example.sing_progect_telegram.service.dto.PrioritySignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PrioritySignsMapper extends EntityMapper<PrioritySignsDto, PrioritySigns>{

    PrioritySigns toEntity(PrioritySignsDto prioritySignsDto);

    PrioritySignsDto toDto(PrioritySigns prioritySigns);
}

