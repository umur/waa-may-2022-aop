package com.example.aopass03.repository;

import com.example.aopass03.domain.ActivityLog;
import org.springframework.data.repository.CrudRepository;

public interface ActivityLogRepo extends CrudRepository<ActivityLog, Integer> {
}
