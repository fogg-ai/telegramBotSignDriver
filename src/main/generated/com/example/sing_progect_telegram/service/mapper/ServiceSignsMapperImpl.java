package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.ServiceSigns;
import com.example.sing_progect_telegram.service.dto.ServiceSignsDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-24T16:35:04+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 12.0.1 (Oracle Corporation)"
)
@Component
public class ServiceSignsMapperImpl implements ServiceSignsMapper {

    @Override
    public List<ServiceSigns> toEntity(List<ServiceSignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ServiceSigns> list = new ArrayList<ServiceSigns>( dtoList.size() );
        for ( ServiceSignsDto serviceSignsDto : dtoList ) {
            list.add( toEntity( serviceSignsDto ) );
        }

        return list;
    }

    @Override
    public List<ServiceSignsDto> toDto(List<ServiceSigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ServiceSignsDto> list = new ArrayList<ServiceSignsDto>( entityList.size() );
        for ( ServiceSigns serviceSigns : entityList ) {
            list.add( toDto( serviceSigns ) );
        }

        return list;
    }

    @Override
    public ServiceSigns toEntity(ServiceSignsDto serviceSignsDto) {
        if ( serviceSignsDto == null ) {
            return null;
        }

        ServiceSigns serviceSigns = new ServiceSigns();

        serviceSigns.setId( serviceSignsDto.getId() );
        serviceSigns.setNumberRule( serviceSignsDto.getNumberRule() );
        serviceSigns.setImg( serviceSignsDto.getImg() );
        serviceSigns.setRule( serviceSignsDto.getRule() );
        serviceSigns.setText( serviceSignsDto.getText() );

        return serviceSigns;
    }

    @Override
    public ServiceSignsDto toDto(ServiceSigns serviceSigns) {
        if ( serviceSigns == null ) {
            return null;
        }

        ServiceSignsDto serviceSignsDto = new ServiceSignsDto();

        serviceSignsDto.setId( serviceSigns.getId() );
        serviceSignsDto.setNumberRule( serviceSigns.getNumberRule() );
        serviceSignsDto.setImg( serviceSigns.getImg() );
        serviceSignsDto.setRule( serviceSigns.getRule() );
        serviceSignsDto.setText( serviceSigns.getText() );

        return serviceSignsDto;
    }
}
