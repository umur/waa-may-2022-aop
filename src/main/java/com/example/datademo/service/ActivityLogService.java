package com.example.datademo.service;

import com.example.datademo.entity.ActivityLog;
import com.example.datademo.entity.Address;
import org.springframework.stereotype.Service;

@Service
public interface ActivityLogService {

    public void save(ActivityLog a);
}
