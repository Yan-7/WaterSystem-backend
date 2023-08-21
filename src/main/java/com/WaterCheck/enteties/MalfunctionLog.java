package com.WaterCheck.enteties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Malfunction_logs")
public class MalfunctionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;

    @Column (name = "detection_time")
    private LocalDate detectionTime;

    @Column( name = "contamination_level")
    private String contaminationLevel;

}
