package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.service.dto.MandatorySignsDto;
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
public class MandatorySignsMapperImpl implements MandatorySignsMapper {

    @Override
    public List<MandatorySigns> toEntity(List<MandatorySignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MandatorySigns> list = new ArrayList<MandatorySigns>( dtoList.size() );
        for ( MandatorySignsDto mandatorySignsDto : dtoList ) {
            list.add( toEntity( mandatorySignsDto ) );
        }

        return list;
    }

    @Override
    public List<MandatorySignsDto> toDto(List<MandatorySigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MandatorySignsDto> list = new ArrayList<MandatorySignsDto>( entityList.size() );
        for ( MandatorySigns mandatorySigns : entityList ) {
            list.add( toDto( mandatorySigns ) );
        }

        return list;
    }

    @Override
    public MandatorySigns toEntity(MandatorySignsDto mandatorySignsDto) {
        if ( mandatorySignsDto == null ) {
            return null;
        }

        MandatorySigns mandatorySigns = new MandatorySigns();

        mandatorySigns.setId( mandatorySignsDto.getId() );
        mandatorySigns.setNumberRule( mandatorySignsDto.getNumberRule() );
        mandatorySigns.setImg( mandatorySignsDto.getImg() );
        mandatorySigns.setRule( mandatorySignsDto.getRule() );
        mandatorySigns.setText( mandatorySignsDto.getText() );

        return mandatorySigns;
    }

    @Override
    public MandatorySignsDto toDto(MandatorySigns mandatorySigns) {
        if ( mandatorySigns == null ) {
            return null;
        }

        MandatorySignsDto mandatorySignsDto = new MandatorySignsDto();

        mandatorySignsDto.setId( mandatorySigns.getId() );
        mandatorySignsDto.setNumberRule( mandatorySigns.getNumberRule() );
        mandatorySignsDto.setImg( mandatorySigns.getImg() );
        mandatorySignsDto.setRule( mandatorySigns.getRule() );
        mandatorySignsDto.setText( mandatorySigns.getText() );

        return mandatorySignsDto;
    }
}
