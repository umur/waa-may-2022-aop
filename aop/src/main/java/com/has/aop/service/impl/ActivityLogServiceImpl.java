package com.has.aop.service.impl;

import com.has.aop.dto.CategoryDto;
import com.has.aop.entity.ActivityLog;
import com.has.aop.entity.Category;
import com.has.aop.repository.ActivityLogRepo;
import com.has.aop.repository.CategoryRepo;
import com.has.aop.service.ActivityLogService;
import com.has.aop.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ActivityLogServiceImpl implements ActivityLogService {
    private final ActivityLogRepo activityLogRepo;

    @Override
    public void save(ActivityLog p) {
        activityLogRepo.save(p);
    }

    @Override
    public void delete(int id) {
        activityLogRepo.deleteById(id);
    }

    @Override
    public ActivityLog getById(int id) {

        var item = activityLogRepo.findById(id).get();


        return item;
    }

    @Override
    public List<ActivityLog> getAll() {
        var result = new ArrayList<ActivityLog>();
        activityLogRepo.findAll().forEach(result::add);
        return  result;
    }
}
