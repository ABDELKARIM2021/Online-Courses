package com.abdelkarim.OnlineCourses.DTO;


public class AdminLoginResponseDTO {
    // Attributs success et message
    private boolean success;
    private String message;

    // Getters et setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
