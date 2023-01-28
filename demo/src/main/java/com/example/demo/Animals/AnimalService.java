package com.example.demo.Animals;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnimalService {

    public List<Dog> test(){
        return List.of(new Dog(1L,"Fluffy", 2, LocalDate.of(2023, 1, 28), "Peter"));
    }
}
