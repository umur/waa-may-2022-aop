package com.project.spring.service;

import com.project.spring.entity.ActivityLog;
import org.springframework.stereotype.Service;

@Service
public interface ActivityLogService {
    void save(ActivityLog activityLog);
}
