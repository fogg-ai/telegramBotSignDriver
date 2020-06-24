package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.repository.InformationSignsRepository;
import com.example.sing_progect_telegram.service.InformationSignsService;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;
import com.example.sing_progect_telegram.service.mapper.InformationSignsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
@Transactional
public class InformationSignsImp implements InformationSignsService {
    final
    InformationSignsMapper informationSignsMapper;

    final
    InformationSignsRepository informationSignsRepository;

    public InformationSignsImp(InformationSignsMapper informationSignsMapper,
                               InformationSignsRepository informationSignsRepository) {
        this.informationSignsMapper = informationSignsMapper;
        this.informationSignsRepository = informationSignsRepository;
    }

    @Override
    public InformationSignsDto save(InformationSignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        InformationSigns informationSigns = informationSignsMapper.toEntity(dto);
        informationSigns = informationSignsRepository.save(informationSigns);
        return informationSignsMapper.toDto(informationSigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<InformationSignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return informationSignsRepository.findAll(pageable)
                .map(informationSignsMapper::toDto);
    }

    @Override
    public Optional<InformationSignsDto> findOne(Integer id) {
        return informationSignsRepository.findById(id).map(informationSignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        informationSignsRepository.deleteById(id);
    }


}

