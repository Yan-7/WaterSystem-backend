package com.WaterCheck.controller;

import com.WaterCheck.enteties.Plant;
import com.WaterCheck.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plants")
@CrossOrigin(origins = "http://localhost:3000")
public class PlantController {
    @Autowired
    private PlantService plantService;

    @GetMapping
    public ResponseEntity<List<Plant>> getAllPlants() {
        return ResponseEntity.ok(plantService.getAllPlants());
    }

    @GetMapping("/{plantId}")
    public ResponseEntity<Plant> getPlantById(@PathVariable int plantId) {
        return plantService.getPlantById(plantId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Plant> createPlant(@RequestBody Plant plant) {
        return ResponseEntity.ok(plantService.savePlant(plant));
    }

    @PutMapping("/{plantId}")
    public ResponseEntity<Plant> updatePlant(@PathVariable int plantId, @RequestBody Plant plant) {
        if (!plantService.getPlantById(plantId).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        plant.setPlantId(plantId);
        return ResponseEntity.ok(plantService.savePlant(plant));
    }

    @DeleteMapping("/{plantId}")
    public ResponseEntity<Void> deletePlant(@PathVariable int plantId) {
        plantService.deletePlant(plantId);
        return ResponseEntity.noContent().build();
    }
}
