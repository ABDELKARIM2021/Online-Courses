package com.abdelkarim.OnlineCourses.DAO;

import com.abdelkarim.OnlineCourses.models.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CourseDAO extends JpaRepository<CourseEntity,Integer> {



}
