package com.WaterCheck.enteties;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "plants")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plantId;

    @Column(name = "contamination")
    private Integer contamination;

    @Column(name = "name")
    private String name;

    @Column(name = "location_x")
    private Integer locationX;

    @Column(name = "location_y")
    private Integer locationY;

    @Column(name = "last_watered_time")
    private LocalDateTime lastWateredTime;

}

