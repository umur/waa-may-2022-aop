package edu.miu.springaop.repository;

import edu.miu.springaop.entity.ActivityLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepo extends CrudRepository<ActivityLog, Integer> {

}
