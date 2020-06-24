package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.repository.InformationSignsRepository;
import com.example.sing_progect_telegram.repository.MandatorySignsRepository;
import com.example.sing_progect_telegram.service.InformationSignsService;
import com.example.sing_progect_telegram.service.MandatorySignsService;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;
import com.example.sing_progect_telegram.service.dto.MandatorySignsDto;
import com.example.sing_progect_telegram.service.mapper.InformationSignsMapper;
import com.example.sing_progect_telegram.service.mapper.MandatorySignsMapper;
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
public class MandatorySignsImp implements MandatorySignsService {
    final
    MandatorySignsMapper mandatorySignsMapper;

    final
    MandatorySignsRepository mandatorySignsRepository;

    public MandatorySignsImp(MandatorySignsMapper mandatorySignsMapper,
                             MandatorySignsRepository mandatorySignsRepository) {
        this.mandatorySignsMapper = mandatorySignsMapper;
        this.mandatorySignsRepository = mandatorySignsRepository;
    }

    @Override
    public MandatorySignsDto save(MandatorySignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        MandatorySigns mandatorySigns = mandatorySignsMapper.toEntity(dto);
        mandatorySigns = mandatorySignsRepository.save(mandatorySigns);
        return mandatorySignsMapper.toDto(mandatorySigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<MandatorySignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return mandatorySignsRepository.findAll(pageable)
                .map(mandatorySignsMapper::toDto);
    }

    @Override
    public Optional<MandatorySignsDto> findOne(Integer id) {
        return mandatorySignsRepository.findById(id).map(mandatorySignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        mandatorySignsRepository.deleteById(id);
    }


}

