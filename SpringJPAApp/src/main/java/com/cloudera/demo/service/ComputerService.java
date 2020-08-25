package com.cloudera.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cloudera.demo.domain.Computer;
import com.cloudera.demo.repo.ComputerRepo;

@Component
public class ComputerService {
	
	@Autowired
	ComputerRepo computerRepo;
	
	public List<Computer> getComputers()
	{
		return computerRepo.findAll();
	}
	
	public Computer addComputers(Computer computer)
	{
		return computerRepo.save(computer);
	}
	
	public String deleteComputer(int serialNo)
	{
		computerRepo.deleteById(serialNo);
		return "deleted";
	}
	
	public Optional<Computer> getComputer(int serialNo)
	{
		return computerRepo.findById(serialNo);
	}	

}
