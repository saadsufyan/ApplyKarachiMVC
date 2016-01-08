/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.BO.Counselor;
import com.project.ApplyKarachiMVC.DAL.CounselorReplyDAL;
import com.project.ApplyKarachiMVC.DAL.StudentReplyDAL;

/**
 *
 * @author Saad
 */
public class ReplyHandler {
 
    public void studentReplyHandler(Student student){
    
    StudentReplyDAL messagedao= new StudentReplyDAL();
    messagedao.ReplyStudent(student);
    }
   public void counselorReplyHandler(Counselor counselor){
    
    CounselorReplyDAL replydao= new CounselorReplyDAL();
    replydao.ReplyCounselor(counselor);
    }
}
