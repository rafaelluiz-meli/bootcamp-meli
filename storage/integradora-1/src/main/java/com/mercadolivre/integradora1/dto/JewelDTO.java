package com.mercadolivre.integradora1.dto;

import com.mercadolivre.integradora1.entity.Jewel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter @Setter
public class JewelDTO {

    private String material;
    private Double weight;
    private String carat;

    public Jewel map() {
        return Jewel.builder().material(this.material).weight(this.weight).carat(this.carat).build();
    }

    public static JewelDTO map(Jewel jewel){
        return JewelDTO.builder().material(jewel.getMaterial()).weight(jewel.getWeight()).carat(jewel.getCarat()).build();
    }
}
