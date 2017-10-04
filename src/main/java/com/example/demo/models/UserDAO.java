package com.example.demo.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserDAO extends CrudRepository<User,Integer>{

    public List<User> findAll();
    public User findById(int id);
    public User findByName(String name);
    public User findBySalary(Double salary);
}
