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
 * @author Taha
 */
public class MessageDAL {
     public void MessageStudent(Student student){
    FileWriter studentFileWriter = null;
         try {
             studentFileWriter = new FileWriter("Message.txt", true);
             PrintWriter studentFileBuffWriter = new PrintWriter(studentFileWriter);

             studentFileBuffWriter.println(student.getSendMsg());
                  
         } catch (IOException ex) {
             Logger.getLogger(MessageDAL.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 studentFileWriter.close();
             } catch (IOException ex) {
                 Logger.getLogger(MessageDAL.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
}

