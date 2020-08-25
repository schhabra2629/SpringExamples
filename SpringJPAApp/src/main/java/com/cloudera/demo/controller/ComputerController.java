package com.cloudera.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudera.demo.domain.Computer;
import com.cloudera.demo.service.ComputerService;

@RestController
public class ComputerController {
	
	@Autowired
	ComputerService computerService;
	
	@GetMapping("/computers")
	public List<Computer> getComputers(Computer computer)
	{
		return computerService.getComputers();
	}
	
	@PostMapping("/computer")
	public Computer addComputers(Computer computer)
	{
		return computerService.addComputers(computer);
	}
	
	@DeleteMapping("/computer/{serialNo}")
	public String deleteComputer(@PathVariable("serialNo") int serialNo)
	{
		computerService.deleteComputer(serialNo);
		return "deleted";
	}
	
	@RequestMapping("/computer/{serialNo}")
	public Optional<Computer> getComputer(@PathVariable("serialNo") int serialNo)
	{
		return computerService.getComputer(serialNo);
	}
	

}
