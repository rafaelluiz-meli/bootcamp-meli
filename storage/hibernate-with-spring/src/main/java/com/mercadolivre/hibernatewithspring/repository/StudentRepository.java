package com.mercadolivre.hibernatewithspring.repository;

import com.mercadolivre.hibernatewithspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
