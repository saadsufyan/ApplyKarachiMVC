/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import com.project.ApplyKarachiMVC.BO.Counselor;
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
public class StudentReplyDAL {
    public void ReplyStudent(Student student){
    FileWriter studentFileWriter = null;
         try {
             studentFileWriter = new FileWriter("reply.txt", true);
             PrintWriter studentFileBuffWriter = new PrintWriter(studentFileWriter);

             studentFileBuffWriter.println(student.getReply());
             
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
