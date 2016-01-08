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
import com.project.ApplyKarachiMVC.BO.Counselor;

/**
 *
 * @author Administrator
 */
public class CounselorSignUpRequest {
   
  public void SignUpRequestCounselor(Counselor counselor) {
         
         FileWriter counselorFileWriter = null;
         FileWriter counselorFileWriter1 = null;
         try {
             counselorFileWriter = new FileWriter(counselor.getUsername() + ".txt", true);
             counselorFileWriter1 = new FileWriter("counselorLogin.txt", true);
             PrintWriter counselorFileBuffWriter = new PrintWriter(counselorFileWriter);
             PrintWriter counselorFileBuffWriter1 = new PrintWriter(counselorFileWriter1);
            
             counselorFileBuffWriter.println(counselor.getLastName());  //First name    
             
             counselorFileBuffWriter.println(counselor.getUsername());      //lastname  
                   // System.out.println(counselor.getUsername());
             counselorFileBuffWriter.println(counselor.getFirstName());     //username
                    //System.out.println(counselor.getFirstName());
             

             counselorFileBuffWriter.println(counselor.getPassword());
                            //       System.out.println(counselor.getPassword());

             counselorFileBuffWriter.println(counselor.getConfirmPassword());
                          //       System.out.println(counselor.getConfirmPassword());

             counselorFileBuffWriter.println(counselor.getcounselorId());
//                 System.out.println(counselor.getcounselorId());

             counselorFileBuffWriter.println(counselor.getEmail());
  //                            System.out.println(counselor.getEmail());
             counselorFileBuffWriter.println(counselor.getGender());
    //                          System.out.println(counselor.getGender());
             counselorFileBuffWriter.println(counselor.getMonth());
      //                                     System.out.println(counselor.getMonth());
             counselorFileBuffWriter.println(counselor.getDay());
      //                                     System.out.println(counselor.getDay());
             counselorFileBuffWriter.println(counselor.getYear());
// To Counselor logintxt
             counselorFileBuffWriter1.println(counselor.getFirstName());
             counselorFileBuffWriter1.println(counselor.getcounselorId());
             counselorFileBuffWriter1.println(counselor.getLastName());
             
             
             
             
             
             
         } catch (IOException ex) {
             Logger.getLogger(CounselorSignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 counselorFileWriter.close();
                 counselorFileWriter1.close();

             } catch (IOException ex) {
                 Logger.getLogger(CounselorSignUpRequest.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }    
}
