package com.abdelkarim.OnlineCourses.Service;


import com.abdelkarim.OnlineCourses.DAO.StudentDAO;
import com.abdelkarim.OnlineCourses.DTO.StudentRequestDTO;
import com.abdelkarim.OnlineCourses.DTO.StudentResponseDTO;
import com.abdelkarim.OnlineCourses.models.StudentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private ModelMapper modelMapper;
    public StudentResponseDTO save(StudentRequestDTO studentRequestDTO){
        StudentEntity studentEntity=modelMapper.map(studentRequestDTO, StudentEntity.class);
        StudentEntity studentEntity1=studentDAO.save(studentEntity);

            return modelMapper.map(studentEntity1,StudentResponseDTO.class);
    }
}
