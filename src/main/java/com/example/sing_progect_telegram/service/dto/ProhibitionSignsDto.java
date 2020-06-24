package com.example.sing_progect_telegram.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProhibitionSignsDto {
    private Integer id;
    private String numberRule;

    private String img;

    private String rule;
    private String text;


    public ProhibitionSignsDto(String numberRule, String img, String rule, String text) {
        this.numberRule = numberRule;
        this.img = img;
        this.rule = rule;
        this.text = text;
    }
}
