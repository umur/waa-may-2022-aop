package edu.miu.springaop.repository;

import edu.miu.springaop.entity.User;
import edu.miu.springaop.entity.unidirectional.UserUni;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
