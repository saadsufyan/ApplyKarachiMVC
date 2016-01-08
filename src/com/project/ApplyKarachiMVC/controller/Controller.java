/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ApplyKarachiMVC.controller;

import com.project.ApplyKarachiMVC.BL.*;
import com.project.ApplyKarachiMVC.BO.*;
import com.project.ApplyKarachiMVC.constants.Constants;
import com.project.ApplyKarachiMVC.translator.Translator;
/**
 *
 * @author Taha
 */
public class Controller {

    public Object[] processRequest(int action, Object[] parameters) {

        Object[] returnObj = null;

        switch (action) {
            case Constants.loginActionAdmin:
                returnObj = verifyLoginAdmin(parameters); break;
               
            case Constants.loginActionStudent:
                returnObj = verifyLoginStudent(parameters);
                break;
            case Constants.loginActionCounselor:
                returnObj = verifyLoginCounselor(parameters);
                break;
            case Constants.loginActionUniversity:
                returnObj = verifyLoginUniversity(parameters);
                break;
            case Constants.signupActionStudent:
                returnObj = confirmSignUpRequest(parameters);
                break;
            case Constants.signupActionCounselor:
                returnObj = confirmSignUpRequest(parameters);
                break;
            case Constants.signupActionUniversity:
                returnObj = confirmSignUpRequestUniversity(parameters);
                break;
            case Constants.applicantAction:
                returnObj = applicantRequest(parameters);
                break;
            case Constants.askAction:
                returnObj = AskStudent(parameters);
                break;
            case Constants.SendMessageAction:
                returnObj = MessageStudent(parameters);
                break;
            case Constants.readASKAction:
                returnObj = readAskStudent(parameters);
                break;
            case Constants.replyStudentAction:
                returnObj = ReplyStudent(parameters);
                break;
            case Constants.replyCounselorAction:
                returnObj = ReplyCounselor(parameters);
                break; 
        }

        return returnObj;
    }

    private Object[] verifyLoginAdmin(Object[] parameters) {
        Object[] returnObj = null;
        Translator adminTranslator = new Translator();
        Admin admin = adminTranslator.loginInfoTranslator(parameters[0], parameters[1]);
        loginHandler loginhandler = new loginHandler();
        loginhandler.verifyLoginAdmin(admin);
        if (admin.getName()!= null && !admin.getName().equals("")) { //for verification success
            returnObj = new Object[1];
            returnObj[0] = admin;
        }

        return returnObj;
    }

    private Object[] verifyLoginStudent(Object[] parameters) {

        Object[] returnObj = null;
        Translator studentTranslator = new Translator();
        Student student = studentTranslator.StudentloginInfoTranslator(parameters[0], parameters[1]);
        loginHandler loginhandler = new loginHandler();
        loginhandler.verifyLoginStudent(student);
        if (student.getName() != null && !student.getName().equals("")) { //for verification success
            returnObj = new Object[1];
            returnObj[0] = student;
        }

        return returnObj;
    }

    private Object[] verifyLoginCounselor(Object[] parameters) {

        Object[] returnObj = null;
        Translator counselorTranslator = new Translator();
        Counselor counselor = counselorTranslator.CounselorloginInfoTranslator(parameters[0], parameters[1]);
        loginHandler loginhandler = new loginHandler();
        loginhandler.verifyLoginCounselor(counselor);
        if (counselor.getName() != null && !counselor.getName().equals("")) { //for verification success
            returnObj = new Object[1];
            returnObj[0] = counselor;
        }

        return returnObj;
    }

    private Object[] verifyLoginUniversity(Object[] parameters) {

        Object[] returnObj = null;
        Translator universityTranslator = new Translator();
        University university = universityTranslator.UniversityloginInfoTranslator(parameters[0], parameters[1]);
        loginHandler loginhandler = new loginHandler();
        loginhandler.verifyLoginUniversity(university);
        if (university.getName() != null && !university.getName().equals("")) { //for verification success
            returnObj = new Object[1];
            returnObj[0] = university;
        }

        return returnObj;
    }

    private Object[] confirmSignUpRequest(Object[] parameters) {

        Object[] returnObj = null;
        String accountype = (String) parameters[10];

        Translator translator = new Translator();
        signupHandler signuphandler = new signupHandler();

        if (accountype.equals("Student")) {
            //System.out.println("Student inside Controller ");
            Student student = translator.processSignUpStudent(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5], parameters[6], parameters[7], parameters[8], parameters[9]);
            signuphandler.signupStudentHandler(student);
            returnObj = new Object[1];
            returnObj[0] = student;
            return returnObj;
        } else if (accountype.equals("Counselor")) {
            Counselor counselor = translator.processSignUpCounselor(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5], parameters[6], parameters[7], parameters[8], parameters[9], parameters[10]);
            signuphandler.signupCounselorHandler(counselor);
            returnObj = new Object[1];
            returnObj[0] = counselor;
            return returnObj;
        } 
        return returnObj;
    }
    private Object[] confirmSignUpRequestUniversity(Object[] parameters){
    
        Object[] returnObj = null;
        Translator translator = new Translator();
        signupHandler signuphandler = new signupHandler();
        University university = translator.processSignUpUniversity(parameters[0], parameters[1], parameters[2], parameters[3],parameters[4]);
        signuphandler.signupUniversityHandler(university);
        returnObj = new Object[1];
        returnObj[0] = university;
        return returnObj;
    }

    private Object[] applicantRequest(Object[] parameters) {

        Object[] returnObj = null;
        Translator translator = new Translator();
        ApplicantHandler applicanthandler = new ApplicantHandler();
        Student student = translator.processSubmitStudentForm(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4], parameters[5], parameters[6], parameters[7], parameters[8], parameters[9], parameters[10], parameters[11], parameters[12], parameters[13], parameters[14],parameters[15],parameters[16],parameters[17],parameters[18],parameters[19],parameters[20],parameters[21],parameters[22],parameters[23]);
        System.out.println(parameters[23]);
        applicanthandler.StudentApplyHandler(student);
        returnObj = new Object[1];
        returnObj[0] = student;
        return returnObj;
    }

    private Object[] AskStudent(Object[] parameters){
    
        Object[] returnObj = null;
        Translator translator = new Translator();
        AskHandler askHandler= new AskHandler();
        Student student=translator.Askstudent(parameters[0]);
        askHandler.studentAskHandler(student);
        returnObj =new Object[1];
        returnObj[0]=student;
        return returnObj;
   }
    
    private Object[] MessageStudent(Object[] parameters){
        Object[] returnObj = null;
        Translator translator = new Translator();
        MessageHandler messageHandler= new MessageHandler();
        Student student=translator.Messagestudent(parameters[0]);
        messageHandler.studentMessageHandler(student);
        returnObj =new Object[1];
        returnObj[0]=student;
        return returnObj;
    }
    
    private Object[] ReplyStudent(Object[] parameters){
        Object[] returnObj = null;
        Translator translator = new Translator();
        ReplyHandler replyHandler= new ReplyHandler();
        Student student=translator.Replystudent(parameters[0]);
        replyHandler.studentReplyHandler(student);
        returnObj =new Object[1];
        returnObj[0]=student;
        return returnObj;
    }
    private Object[] ReplyCounselor(Object[] parameters){
        Object[] returnObj = null;
        Translator translator = new Translator();
        ReplyHandler replyHandler= new ReplyHandler();
        Counselor counselor=translator.Replycounselor(parameters[0]);
        replyHandler.counselorReplyHandler(counselor);
        returnObj =new Object[1];
        returnObj[0]=counselor;
        return returnObj;
    }    
    private Object[] readAskStudent(Object[] parameters) {
        Object[] returnObj = null;
        Translator translator = new Translator();
        ReadASKHandler readASKHandler= new ReadASKHandler();
        Student student=translator.ReadASKstudent(parameters[0]);
        readASKHandler.ReadAsk(student);
        returnObj =new Object[1];
        returnObj[0]=student;
        return returnObj;    
    }
    /*
    private Object[] selectUniversitiesStudent(Object[] parameters){
        Object[] returnObj =null;
        Translator translator = new Translator();
        SelectUniversityHandler studentSelectUniversityHandler= new SelectUniversityHandler();
        SelectedUniversities selectedUniversities=translator.SelectUniversity(parameters[0]);
        SelectUniversityHandler.studentSelectUniversityHandler(student);
        returnObj = new Object[1];
        return[0]=student;
        return returnObj;
        
        
    
    }*/

    private Object[] selectUniversitiesStudent(Object[] parameters){
    
        Object[] returnObj = null;
        SelectUniversityHandler studentSelectUniversityHandler= new SelectUniversityHandler();
        Student student = (Student)parameters[0];
        boolean success = studentSelectUniversityHandler.studentSelectUniversityHandler(student);
        if(success){
        
            returnObj = new Object[1];
            returnObj[0] = student;
        }
        return returnObj;
    }    

}
