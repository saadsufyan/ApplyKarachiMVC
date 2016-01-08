/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Counselor;
import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.BO.University;
import com.project.ApplyKarachiMVC.DAL.CounselorSignUpRequest;
import com.project.ApplyKarachiMVC.DAL.StudentSignUpRequest;
import com.project.ApplyKarachiMVC.DAL.UniversitySignUpRequest;

/**
 *
 * @author Taha
 */
public class signupHandler {
     
    public void signupStudentHandler(Student student) {
        StudentSignUpRequest studentsignupdao = new StudentSignUpRequest();
        studentsignupdao.SignUpRequestStudent(student);
    }
    public void signupCounselorHandler(Counselor counselor) {
        CounselorSignUpRequest counselorsignupdao = new CounselorSignUpRequest();
        counselorsignupdao.SignUpRequestCounselor(counselor);
    }
    public void signupUniversityHandler(University university) {
        UniversitySignUpRequest universitysignupdao = new UniversitySignUpRequest();
        universitysignupdao.SignUpRequestUniversity(university);
    }    
}
