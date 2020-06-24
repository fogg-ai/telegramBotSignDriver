package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.RoadSigns;
import com.example.sing_progect_telegram.service.dto.RoadSignsDto;
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
public class RoadSignsMapperImpl implements RoadSignsMapper {

    @Override
    public List<RoadSigns> toEntity(List<RoadSignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RoadSigns> list = new ArrayList<RoadSigns>( dtoList.size() );
        for ( RoadSignsDto roadSignsDto : dtoList ) {
            list.add( toEntity( roadSignsDto ) );
        }

        return list;
    }

    @Override
    public List<RoadSignsDto> toDto(List<RoadSigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RoadSignsDto> list = new ArrayList<RoadSignsDto>( entityList.size() );
        for ( RoadSigns roadSigns : entityList ) {
            list.add( toDto( roadSigns ) );
        }

        return list;
    }

    @Override
    public RoadSigns toEntity(RoadSignsDto roadSignsDto) {
        if ( roadSignsDto == null ) {
            return null;
        }

        RoadSigns roadSigns = new RoadSigns();

        roadSigns.setId( roadSignsDto.getId() );
        roadSigns.setNumberRule( roadSignsDto.getNumberRule() );
        roadSigns.setImg( roadSignsDto.getImg() );
        roadSigns.setRule( roadSignsDto.getRule() );
        roadSigns.setText( roadSignsDto.getText() );

        return roadSigns;
    }

    @Override
    public RoadSignsDto toDto(RoadSigns roadSigns) {
        if ( roadSigns == null ) {
            return null;
        }

        RoadSignsDto roadSignsDto = new RoadSignsDto();

        roadSignsDto.setId( roadSigns.getId() );
        roadSignsDto.setNumberRule( roadSigns.getNumberRule() );
        roadSignsDto.setImg( roadSigns.getImg() );
        roadSignsDto.setRule( roadSigns.getRule() );
        roadSignsDto.setText( roadSigns.getText() );

        return roadSignsDto;
    }
}
