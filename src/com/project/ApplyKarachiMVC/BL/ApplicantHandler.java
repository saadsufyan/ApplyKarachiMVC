/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.DAL.ApplicantRequest;
import com.project.ApplyKarachiMVC.DAL.StudentSignUpRequest;

/**
 *
 * @author Taha
 */
public class ApplicantHandler {
 
        public void StudentApplyHandler(Student student) {
        ApplicantRequest applicantdao = new ApplicantRequest();
        applicantdao.ApplicantAdmissionRequest(student);
    }
}
