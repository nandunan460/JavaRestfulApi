package com.Assignment.ApiRest;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.Assignment.ApiRest.controller.EmployeeController;
import com.Assignment.ApiRest.service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
	@InjectMocks
	private EmployeeController controller;
	@Mock
	private EmployeeService service;
	
}
