package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;
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
public class InformationSignsMapperImpl implements InformationSignsMapper {

    @Override
    public List<InformationSigns> toEntity(List<InformationSignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<InformationSigns> list = new ArrayList<InformationSigns>( dtoList.size() );
        for ( InformationSignsDto informationSignsDto : dtoList ) {
            list.add( toEntity( informationSignsDto ) );
        }

        return list;
    }

    @Override
    public List<InformationSignsDto> toDto(List<InformationSigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<InformationSignsDto> list = new ArrayList<InformationSignsDto>( entityList.size() );
        for ( InformationSigns informationSigns : entityList ) {
            list.add( toDto( informationSigns ) );
        }

        return list;
    }

    @Override
    public InformationSigns toEntity(InformationSignsDto informationSignsDto) {
        if ( informationSignsDto == null ) {
            return null;
        }

        InformationSigns informationSigns = new InformationSigns();

        informationSigns.setId( informationSignsDto.getId() );
        informationSigns.setNumberRule( informationSignsDto.getNumberRule() );
        informationSigns.setImg( informationSignsDto.getImg() );
        informationSigns.setRule( informationSignsDto.getRule() );
        informationSigns.setText( informationSignsDto.getText() );

        return informationSigns;
    }

    @Override
    public InformationSignsDto toDto(InformationSigns informationSigns) {
        if ( informationSigns == null ) {
            return null;
        }

        InformationSignsDto informationSignsDto = new InformationSignsDto();

        informationSignsDto.setId( informationSigns.getId() );
        informationSignsDto.setNumberRule( informationSigns.getNumberRule() );
        informationSignsDto.setImg( informationSigns.getImg() );
        informationSignsDto.setRule( informationSigns.getRule() );
        informationSignsDto.setText( informationSigns.getText() );

        return informationSignsDto;
    }
}
