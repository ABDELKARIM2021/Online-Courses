package com.abdelkarim.OnlineCourses.DTO;

import org.springframework.web.multipart.MultipartFile;


public class CourseDTO {


   // @NotNull(message = "La référence ne doit pas être nulle")
    //@NotBlank(message = "La référence ne doit pas être vide")
    private String ref;

    //@NotNull(message = "La catégorie ne doit pas être nulle")
    //@NotBlank(message = "La catégorie ne doit pas être vide")
    private String categorie;
    //@NotNull(message = "La description ne doit pas être nulle")
    //@NotBlank(message = "La description ne doit pas être vide")
    private String description;

    //@NotNull(message = "Le champ 'file' ne peut pas être nul")
    //@NotEmpty(message = "Le champ 'file' ne peut pas être vide")
    private MultipartFile file;

    //@NotNull(message = "Le champ 'video' ne peut pas être nul")
    //@NotEmpty(message = "Le champ 'video' ne peut pas être vide")
    private MultipartFile video;


    public CourseDTO(String ref, String categorie, String description, MultipartFile file, MultipartFile video) {
        this.ref = ref;
        this.categorie = categorie;
        this.description = description;
        this.file = file;
        this.video = video;
    }

    public CourseDTO() {
    }
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    public String getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public MultipartFile getVideo() {
        return video;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public void setVideo(MultipartFile video) {
        this.video = video;
    }



    @Override
    public String toString() {
        return "CourseDTO{" +
                "ref='" + ref + '\'' +
                ", categorie='" + categorie + '\'' +
                ", description='" + description + '\'' +
                ", file=" + file +
                ", video=" + video +
                '}';
    }


}
