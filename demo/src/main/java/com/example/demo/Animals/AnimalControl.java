package com.example.demo.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AnimalControl {

    private final AnimalService animalService;

    @Autowired
    public AnimalControl(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/")
    public List<Dog> test(){
        return animalService.test();
    }


}
