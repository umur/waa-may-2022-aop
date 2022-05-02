package edu.miu.springdata.repository;

import edu.miu.springdata.entity.bidirectional.joincolumn.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
