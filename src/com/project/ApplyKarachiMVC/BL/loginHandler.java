/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Admin;
import com.project.ApplyKarachiMVC.BO.Counselor;
import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.BO.University;
import com.project.ApplyKarachiMVC.DAL.AdminLoginDAL;
import com.project.ApplyKarachiMVC.DAL.CounselorLoginDAL;
import com.project.ApplyKarachiMVC.DAL.StudentLoginDAL;
import com.project.ApplyKarachiMVC.DAL.UniversityLoginDAL;

/**
 *
 * @author Administrator
 */
public class loginHandler {
    public void verifyLoginAdmin(Admin admin) {
       
        AdminLoginDAL adminloginDAL = new AdminLoginDAL();
        adminloginDAL.verifyLogin(admin);
    
    }   
    public void verifyLoginStudent(Student student) {
       
        StudentLoginDAL studentloginDAL = new StudentLoginDAL();
        studentloginDAL.verifyLogin(student);
    
    }
    public void verifyLoginCounselor(Counselor counselor) {
       
        CounselorLoginDAL counselorloginDAL = new CounselorLoginDAL();
        counselorloginDAL.verifyLogin(counselor);
    
    }
    public void verifyLoginUniversity(University university) {
       
        UniversityLoginDAL universityloginDAL = new UniversityLoginDAL();
        universityloginDAL.verifyLogin(university);
    
    }    
}
