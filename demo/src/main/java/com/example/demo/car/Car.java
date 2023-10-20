package com.example.demo.car;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Car {

    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )
    private Long id;
    private String model;
    private String color;
    private LocalDate dop;
    private Integer insurance;

    public Car() {
    }

    public Car(Long id,
               String model,
               String color,
               LocalDate dop,
               Integer insurance) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.dop = dop;
        this.insurance = insurance;
    }

    public Car(String model,
               String color,
               LocalDate dop,
               Integer insurance) {
        this.model = model;
        this.color = color;
        this.dop = dop;
        this.insurance = insurance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public Integer getinsurance() {
        return insurance;
    }

    public void setinsurance(Integer insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", dop=" + dop +
                ", insurance=" + insurance +
                '}';
    }
}
