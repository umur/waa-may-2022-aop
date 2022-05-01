package com.has.aop.service;


import com.has.aop.dto.CategoryDto;
import com.has.aop.entity.ActivityLog;
import com.has.aop.entity.Category;

import java.util.List;

public interface ActivityLogService {
    void save(ActivityLog p);

    void delete(int id);

    ActivityLog getById(int id);

    List<ActivityLog> getAll();
}
