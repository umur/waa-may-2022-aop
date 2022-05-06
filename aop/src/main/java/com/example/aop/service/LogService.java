package com.example.aop.service;

import com.example.aop.entity.Activity;
import com.example.aop.repo.LogRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LogService {
    private final LogRepo logRepo;

    public void save(Activity activity) {
        logRepo.save(activity);
    }
}
