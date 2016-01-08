/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.project.ApplyKarachiMVC.BO.Student;

/**
 *
 * @author Administrator
 */
public class StudentLoginDAL {
       public void verifyLogin(Student student)  {
           
        FileReader studentFileReader = null;
        try {
            studentFileReader = new FileReader("studentLogin.txt");
            String line = "a";
            BufferedReader studentFileBuffReader = new BufferedReader(studentFileReader);
          //  Integer adminCount = Integer.parseInt(studentFileBuffReader.readLine());
            while((line = studentFileBuffReader.readLine()) != null){
          
                String loginname = line;
                String loginpwd = studentFileBuffReader.readLine();
                String username = studentFileBuffReader.readLine();
                
                if(loginname.equals(student.getUsername()) && loginpwd.equals(student.getPassword()))
                {
                    student.setName(username);
                   
                }
       }
                
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
            ex.printStackTrace();
        } 
        catch (Exception ex) {
            System.err.println("Exception occured: LoginDAL::verifyLogin !");
            ex.printStackTrace();
        }
      
       }       
}
