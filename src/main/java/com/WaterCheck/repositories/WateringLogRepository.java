package com.WaterCheck.repositories;

import com.WaterCheck.enteties.Plant;
import com.WaterCheck.enteties.WateringLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WateringLogRepository extends JpaRepository<WateringLog, Integer> {
}


