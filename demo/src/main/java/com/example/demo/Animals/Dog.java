package com.example.demo.Animals;

import java.time.LocalDate;

public class Dog {

    private Long ID;
    private String name;
    private int age;
    private LocalDate adoptionDate;
    private String ownerName;

    public Dog(){

    }

    public Dog(Long ID, String name, int age, LocalDate adoptionDate, String ownerName) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.adoptionDate = adoptionDate;
        this.ownerName = ownerName;
    }

    public Dog(String name, int age, LocalDate adoptionDate, String ownerName) {
        this.name = name;
        this.age = age;
        this.adoptionDate = adoptionDate;
        this.ownerName = ownerName;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adoptionDate=" + adoptionDate +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
