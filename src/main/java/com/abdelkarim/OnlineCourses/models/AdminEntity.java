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
@Table(name="admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity implements Serializable {
	
		/**
	 * 
	 */
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
		
		
	
	

}
