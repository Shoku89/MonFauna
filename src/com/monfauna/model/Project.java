package com.monfauna.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private Integer id;
    private String name;
    private List<Animal> animals = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animals=" + animals +
                '}';
    }
}
