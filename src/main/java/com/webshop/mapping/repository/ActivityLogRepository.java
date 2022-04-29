package com.webshop.mapping.repository;

import com.webshop.mapping.domain.ActivityLog;
import org.springframework.data.repository.CrudRepository;

public interface ActivityLogRepository extends CrudRepository<ActivityLog, Long> {
}
