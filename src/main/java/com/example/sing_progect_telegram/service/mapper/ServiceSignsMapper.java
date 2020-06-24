package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.RoadSigns;
import com.example.sing_progect_telegram.model.ServiceSigns;
import com.example.sing_progect_telegram.service.dto.RoadSignsDto;
import com.example.sing_progect_telegram.service.dto.ServiceSignsDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ServiceSignsMapper extends EntityMapper<ServiceSignsDto, ServiceSigns>{

    ServiceSigns toEntity(ServiceSignsDto serviceSignsDto);

    ServiceSignsDto toDto(ServiceSigns serviceSigns);
}

