/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.DAL.AskDAL;

/**
 *
 * @author Saad
 */
public class AskHandler {
    public void studentAskHandler(Student student){
    
    AskDAL askdao= new AskDAL();
    askdao.AskStudent(student);
    }
    
}
