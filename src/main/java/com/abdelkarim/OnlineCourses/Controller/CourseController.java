package com.abdelkarim.OnlineCourses.Controller;

import ch.qos.logback.core.model.Model;
import com.abdelkarim.OnlineCourses.DTO.CourseDTO;
import com.abdelkarim.OnlineCourses.DTO.ResponseCourseDTO;
import com.abdelkarim.OnlineCourses.Service.CourseService;


import com.abdelkarim.OnlineCourses.models.CourseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("course")
@CrossOrigin
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("save")
    public String saveCourse(@ModelAttribute  CourseDTO courseDTO,
                             @RequestParam("file") MultipartFile file,
                             @RequestParam("video")  MultipartFile video) throws IOException {
        courseDTO.setFile(file);
        courseDTO.setVideo(video);

        courseService.save(courseDTO);

        return "redirect:/Course/list";
    }


    @GetMapping("all")
    public List<ResponseCourseDTO> getAllCourses() {
        return courseService.getAllCourses();
    }



/**
    @GetMapping("{id}/edit")
    public String editCourse(@PathVariable Integer id, Model model) {
        // Récupérer le cours correspondant à l'ID et l'envoyer au modèle
        CourseEntity courseEntity = courseService.getCourseById(id);
        model.addAttribute("course", courseEntity);
        return "edit-course"; // Nom de la vue de modification du cours
    }*/

@DeleteMapping("{courseId}")
public ResponseEntity<String> deleteCourse(@PathVariable Integer courseId) {
    courseService.deleteCourse(courseId);
    return ResponseEntity.ok("Le cours a été supprimé avec succès.");
}

    @PutMapping("{courseId}")
    public ResponseEntity<String> updateCourse(@PathVariable Integer courseId, @RequestBody CourseDTO updatedCourseDTO) {
        courseService.updateCourse(courseId, updatedCourseDTO);
        return ResponseEntity.ok("Le cours a été mis à jour avec succès.");
    }

}




