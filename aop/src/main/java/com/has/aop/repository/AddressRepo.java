package com.has.aop.repository;

import com.has.aop.entity.Address;
import com.has.aop.entity.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address,Integer> {

}
