package com.pagination.method.jpa.entityes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_details")
public class Student {
	
	@Id
//	@GeneratedValue  
	private int rollNo ;
	private String stuName ;
	private String stuAddress ;
	private String phone ;
	
	
	
	

}
