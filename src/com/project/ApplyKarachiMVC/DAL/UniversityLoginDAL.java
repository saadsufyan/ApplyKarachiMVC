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
import com.project.ApplyKarachiMVC.BO.University;


/**
 *
 * @author Administrator
 */
public class UniversityLoginDAL {
       public void verifyLogin(University university)  {
           
        FileReader universityFileReader = null;
        try {
            universityFileReader = new FileReader("UniversityLogin.txt");
            BufferedReader universityFileBuffReader = new BufferedReader(universityFileReader);
            //Integer adminCount = Integer.parseInt(universityFileBuffReader.readLine());
            
          //  System.out.print(adminCount);
            String line="a";
            while((line = universityFileBuffReader.readLine()) != null){
                String loginname = line;
                String loginpwd = universityFileBuffReader.readLine();
                String username = universityFileBuffReader.readLine();
                if(loginname.equals(university.getName()) && loginpwd.equals(university.getPassword()))
                {
                    university.setName(username);
                   
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
