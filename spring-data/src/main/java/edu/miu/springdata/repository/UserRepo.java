package edu.miu.springdata.repository;

import edu.miu.springdata.entity.User;
import edu.miu.springdata.entity.unidirectional.UserUni;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
