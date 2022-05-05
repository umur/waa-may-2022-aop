package com.example.demo.repo;

import com.example.demo.entity.ActivityLog;
import org.springframework.data.repository.CrudRepository;

public interface ActivityLogRepo extends CrudRepository<ActivityLog,Integer> {
}
