package com.abdelkarim.OnlineCourses.DAO;

import com.abdelkarim.OnlineCourses.models.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<AdminEntity,Integer> {


}
