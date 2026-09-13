package com.example.atividade5_desenvolvimento_para_internet.controller;

import com.example.atividade5_desenvolvimento_para_internet.model.Pets;
import com.example.atividade5_desenvolvimento_para_internet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @Autowired
    private PetService petService;


    @PostMapping
    public Pets save(@RequestBody Pets pet) {
        return petService.save(pet);
    }

    @GetMapping
    public List<Pets> findAll() {
        return petService.findAll();
    }
}