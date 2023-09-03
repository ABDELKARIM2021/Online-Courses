package com.abdelkarim.OnlineCourses.Service;

import com.abdelkarim.OnlineCourses.DTO.CourseDTO;
import com.abdelkarim.OnlineCourses.DTO.ResponseCourseDTO;
import com.abdelkarim.OnlineCourses.models.CourseEntity;

import java.io.IOException;
import java.util.List;

public interface CourseService {

     CourseDTO findByID(Integer id);


     CourseDTO findByRef(String ref);

     void deleteCourse(Integer courseId);
      CourseDTO findByCategorie(String Categorie);
     void updateCourse(Integer courseId, CourseDTO updatedCourseDTO);


     String save(CourseDTO courseDTO) throws IOException ;


     public CourseDTO update(CourseDTO courseDTO,Integer id) throws RuntimeException;


     public List<ResponseCourseDTO> getAllCourses();

    boolean exists(Integer courseId);

    void delete(Integer courseId);
}
