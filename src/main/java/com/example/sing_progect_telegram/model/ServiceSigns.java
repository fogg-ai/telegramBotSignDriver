package com.example.sing_progect_telegram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceSigns {
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
