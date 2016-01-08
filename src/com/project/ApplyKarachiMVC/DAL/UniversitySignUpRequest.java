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
import com.project.ApplyKarachiMVC.BO.University;

/**
 *
 * @author saad
 */
public class UniversitySignUpRequest {

  public void SignUpRequestUniversity(University university) {
         
         FileWriter universityFileWriter = null;
         FileWriter universityFileWriter1 = null;
         try {
             universityFileWriter = new FileWriter("university.txt", true);
             universityFileWriter1 = new FileWriter("universityLogin.txt", true);
             PrintWriter universityFileBuffWriter = new PrintWriter(universityFileWriter);
             PrintWriter universityFileBuffWriter1 = new PrintWriter(universityFileWriter1);
             universityFileBuffWriter.println(university.getUsername());
             universityFileBuffWriter.println(university.getName());
             universityFileBuffWriter.println(university.getPassword());
             universityFileBuffWriter.println(university.getConfirmPassword());
             universityFileBuffWriter.println(university.getUniversityProfile());
             
             universityFileBuffWriter1.println(university.getName());
             universityFileBuffWriter1.println(university.getPassword());

         } catch (IOException ex) {
             Logger.getLogger(UniversitySignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 universityFileWriter.close();
                 universityFileWriter1.close();
             } catch (IOException ex) {
                 Logger.getLogger(UniversitySignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }    
}
