package com.abdelkarim.OnlineCourses.DAO;

import com.abdelkarim.OnlineCourses.models.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<StudentEntity,Integer>
{

}
