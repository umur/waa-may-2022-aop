package com.example.demo.service;

import com.example.demo.entity.bidirect.ActivityLog;
import com.example.demo.repository.ActivityLogRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ActivityLogService {
    private final ActivityLogRepo activityLogRepo;

    public  void save(ActivityLog acLog){
        activityLogRepo.save(acLog);
    }
}
