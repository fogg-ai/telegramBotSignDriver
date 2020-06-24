package com.example.sing_progect_telegram.repository;

import com.example.sing_progect_telegram.model.RoadSigns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface RoadSignsRepository extends JpaRepository<RoadSigns,Integer> {
}
