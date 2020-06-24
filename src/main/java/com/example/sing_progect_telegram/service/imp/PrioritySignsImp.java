package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.model.PrioritySigns;
import com.example.sing_progect_telegram.repository.MandatorySignsRepository;
import com.example.sing_progect_telegram.repository.PrioritySignsRepository;
import com.example.sing_progect_telegram.service.MandatorySignsService;
import com.example.sing_progect_telegram.service.PrioritySignsService;
import com.example.sing_progect_telegram.service.dto.MandatorySignsDto;
import com.example.sing_progect_telegram.service.dto.PrioritySignsDto;
import com.example.sing_progect_telegram.service.mapper.MandatorySignsMapper;
import com.example.sing_progect_telegram.service.mapper.PrioritySignsMapper;
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

public class PrioritySignsImp implements PrioritySignsService {
    final
    PrioritySignsMapper prioritySignsMapper;

    final
    PrioritySignsRepository prioritySignsRepository;

    public PrioritySignsImp(PrioritySignsMapper prioritySignsMapper,
                            PrioritySignsRepository prioritySignsRepository) {
        this.prioritySignsMapper = prioritySignsMapper;
        this.prioritySignsRepository = prioritySignsRepository;
    }

    @Override
    public PrioritySignsDto save(PrioritySignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        PrioritySigns prioritySigns = prioritySignsMapper.toEntity(dto);
        prioritySigns = prioritySignsRepository.save(prioritySigns);
        return prioritySignsMapper.toDto(prioritySigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<PrioritySignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return prioritySignsRepository.findAll(pageable)
                .map(prioritySignsMapper::toDto);
    }

    @Override
    public Optional<PrioritySignsDto> findOne(Integer id) {
        return prioritySignsRepository.findById(id).map(prioritySignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        prioritySignsRepository.deleteById(id);
    }


}

