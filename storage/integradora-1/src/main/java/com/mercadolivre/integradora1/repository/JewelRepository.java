package com.mercadolivre.integradora1.repository;

import com.mercadolivre.integradora1.entity.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewelRepository extends JpaRepository<Jewel, Long> {
}
