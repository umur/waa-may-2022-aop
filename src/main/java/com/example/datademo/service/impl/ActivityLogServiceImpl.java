package com.example.datademo.service.impl;

import com.example.datademo.entity.ActivityLog;
import com.example.datademo.repository.ActivityLogRepository;
import com.example.datademo.service.ActivityLogService;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {
    private ActivityLogRepository activityLogRepository;
    public ActivityLogServiceImpl(ActivityLogRepository activityLogRepository){
        this.activityLogRepository = activityLogRepository;
    }
    @Override
    public void save(ActivityLog a) {
        activityLogRepository.save(a);
    }
}
