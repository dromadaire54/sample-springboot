package com.sample.springboot;

import org.springframework.data.repository.CrudRepository;

import com.sample.springboot.Person;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Integer> {

}