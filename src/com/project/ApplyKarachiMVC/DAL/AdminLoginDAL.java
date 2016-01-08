/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.project.ApplyKarachiMVC.BO.Admin;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class AdminLoginDAL {
       public void verifyLogin(Admin admin)  {
           
        FileReader adminFileReader = null;
        try {
            adminFileReader = new FileReader("adminLogin.txt");
            BufferedReader adminFileBuffReader = new BufferedReader(adminFileReader);
            Integer adminCount = Integer.parseInt(adminFileBuffReader.readLine());
            for(int i=0; i<adminCount; i++){
                String loginname = adminFileBuffReader.readLine();
                String loginpwd = adminFileBuffReader.readLine();
                String username = adminFileBuffReader.readLine();
                
                if(loginname.equals(admin.getUsername()) && loginpwd.equals(admin.getPassword()))
                {
                    
                    admin.setName(username);
                   
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
