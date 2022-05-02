package com.example.datademo.repository;

import com.example.datademo.entity.ActivityLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends CrudRepository<ActivityLog,Integer> {
}
