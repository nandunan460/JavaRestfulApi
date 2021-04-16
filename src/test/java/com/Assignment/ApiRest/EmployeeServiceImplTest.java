package com.Assignment.ApiRest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Matchers.any;
import com.Assignment.ApiRest.model.Employee;
import com.Assignment.ApiRest.repository.EmployeeRepository;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;

import com.Assignment.ApiRest.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {
	@InjectMocks
	private EmployeeServiceImpl serviceimpl;
	@Mock
	private EmployeeRepository repository;
	private Employee employee;
	@Test
	public void saveEmployeeTest(){
		when(((OngoingStubbing) repository.save(any())).thenReturn(new Employee()));
		serviceimpl.saveEmployee(employee);
	}
	@Before
	public void setUp(){
		
		employee = new Employee();
		employee.setId(9);
		employee.setEmail("nandini@devathon.com");
	}
	@Test
	public void getAllEmployeesTest() {
		
	when(((OngoingStubbing) repository.save(any())).thenReturn(new ArrayList<>()));
	serviceimpl.getAllEmployees();
	}
	@Test
	public void deleteEmployeeByIdTest() {
		serviceimpl.deleteEmployeeById(1);
	}
}
