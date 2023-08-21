package com.WaterCheck.enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "plants")
@AllArgsConstructor
@Data
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plantId;

    @Column(name = "location_x")
    private Integer locationX;

    @Column(name = "location_y")
    private Integer locationY;

    @Column(name = "last_watered_time")
    private LocalDateTime lastWateredTime;

    // Getters, Setters, Constructors, equals(), hashCode(), and toString() methods
}

