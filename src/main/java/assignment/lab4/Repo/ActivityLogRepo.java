package assignment.lab4.Repo;

import assignment.lab4.domain.ActivityLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ActivityLogRepo extends CrudRepository<ActivityLog,Integer> {
}
