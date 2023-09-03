package com.abdelkarim.OnlineCourses.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseCourseDTO {
    private Integer id;
    private String ref;
    private String categorie;
    private String description;
    private String fileName;
    private String fileURL;
    private String videoName;
    private String videoURL;
}
