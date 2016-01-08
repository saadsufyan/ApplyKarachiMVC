/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.project.ApplyKarachiMVC.BO.Student;

/**
 *
 * @author Administrator
 */
public class StudentSignUpRequest {

   public void SignUpRequestStudent(Student student) {
         
         FileWriter studentFileWriter = null;
         FileWriter studentFileWriter1 = null;
         try {
             studentFileWriter = new FileWriter(student.getUsername() +  ".txt", true);
             studentFileWriter1 = new FileWriter("studentLogin.txt", true);
             PrintWriter studentFileBuffWriter = new PrintWriter(studentFileWriter);
             PrintWriter studentFileBuffWriter1 = new PrintWriter(studentFileWriter1);
             studentFileBuffWriter.println(student.getUsername());
             studentFileBuffWriter.println(student.getFirstName());
             studentFileBuffWriter.println(student.getLastName());
             studentFileBuffWriter.println(student.getPassword());
             studentFileBuffWriter.println(student.getConfirmPassword());
             studentFileBuffWriter.println(student.getStudentId());
             studentFileBuffWriter.println(student.getEmail());
             studentFileBuffWriter.println(student.getGender());
             studentFileBuffWriter.println(student.getMonth());
             studentFileBuffWriter.println(student.getDay());
             studentFileBuffWriter.println(student.getYear());
             studentFileBuffWriter1.println(student.getLastName());
             studentFileBuffWriter1.println(student.getPassword());
             studentFileBuffWriter1.println(student.getFirstName());
             
         } catch (IOException ex) {
             Logger.getLogger(StudentSignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 studentFileWriter.close();
                 studentFileWriter1.close();
             } catch (IOException ex) {
                 Logger.getLogger(StudentSignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }    
}
