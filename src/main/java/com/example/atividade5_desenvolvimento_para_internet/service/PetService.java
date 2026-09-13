package com.example.atividade5_desenvolvimento_para_internet.service;

import com.example.atividade5_desenvolvimento_para_internet.model.Pets;
import com.example.atividade5_desenvolvimento_para_internet.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetsRepository petsRepository;
    public Pets save(Pets pet){return petsRepository.save(pet);}
    public List<Pets> findAll(){return petsRepository.findAll();}

}
