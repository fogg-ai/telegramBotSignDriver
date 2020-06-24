package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.ProhibitionSigns;
import com.example.sing_progect_telegram.service.dto.ProhibitionSignsDto;
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
public class ProhibitionSignsMapperImpl implements ProhibitionSignsMapper {

    @Override
    public List<ProhibitionSigns> toEntity(List<ProhibitionSignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProhibitionSigns> list = new ArrayList<ProhibitionSigns>( dtoList.size() );
        for ( ProhibitionSignsDto prohibitionSignsDto : dtoList ) {
            list.add( toEntity( prohibitionSignsDto ) );
        }

        return list;
    }

    @Override
    public List<ProhibitionSignsDto> toDto(List<ProhibitionSigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProhibitionSignsDto> list = new ArrayList<ProhibitionSignsDto>( entityList.size() );
        for ( ProhibitionSigns prohibitionSigns : entityList ) {
            list.add( toDto( prohibitionSigns ) );
        }

        return list;
    }

    @Override
    public ProhibitionSigns toEntity(ProhibitionSignsDto prohibitionSignsDto) {
        if ( prohibitionSignsDto == null ) {
            return null;
        }

        ProhibitionSigns prohibitionSigns = new ProhibitionSigns();

        prohibitionSigns.setId( prohibitionSignsDto.getId() );
        prohibitionSigns.setNumberRule( prohibitionSignsDto.getNumberRule() );
        prohibitionSigns.setImg( prohibitionSignsDto.getImg() );
        prohibitionSigns.setRule( prohibitionSignsDto.getRule() );
        prohibitionSigns.setText( prohibitionSignsDto.getText() );

        return prohibitionSigns;
    }

    @Override
    public ProhibitionSignsDto toDto(ProhibitionSigns prohibitionSigns) {
        if ( prohibitionSigns == null ) {
            return null;
        }

        ProhibitionSignsDto prohibitionSignsDto = new ProhibitionSignsDto();

        prohibitionSignsDto.setId( prohibitionSigns.getId() );
        prohibitionSignsDto.setNumberRule( prohibitionSigns.getNumberRule() );
        prohibitionSignsDto.setImg( prohibitionSigns.getImg() );
        prohibitionSignsDto.setRule( prohibitionSigns.getRule() );
        prohibitionSignsDto.setText( prohibitionSigns.getText() );

        return prohibitionSignsDto;
    }
}
