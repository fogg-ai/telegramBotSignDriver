package com.example.sing_progect_telegram.service.mapper;


import com.example.sing_progect_telegram.model.WarningSigns;
import com.example.sing_progect_telegram.service.dto.WarningSignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface WarningSignsMapper extends EntityMapper<WarningSignsDto, WarningSigns>{

    WarningSigns toEntity(WarningSignsDto serviceSignsDto);

    WarningSignsDto toDto(WarningSigns serviceSigns);
}

