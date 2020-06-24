package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.ServiceSigns;
import com.example.sing_progect_telegram.model.WarningSigns;
import com.example.sing_progect_telegram.repository.ServiceSignsRepository;
import com.example.sing_progect_telegram.repository.WarningSignsRepository;
import com.example.sing_progect_telegram.service.ServiceSignsService;
import com.example.sing_progect_telegram.service.WarningSignsService;
import com.example.sing_progect_telegram.service.dto.ServiceSignsDto;
import com.example.sing_progect_telegram.service.dto.WarningSignsDto;
import com.example.sing_progect_telegram.service.mapper.ServiceSignsMapper;
import com.example.sing_progect_telegram.service.mapper.WarningSignsMapper;
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

public class WarningSignsRepositoryImp implements WarningSignsService {
    final
    WarningSignsMapper warningSignsMapper;

    final
    WarningSignsRepository warningSignsRepository;

    public WarningSignsRepositoryImp(WarningSignsMapper warningSignsMapper,
                                     WarningSignsRepository warningSignsRepository) {
        this.warningSignsMapper = warningSignsMapper;
        this.warningSignsRepository = warningSignsRepository;
    }

    @Override
    public WarningSignsDto save(WarningSignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        WarningSigns serviceSigns = warningSignsMapper.toEntity(dto);
        serviceSigns = warningSignsRepository.save(serviceSigns);
        return warningSignsMapper.toDto(serviceSigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<WarningSignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return warningSignsRepository.findAll(pageable)
                .map(warningSignsMapper::toDto);
    }

    @Override
    public Optional<WarningSignsDto> findOne(Integer id) {
        return warningSignsRepository.findById(id).map(warningSignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        warningSignsRepository.deleteById(id);
    }


}

