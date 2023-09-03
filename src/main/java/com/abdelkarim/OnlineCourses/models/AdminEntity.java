package com.abdelkarim.OnlineCourses.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity implements Serializable {
	
		/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 1L;


		@Id
		@GeneratedValue
		private Integer id;

		@Column(name="ref")
		private String ref;

		@Column(name="nom")
		private String nom;

		@Column(name="prenom")
		private String prenom;

		@Column(name="mail")
		private String mail;

		@Column(name="password")
		private String password;

		@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		private List<CourseEntity> courses;
		
		
	
	

}
