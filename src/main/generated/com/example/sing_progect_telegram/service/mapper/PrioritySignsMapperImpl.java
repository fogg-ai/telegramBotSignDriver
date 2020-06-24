package com.example.sing_progect_telegram.service.mapper;

import com.example.sing_progect_telegram.model.PrioritySigns;
import com.example.sing_progect_telegram.service.dto.PrioritySignsDto;
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
public class PrioritySignsMapperImpl implements PrioritySignsMapper {

    @Override
    public List<PrioritySigns> toEntity(List<PrioritySignsDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PrioritySigns> list = new ArrayList<PrioritySigns>( dtoList.size() );
        for ( PrioritySignsDto prioritySignsDto : dtoList ) {
            list.add( toEntity( prioritySignsDto ) );
        }

        return list;
    }

    @Override
    public List<PrioritySignsDto> toDto(List<PrioritySigns> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PrioritySignsDto> list = new ArrayList<PrioritySignsDto>( entityList.size() );
        for ( PrioritySigns prioritySigns : entityList ) {
            list.add( toDto( prioritySigns ) );
        }

        return list;
    }

    @Override
    public PrioritySigns toEntity(PrioritySignsDto prioritySignsDto) {
        if ( prioritySignsDto == null ) {
            return null;
        }

        PrioritySigns prioritySigns = new PrioritySigns();

        prioritySigns.setId( prioritySignsDto.getId() );
        prioritySigns.setNumberRule( prioritySignsDto.getNumberRule() );
        prioritySigns.setImg( prioritySignsDto.getImg() );
        prioritySigns.setRule( prioritySignsDto.getRule() );
        prioritySigns.setText( prioritySignsDto.getText() );

        return prioritySigns;
    }

    @Override
    public PrioritySignsDto toDto(PrioritySigns prioritySigns) {
        if ( prioritySigns == null ) {
            return null;
        }

        PrioritySignsDto prioritySignsDto = new PrioritySignsDto();

        prioritySignsDto.setId( prioritySigns.getId() );
        prioritySignsDto.setNumberRule( prioritySigns.getNumberRule() );
        prioritySignsDto.setImg( prioritySigns.getImg() );
        prioritySignsDto.setRule( prioritySigns.getRule() );
        prioritySignsDto.setText( prioritySigns.getText() );

        return prioritySignsDto;
    }
}
