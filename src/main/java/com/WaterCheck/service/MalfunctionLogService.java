package com.WaterCheck.service;

import com.WaterCheck.repositories.MalfunctionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MalfunctionLogService {

    @Autowired
    private MalfunctionLogRepository malfunctionLogRepository;
}
