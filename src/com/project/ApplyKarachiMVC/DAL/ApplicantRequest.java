/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import com.project.ApplyKarachiMVC.BO.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saad
 */
public class ApplicantRequest {
   public void ApplicantAdmissionRequest(Student student) {
         
         FileWriter studentFileWriter = null;
         try {
             studentFileWriter = new FileWriter(student.getFirstName() + student.getLastName() + ".txt", true);
             PrintWriter studentFileBuffWriter = new PrintWriter(studentFileWriter);
// Total = 9+10+5 = 24 ..*
             studentFileBuffWriter.println(student.getFirstName());
             studentFileBuffWriter.println(student.getLastName());
             studentFileBuffWriter.println(student.getFatherName());
             studentFileBuffWriter.println(student.getAddress());
             studentFileBuffWriter.println(student.getCity());
             studentFileBuffWriter.println(student.getCountry());
             studentFileBuffWriter.println(student.getMobile());
             studentFileBuffWriter.println(student.getStatus());
             studentFileBuffWriter.println(student.getAbout());
// Now educational information
             studentFileBuffWriter.println(student.getSSC());
             studentFileBuffWriter.println(student.getHSC());

             
             studentFileBuffWriter.println(student.getSchool());
             studentFileBuffWriter.println(student.getSchoolPassingYear());
             studentFileBuffWriter.println(student.getMatricMarks());
             studentFileBuffWriter.println(student.getMatricMarksTotal());
             studentFileBuffWriter.println(student.getCollege());
             studentFileBuffWriter.println(student.getCollegePassingYear());
             studentFileBuffWriter.println(student.getInterMarks());
             studentFileBuffWriter.println(student.getInterMarksTotal());
            
    // Intended programs
             studentFileBuffWriter.println(student.getPreference1());
             studentFileBuffWriter.println(student.getPreference2());
             studentFileBuffWriter.println(student.getPreference3());
             studentFileBuffWriter.println(student.getSelectedUniversityList());
             studentFileBuffWriter.println(student.getEssay());
             
             
         } catch (IOException ex) {
             Logger.getLogger(ApplicantRequest.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 studentFileWriter.close();
             } catch (IOException ex) {
                 Logger.getLogger(ApplicantRequest.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }      
}
