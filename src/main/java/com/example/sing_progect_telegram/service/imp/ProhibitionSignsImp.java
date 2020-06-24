package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.PrioritySigns;
import com.example.sing_progect_telegram.model.ProhibitionSigns;
import com.example.sing_progect_telegram.repository.PrioritySignsRepository;
import com.example.sing_progect_telegram.repository.ProhibitionSignsRepository;
import com.example.sing_progect_telegram.service.PrioritySignsService;
import com.example.sing_progect_telegram.service.ProhibitionSignsService;
import com.example.sing_progect_telegram.service.dto.PrioritySignsDto;
import com.example.sing_progect_telegram.service.dto.ProhibitionSignsDto;
import com.example.sing_progect_telegram.service.mapper.PrioritySignsMapper;
import com.example.sing_progect_telegram.service.mapper.ProhibitionSignsMapper;
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

public class ProhibitionSignsImp implements ProhibitionSignsService {
    final
    ProhibitionSignsMapper prioritySignsMapper;

    final
    ProhibitionSignsRepository prohibitionSignsRepository;

    public ProhibitionSignsImp(ProhibitionSignsMapper prioritySignsMapper,
                               ProhibitionSignsRepository prohibitionSignsRepository) {
        this.prioritySignsMapper = prioritySignsMapper;
        this.prohibitionSignsRepository = prohibitionSignsRepository;
    }

    @Override
    public ProhibitionSignsDto save(ProhibitionSignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        ProhibitionSigns prohibitionSigns = prioritySignsMapper.toEntity(dto);
        prohibitionSigns = prohibitionSignsRepository.save(prohibitionSigns);
        return prioritySignsMapper.toDto(prohibitionSigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<ProhibitionSignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return prohibitionSignsRepository.findAll(pageable)
                .map(prioritySignsMapper::toDto);
    }

    @Override
    public Optional<ProhibitionSignsDto> findOne(Integer id) {
        return prohibitionSignsRepository.findById(id).map(prioritySignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        prohibitionSignsRepository.deleteById(id);
    }


}

