package com.example.sing_progect_telegram.service.imp;


import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.model.ServiceSigns;
import com.example.sing_progect_telegram.repository.InformationSignsRepository;
import com.example.sing_progect_telegram.repository.ServiceSignsRepository;
import com.example.sing_progect_telegram.service.InformationSignsService;
import com.example.sing_progect_telegram.service.ServiceSignsService;
import com.example.sing_progect_telegram.service.dto.InformationSignsDto;
import com.example.sing_progect_telegram.service.dto.ServiceSignsDto;
import com.example.sing_progect_telegram.service.mapper.InformationSignsMapper;
import com.example.sing_progect_telegram.service.mapper.ServiceSignsMapper;
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

public class ServiceSignImp implements ServiceSignsService {
    final
    ServiceSignsMapper serviceSignsMapper;

    final
    ServiceSignsRepository serviceSignsRepository;

    public ServiceSignImp(ServiceSignsMapper serviceSignsMapper,
                          ServiceSignsRepository serviceSignsRepository) {
        this.serviceSignsMapper = serviceSignsMapper;
        this.serviceSignsRepository = serviceSignsRepository;
    }

    @Override
    public ServiceSignsDto save(ServiceSignsDto dto) {
        log.debug("Request to save informationSignsDto : {}", dto);
        ServiceSigns serviceSigns = serviceSignsMapper.toEntity(dto);
        serviceSigns = serviceSignsRepository.save(serviceSigns);
        return serviceSignsMapper.toDto(serviceSigns);
    }


    @Transactional(readOnly = true)
    @Override
    public Page<ServiceSignsDto> findAll(Pageable pageable) {
        log.debug("Request to get all Group");
        return serviceSignsRepository.findAll(pageable)
                .map(serviceSignsMapper::toDto);
    }

    @Override
    public Optional<ServiceSignsDto> findOne(Integer id) {
        return serviceSignsRepository.findById(id).map(serviceSignsMapper::toDto);
    }

    @Override
    public void delete(Integer id) {
        serviceSignsRepository.deleteById(id);
    }


}

