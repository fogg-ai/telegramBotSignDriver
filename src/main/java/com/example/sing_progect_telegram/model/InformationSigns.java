package com.example.sing_progect_telegram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationSigns {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String numberRule;

    private String img;
    @Column(length = 5000)
    private String rule;

    @Column(length = 9000)
    private String text;
}
