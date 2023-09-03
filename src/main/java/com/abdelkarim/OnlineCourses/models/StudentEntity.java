package com.abdelkarim.OnlineCourses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentEntity implements Serializable{
	
	
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;

	@Column(name="mail")
	private String mail;

	@Column(name="password")
	private String password;

	@ManyToMany(mappedBy = "students")
	private List<CourseEntity> courses;

}
