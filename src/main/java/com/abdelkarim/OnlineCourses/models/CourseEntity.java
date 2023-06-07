package com.abdelkarim.OnlineCourses.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue
	private Integer id;
	
	
	@Column(name="ref")
	private String ref;
		
	
	@Column(name="categorie")
	private String categorie;
	
	
	@Column(name="description")
	private String description;
	

}
