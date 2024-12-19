package com.javatech.employeeProject.dao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="emp_id")
	private Long empId;

	 @Column(name="emp_name")
	private String name;

	@Column(name="emp_designation")
	private String position;
	
	@Column(name="emp_status")
	private String status;

	@Column(name="department_id")
	private Long departmentId;
	

	
	
	 @ManyToOne
	    @JoinColumn(name = "department_id",insertable = false, updatable = false)
	   // @JoinColumn(name = "department_id", nullable = false)

	    private Department department;

	    @OneToOne
	    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id", insertable = false, updatable = false)
	    private EmployeeSalaryMapping salaryMapping;


	public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public EmployeeSalaryMapping getSalaryMapping() {
			return salaryMapping;
		}

		public void setSalaryMapping(EmployeeSalaryMapping salaryMapping) {
			this.salaryMapping = salaryMapping;
		}

	public Long getDepartment_id() {
		return departmentId;
	}

	public void setDepartment_id(Long department_id) {
		this.departmentId = department_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Getters and Setters
	

	public String getName() {
		return name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
