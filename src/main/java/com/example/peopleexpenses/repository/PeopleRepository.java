package com.example.peopleexpenses.repository;

import com.example.peopleexpenses.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends CrudRepository <People, Integer>{

    List<People> findByNameNotEmpty();


}
