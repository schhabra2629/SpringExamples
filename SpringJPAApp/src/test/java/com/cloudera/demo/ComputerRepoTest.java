package com.cloudera.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cloudera.demo.domain.Computer;
import com.cloudera.demo.repo.ComputerRepo;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
@DataJpaTest
class ComputerRepoTest {
	
	@Autowired
	ComputerRepo computerRepo;
	
	@Autowired
	TestEntityManager entityManager;

	@Test
	void testSaveComputer() throws Exception {
		Computer computer=new Computer();
		computer.setBrand("Lenevo");
		computer.setSerialNo(32);
		computer.setProcessor("Intel");
		
		Computer saved=entityManager.persist(computer);
		Optional<Computer> fromDB=computerRepo.findById(computer.getSerialNo());
		assertThat(saved).isEqualTo(fromDB.get());
	}

}
