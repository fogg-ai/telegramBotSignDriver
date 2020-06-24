package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.ProhibitionSigns;
import com.example.sing_progect_telegram.model.RoadSigns;
import com.example.sing_progect_telegram.repository.ProhibitionSignsRepository;
import com.example.sing_progect_telegram.repository.RoadSignsRepository;
import com.example.sing_progect_telegram.service.ProhibitionSignsService;
import com.example.sing_progect_telegram.service.RoadSignsService;
import com.example.sing_progect_telegram.service.dto.ProhibitionSignsDto;
import com.example.sing_progect_telegram.service.dto.RoadSignsDto;
import com.example.sing_progect_telegram.service.mapper.ProhibitionSignsMapper;
import com.example.sing_progect_telegram.service.mapper.RoadSignsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@Transactional

public class RoadSignsImp implements RoadSignsService {
    final
    RoadSignsMapper roadSignsMapper;

    final
    RoadSignsRepository roadSignsRepository;

    public RoadSignsImp(RoadSignsMapper roadSignsMapper,
                        RoadSignsRepository roadSignsRepository) {
        this.roadSignsMapper = roadSignsMapper;
        this.roadSignsRepository = roadSignsRepository;
    }

    @Override
    public RoadSignsDto save(RoadSignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        RoadSigns roadSigns = roadSignsMapper.toEntity(dto);
        roadSigns = roadSignsRepository.save(roadSigns);
        return roadSignsMapper.toDto(roadSigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<RoadSignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return roadSignsRepository.findAll(pageable)
                .map(roadSignsMapper::toDto);
    }

    @Override
    public Optional<RoadSignsDto> findOne(Integer id) {
        return roadSignsRepository.findById(id).map(roadSignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        roadSignsRepository.deleteById(id);
    }


}

