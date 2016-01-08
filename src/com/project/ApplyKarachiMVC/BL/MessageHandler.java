/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.DAL.AskDAL;
import com.project.ApplyKarachiMVC.DAL.MessageDAL;
/**
 *
 * @author Taha
 */
public class MessageHandler {
        public void studentMessageHandler(Student student){
    
    MessageDAL messagedao= new MessageDAL();
    messagedao.MessageStudent(student);
    }

}
