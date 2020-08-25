package com.cloudera.demo;


import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cloudera.demo.service.ComputerService;

import static org.mockito.Mockito.verify;

import java.util.Collections;
@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureMockMvc
public class ComputerControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ComputerService computerService;
	
	@Test
	void contextLoads() throws Exception {
		Mockito.when(computerService.getComputers()).thenReturn(Collections.emptyList());
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/computers").accept(MediaType.APPLICATION_JSON)).andReturn();
		System.out.print(mvcResult.getResponse());
		verify(computerService).getComputers();
	}

}
