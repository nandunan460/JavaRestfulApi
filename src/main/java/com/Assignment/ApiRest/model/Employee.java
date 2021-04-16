package com.Assignment.ApiRest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	@Column(name = "empId")
	private String empId;
	@Column(name = "startDate")
	private String startDate;
	@Column(name = "designation")
	private String designation;
	@Column(name = "dept")
	private String dept;
	@Column(name = "endDate")
	private String endDate;
	@Column(name = "dob")
	private String dob;
	@Column(name = "status")
	private String status;
	@Column(name = "manager")
	private String manager;
	@Column(name = "gender")
	private String gender;
	@Column(name = "bloodGroup")
	private String bloodGroup;
	@Column(name = "address")
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return dept;
	}
	public void setDepartment(String dept) {
		this.dept = dept;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate =endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status =status;
	}
	public String getDob() {
		return status;
	}
	public void setDob(String dob) {
		this.dob =dob;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager =manager;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender =gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup =bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address =address;
	}
}
