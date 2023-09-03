package com.abdelkarim.OnlineCourses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="courseone")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseEntity implements Serializable {


	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Integer id;

	@Column()
	private String ref;

	@Column()
	private String categorie;

	@Column()
	private String description;


	@Column()
	private String fileName;

	@Column()
	private String fileURL;

	@Column
	private String videoName;

	@Column()
	private String videoURL;

	@ManyToOne
	private AdminEntity admin;

	@ManyToMany
	private List<StudentEntity> students;

}
