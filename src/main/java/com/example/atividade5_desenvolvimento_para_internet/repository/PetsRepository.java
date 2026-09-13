package com.example.atividade5_desenvolvimento_para_internet.repository;

import com.example.atividade5_desenvolvimento_para_internet.model.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends JpaRepository<Pets,Integer> {

}
