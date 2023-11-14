package com.vuppalademo.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vuppalademo.DMS.Models.Dog;

/*
 * @author-- Lalith Vuppala
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{	

	List<Dog> findByName(String name);

	
	


}
