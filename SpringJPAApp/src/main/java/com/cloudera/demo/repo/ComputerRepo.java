package com.cloudera.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudera.demo.domain.Computer;


public interface ComputerRepo extends JpaRepository<Computer, Integer>{
	
	
}
