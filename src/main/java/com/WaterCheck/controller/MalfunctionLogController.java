package com.WaterCheck.controller;

import com.WaterCheck.service.MalfunctionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/malfunction-logs")
public class MalfunctionLogController {

    @Autowired
    private MalfunctionLogService malfunctionLogService;

    // CRUD endpoints similar to PlantController
}