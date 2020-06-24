package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.WarningSigns;
import com.example.sing_progect_telegram.service.dto.WarningSignsDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-24T16:35:05+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 12.0.1 (Oracle Corporation)"
)
@Component
public class WarningSignsMapperImpl implements WarningSignsMapper {

    @Override
    public List<WarningSigns> toEntity(List<WarningSignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<WarningSigns> list = new ArrayList<WarningSigns>( dtoList.size() );
        for ( WarningSignsDto warningSignsDto : dtoList ) {
            list.add( toEntity( warningSignsDto ) );
        }

        return list;
    }

    @Override
    public List<WarningSignsDto> toDto(List<WarningSigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<WarningSignsDto> list = new ArrayList<WarningSignsDto>( entityList.size() );
        for ( WarningSigns warningSigns : entityList ) {
            list.add( toDto( warningSigns ) );
        }

        return list;
    }

    @Override
    public WarningSigns toEntity(WarningSignsDto serviceSignsDto) {
        if ( serviceSignsDto == null ) {
            return null;
        }

        WarningSigns warningSigns = new WarningSigns();

        warningSigns.setId( serviceSignsDto.getId() );
        warningSigns.setNumberRule( serviceSignsDto.getNumberRule() );
        warningSigns.setImg( serviceSignsDto.getImg() );
        warningSigns.setRule( serviceSignsDto.getRule() );
        warningSigns.setText( serviceSignsDto.getText() );

        return warningSigns;
    }

    @Override
    public WarningSignsDto toDto(WarningSigns serviceSigns) {
        if ( serviceSigns == null ) {
            return null;
        }

        WarningSignsDto warningSignsDto = new WarningSignsDto();

        warningSignsDto.setId( serviceSigns.getId() );
        warningSignsDto.setNumberRule( serviceSigns.getNumberRule() );
        warningSignsDto.setImg( serviceSigns.getImg() );
        warningSignsDto.setRule( serviceSigns.getRule() );
        warningSignsDto.setText( serviceSigns.getText() );

        return warningSignsDto;
    }
}
