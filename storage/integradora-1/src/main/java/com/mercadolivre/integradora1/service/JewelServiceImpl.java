package com.mercadolivre.integradora1.service;

import com.mercadolivre.integradora1.dto.JewelDTO;
import com.mercadolivre.integradora1.entity.Jewel;
import com.mercadolivre.integradora1.repository.JewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JewelServiceImpl implements JewelService{

    @Autowired
    private JewelRepository jewelRepository;

    @Override
    public Jewel addJewel(Jewel jewel) {
        return jewelRepository.save(jewel);
    }

    @Override
    public List<Jewel> listJewels() {
        return jewelRepository.findAll();
    }

    @Override
    public void removeJewel(Long id) {
        jewelRepository.deleteById(id);
    }

    @Override
    public Optional<Jewel> updateJewel(Jewel jewel) {
        return Optional.empty();
    }
}
