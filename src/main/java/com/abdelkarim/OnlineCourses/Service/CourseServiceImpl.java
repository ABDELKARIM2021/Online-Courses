package com.abdelkarim.OnlineCourses.Service;

import com.abdelkarim.OnlineCourses.DAO.CourseDAO;
import com.abdelkarim.OnlineCourses.DTO.CourseDTO;
import com.abdelkarim.OnlineCourses.DTO.ResponseCourseDTO;
import com.abdelkarim.OnlineCourses.models.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CourseServiceImpl implements CourseService{


    private static final String FILE_PATH = "C:/Users/Abdelkarim/Documents/projects/image/";
    private static final String VIDEO_PATH = "C:/Users/Abdelkarim/Documents/projects/video/";



    @Autowired
    private CourseDAO courseDAO;





    @Override
    public CourseDTO findByID(Integer id) {

        Optional<CourseEntity> courseEntity=courseDAO.findById(id);
        return null;
    }

    @Override
    public CourseDTO findByRef(String ref) {
        return null;
    }

    @Override
    public CourseDTO findByCategorie(String Categorie) {
        return null;
    }



    @Override
    public String save(CourseDTO courseDTO) throws IOException {
        String filePath=FILE_PATH+courseDTO.getFile().getOriginalFilename();
        String videoPath=VIDEO_PATH+courseDTO.getVideo().getOriginalFilename();


        CourseEntity courseEntity=courseDAO.save(CourseEntity.builder()
                .ref(courseDTO.getRef())
                .categorie(courseDTO.getCategorie())
                .description(courseDTO.getDescription())
                .fileName(courseDTO.getFile().getOriginalFilename())
                .fileURL(filePath)
                .videoName(courseDTO.getVideo().getOriginalFilename())
                .videoURL(videoPath)
                .build());

        courseDTO.getFile().transferTo(new File(filePath));
        courseDTO.getVideo().transferTo(new File(videoPath));

        if (courseDTO != null) {
            return "file uploaded successfully : " + filePath;
        }
        return null;

    }




    @Override
    public CourseDTO update(CourseDTO courseDTO, Integer id) throws RuntimeException {
        return null;
    }


    public List<ResponseCourseDTO> getAllCourses() {
        List<CourseEntity> courseEntities = courseDAO.findAll();
        // Convertir les entités en DTOs
        return courseEntities.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    @Override
    public boolean exists(Integer courseId) {
        return courseDAO.existsById(courseId);

    }

    @Override
    public void delete(Integer courseId) {

    }

    public void deleteCourse(Integer courseId) {
        courseDAO.deleteById(courseId);
    }

    public void updateCourse(Integer courseId, CourseDTO updatedCourseDTO) {
        Optional<CourseEntity> optionalCourse = courseDAO.findById(courseId);

        if (optionalCourse.isPresent()) {
            CourseEntity course = optionalCourse.get();
            course.setRef(updatedCourseDTO.getRef());
            course.setCategorie(updatedCourseDTO.getCategorie());
            course.setDescription(updatedCourseDTO.getDescription());
            course.setId(courseId);

            courseDAO.save(course);
        }
    }


    public ResponseCourseDTO convertToDTO(CourseEntity courseEntity) {
        return ResponseCourseDTO.builder()
                .id(courseEntity.getId())
                .ref(courseEntity.getRef())
                .categorie(courseEntity.getCategorie())
                .description(courseEntity.getDescription())
                .fileURL(courseEntity.getFileURL())
                .videoURL(courseEntity.getVideoURL())
                .build();
    }
}









