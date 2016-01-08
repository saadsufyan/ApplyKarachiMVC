/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.translator;

import com.project.ApplyKarachiMVC.BO.Admin;
import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.BO.Counselor;
import com.project.ApplyKarachiMVC.BO.SelectedUniversities;
import com.project.ApplyKarachiMVC.BO.University;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Saad
 */
public class Translator {
        
     public Admin loginInfoTranslator(Object adminname, Object password){
         
        Admin admin = new Admin();
        admin.setUsername((String)adminname);
        admin.setPassword((String)password);
        
        return admin;
    }    
        public Student StudentloginInfoTranslator(Object username, Object password){
        Student student = new Student();
        student.setUsername((String)username);
        student.setPassword((String)password);
        
        return student;
    }
        public Counselor CounselorloginInfoTranslator(Object username, Object password){
        Counselor counselor = new Counselor();
        counselor.setUsername((String)username);
        counselor.setPassword((String)password);
        
        return counselor;
    }
        public University UniversityloginInfoTranslator(Object username, Object password){
        University university = new University();
        university.setName((String)username);
        university.setPassword((String)password);
        
        return university;
    }  
      public Student processSignUpStudent(Object firstname,Object lastname, Object username,Object email, Object studentpassword, Object studentConfirmpassword, Object studentmonth, Object studentgender, Object day, Object year) {
          
        Student student = new Student();
        student.setUsername((String)firstname);
        student.setFirstName((String)lastname);
        student.setLastName((String)username);
        student.setPassword((String)studentpassword);
        student.setconfirmPassword((String)studentConfirmpassword);
        student.setEmail((String) email);
        student.setGender((String) studentgender);
        student.setMonth((String) studentmonth);
        student.setDay((String) day);
        student.setYear((String) year);

        
        return student; 
      }    
      public Counselor processSignUpCounselor(Object counselorusername,Object counselorfirstname, Object counselorlastname, Object counselorpassword,Object counselorConfirmpassword, Object counselorId , Object counseloremail, Object counselorgender, Object counselormonth, Object counselorday, Object counseloryear) {
          
        Counselor counselor = new Counselor();
        counselor.setUsername((String)counselorfirstname);
        counselor.setFirstName((String)counselorlastname);
        counselor.setLastName((String)counselorusername);
        counselor.setPassword((String)counselorpassword);
        counselor.setconfirmPassword((String)counselorConfirmpassword);
        counselor.setCounselorId((String) counselorId);
        counselor.setEmail((String) counseloremail);
        counselor.setGender((String) counselorgender);
        counselor.setMonth((String) counselormonth);
        counselor.setDay((String) counselorday);
        counselor.setYear((String) counseloryear);
        
        return counselor; 
      }   
      public University processSignUpUniversity(Object universityusername,Object loginname,Object universitypassword,Object universityconfirmpassword,Object universityprofile) {
          
        University university = new University();
        university.setUsername((String)universityusername);
        university.setName((String)loginname);
        university.setPassword((String)universitypassword);
        university.setconfirmPassword((String)universityconfirmpassword);
        university.setUniversityProfile((String) universityprofile);
        
        return university; 
      }  
      public Student processSubmitStudentForm(Object studentfirstname, Object studentlastname, Object studentfathername,Object studentaddress, Object studentcity ,Object studentcountry,Object studentmobile,Object status,Object aboutstudent,Object SSC,Object HSC, Object studentschool,Object studentschoolpassingyear, Object studentmatricmarks, Object studentmatricTotalmarks,Object studentcollege, Object studentcollegepassingyear,   Object studentintermarks, Object studentinterTotalmarks, Object preference1,Object preference2,Object preference3, Object selectedUniversityList, /*Object universities,*/Object essay) {
          
        Student student = new Student();
        student.setFirstName((String)studentfirstname);
        student.setLastName((String)studentlastname);
        student.setFatherName((String)studentfathername);
        student.setAddress((String)studentaddress);
        student.setCity((String)studentcity);
        student.setCountry((String)studentcountry);
        student.setMobile((String)studentmobile);
        student.setStatus((String)status);        
        student.setAbout((String)aboutstudent);
        student.setSSC((String)SSC);
        student.setHSC((String)HSC);
        student.setSchool((String)studentschool);
        student.setSchoolPassingYear((String)studentschoolpassingyear);
        student.setMatricMarks((String)studentmatricmarks);  
        student.setMatricMarksTotal((String)studentmatricTotalmarks);
        student.setCollege((String)studentcollege);
        student.setCollegePassingYear((String)studentcollegepassingyear);
        student.setInterMarks((String)studentintermarks);
        student.setInterMarksTotal((String)studentinterTotalmarks);    
        student.setPreference1((String)preference1);
        student.setPreference2((String)preference2);
        student.setPreference3((String)preference3);
        List<String> temp = new ArrayList();
        temp.add((String)selectedUniversityList);
        student.setSelectedUniversityList(temp);
        //student.setUniversities(List<SelectedUniversities>universities);
        student.setEssay((String)essay);

        
        return student; 
      }  
      public Student Askstudent(Object ask){
      
      Student student = new Student();
      student.setAsk((String)ask);      
      return student;
      }
      
      
      public Student Messagestudent(Object msg){
      
      Student student = new Student();
      student.setSendMsg((String)msg);      
      return student;
      }
      
      public Student Replystudent(Object reply){
      
      Student student = new Student();
      student.setReply((String)reply);      
      return student;
      }   
      public Counselor Replycounselor(Object reply){
      
      Counselor counselor = new Counselor();
      counselor.setReply((String)reply);      
      return counselor;
      }       
      public Student ReadASKstudent(Object readAsk){
      
      Student student = new Student();
      student.setreadAsk((String)readAsk);      
      return student;
      }   
      public SelectedUniversities SelectUniversity(Object ned,Object ssuet,Object nust,Object fast,Object suffa,Object indus,Object iqra,Object bahria,Object  cbm,Object szabist,Object  maju,Object  ku,Object iba,Object dow,Object greenwich,Object smdc,Object aghakhan,Object fuuast,Object kanupp,Object preston,Object indusvalley,Object hamdard,Object biztek,Object iiee,Object dawood,Object ziauddin,Object baqai,Object ksa,Object jinnahwomen,Object usman,Object kasbit,Object ksbl,Object textileInstitute,Object paf,Object smi,Object newport,Object che){
      
      SelectedUniversities student = new SelectedUniversities();
      student.setNed((String)ned);
      student.setSSUET((String)ssuet);
      student.setNust((String)nust);
      student.setFast((String)fast);
      student.setSuffa((String)suffa);
      student.setIndus((String)indus);
      student.setIqra((String)iqra);
      student.setBahria((String)bahria);
      student.setCBM((String)cbm);
      student.setSzabist((String)szabist);
      student.setMaju((String)maju);
      student.setKU((String)ku);
      student.setIBA((String)iba);
      student.setDOW((String)dow);
      student.setGreenwich((String)greenwich);
      student.setSMDC((String)smdc);
      student.setAghakhan((String)aghakhan);
      student.setFUUAST((String)fuuast);
      student.setKANUPP((String)kanupp);
      student.setPreston((String)preston);
      student.setIndusValley((String)indusvalley);
      student.setHamdard((String)hamdard);
      student.setBIZTEK((String)biztek);
      student.setIIEE((String)iiee);
      student.setDawood((String)dawood);
      student.setZiaUddin((String)ziauddin);
      student.setBaqai((String)baqai);
      student.setKSA((String)ksa);
      student.setJinnahWomen((String)jinnahwomen);
      student.setUsman((String)usman);
      student.setKAZBIT((String)kasbit);
      student.setKSBL((String)ksbl);
      student.setTextileInstitute((String)textileInstitute);
      student.setPAF((String)paf);
      student.setSMI((String)smi);
      student.setNewPort((String)newport);
      student.setCHE((String)che);
      return student;    
      }
}        
