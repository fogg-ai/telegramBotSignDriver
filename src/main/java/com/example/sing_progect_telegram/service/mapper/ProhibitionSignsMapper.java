package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.PrioritySigns;
import com.example.sing_progect_telegram.model.ProhibitionSigns;
import com.example.sing_progect_telegram.service.dto.PrioritySignsDto;
import com.example.sing_progect_telegram.service.dto.ProhibitionSignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ProhibitionSignsMapper extends EntityMapper<ProhibitionSignsDto, ProhibitionSigns>{

    ProhibitionSigns toEntity(ProhibitionSignsDto prohibitionSignsDto);

    ProhibitionSignsDto toDto(ProhibitionSigns prohibitionSigns);
}

