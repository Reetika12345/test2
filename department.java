package com.javatech.employeeProject.dao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//import java.util.List;

	@Entity
	//@Data this is used to write getter setter
	@Table(name = "departments")
	public class Department {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="department_id")
	    private Long id;

	   @Column(name="department_name")
	    private String name;

	  
	 // Getters and Setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


	    
	}
