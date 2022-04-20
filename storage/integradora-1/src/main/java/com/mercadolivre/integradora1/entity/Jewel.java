package com.mercadolivre.integradora1.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Builder
@Getter @Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Jewel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String material;
    private Double weight;
    private String carat;
}
