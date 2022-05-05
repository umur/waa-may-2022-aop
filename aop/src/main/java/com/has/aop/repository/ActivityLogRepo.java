package com.has.aop.repository;

import com.has.aop.entity.ActivityLog;
import com.has.aop.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ActivityLogRepo extends CrudRepository<ActivityLog,Integer> {
}
