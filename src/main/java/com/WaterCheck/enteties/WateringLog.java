package com.WaterCheck.enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "watering_logs")
@AllArgsConstructor
@Data
public class WateringLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logId;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;

    @Column( name = "watering_time")
    private LocalDate wateringTime;

    @Column(name = "watering_duration")
    private Integer wateringDuration;




}
