package com.project.spring.service.Impl;

import com.project.spring.entity.ActivityLog;
import com.project.spring.repository.ActivityLogRepository;
import com.project.spring.service.ActivityLogService;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {

    private final ActivityLogRepository activityLogRepository;

    public ActivityLogServiceImpl(ActivityLogRepository activityLogRepository) {
        this.activityLogRepository = activityLogRepository;
    }

    public void save(ActivityLog activityLog) {
        activityLogRepository.save(activityLog);
    }
}
