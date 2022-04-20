package com.mercadolivre.integradora1.service;

import com.mercadolivre.integradora1.dto.JewelDTO;
import com.mercadolivre.integradora1.entity.Jewel;

import java.util.List;
import java.util.Optional;

public interface JewelService {

    Jewel addJewel(Jewel jewel);
    List<Jewel> listJewels();
    void removeJewel(Long id);
    Optional<Jewel> updateJewel(Jewel jewel);
}
