/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

//import com.project.ApplyKarachiMVC.BO.Admin;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.project.ApplyKarachiMVC.BO.Counselor;
import com.project.ApplyKarachiMVC.BO.Student;
//import com.project.ApplyKarachiMVC.BO.Student;
//import com.project.ApplyKarachiMVC.BO.University;

/**
 *
 * @author Administrator
 */
public class CounselorLoginDAL {
              public void verifyLogin(Counselor counselor)  {
           
        FileReader counselorFileReader = null;
        try {
            counselorFileReader = new FileReader("counselorLogin.txt");
            String line = "a";
            BufferedReader counselorFileBuffReader = new BufferedReader(counselorFileReader);
          //  Integer adminCount = Integer.parseInt(studentFileBuffReader.readLine());
            while((line = counselorFileBuffReader.readLine()) != null){
          
                String loginname = line;
                String loginpwd = counselorFileBuffReader.readLine();
                String username =counselorFileBuffReader.readLine();

                if(loginname.equals(counselor.getUsername()) && loginpwd.equals(counselor.getPassword()))
                {
                    counselor.setName(username);
                   
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
