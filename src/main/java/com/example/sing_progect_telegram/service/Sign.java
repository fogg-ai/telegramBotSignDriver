package com.example.sing_progect_telegram.service;


import com.example.sing_progect_telegram.model.*;
import com.example.sing_progect_telegram.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@EnableJpaRepositories("com.example.sing_progect_telegram.repository")
public class Sign {
   final
   WarningSignsRepository warningSignsRepository;

   final
   PrioritySignsRepository prioritySignsRepository;

   final
   MandatorySignsRepository mandatorySignsRepository;

   final
   RoadSignsRepository roadSignsRepository;

   final
   ProhibitionSignsRepository prohibitionSignsRepository;

   final
   ServiceSignsRepository serviceSignsRepository;

   final
   InformationSignsRepository informationSignsRepository;

    public Sign(WarningSignsRepository warningSignsRepository, PrioritySignsRepository prioritySignsRepository, MandatorySignsRepository mandatorySignsRepository, RoadSignsRepository roadSignsRepository, ProhibitionSignsRepository prohibitionSignsRepository, ServiceSignsRepository serviceSignsRepository, InformationSignsRepository informationSignsRepository) {
        this.warningSignsRepository = warningSignsRepository;
        this.prioritySignsRepository = prioritySignsRepository;
        this.mandatorySignsRepository = mandatorySignsRepository;
        this.roadSignsRepository = roadSignsRepository;
        this.prohibitionSignsRepository = prohibitionSignsRepository;
        this.serviceSignsRepository = serviceSignsRepository;
        this.informationSignsRepository = informationSignsRepository;
    }

    public List<WarningSigns> getWarning() {
        List<WarningSigns> all = warningSignsRepository.findAll();
        return all;
    }

    public List<PrioritySigns> getPriority(){
        List<PrioritySigns> all = prioritySignsRepository.findAll();

        return all;
    }
    public List<ProhibitionSigns> getProhibition(){
        List<ProhibitionSigns> all = prohibitionSignsRepository.findAll();

        return all;
    }

    public List<MandatorySigns> getMandatory() {
        List<MandatorySigns> all = mandatorySignsRepository.findAll();

        return all;
    }

    public List<InformationSigns> getInformationSign() {
        List<InformationSigns> all = informationSignsRepository.findAll();

        return all;
    }
    public List<ServiceSigns> getServiceSign() {
        List<ServiceSigns> all = serviceSignsRepository.findAll();

        return all;
    }
    public List<RoadSigns> getRoadSign() {
        List<RoadSigns> all = roadSignsRepository.findAll();

        return all;
    }
}
