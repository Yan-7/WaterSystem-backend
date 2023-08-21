package com.WaterCheck.repositories;

import com.WaterCheck.enteties.MalfunctionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MalfunctionLogRepository extends JpaRepository<MalfunctionLog, Integer> {
}
