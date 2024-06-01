package net.javaguides.spring.boot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;

	// Many employees has one company address
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	public EmployeeEntity(int empId, String empName, AddressEntity address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public EmployeeEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Employee []";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
