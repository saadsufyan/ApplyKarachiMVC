/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.DAL.UniversitySelectDAL;

/**
 *
 * @author Saad
 */
public class SelectUniversityHandler {
     public boolean studentSelectUniversityHandler(Student student){
    
    UniversitySelectDAL universityselectDAL= new UniversitySelectDAL();
    universityselectDAL.saveUniversities(student);
    boolean success = universityselectDAL.saveUniversities(student);
    return success;
}   
}