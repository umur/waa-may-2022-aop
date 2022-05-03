package com.example.demo.repository;

import com.example.demo.entity.bidirect.ActivityLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepo extends CrudRepository<ActivityLog,Integer> {

}
