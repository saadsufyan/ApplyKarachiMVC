/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BO;
import com.project.ApplyKarachiMVC.UI.submitForm;
import com.project.ApplyKarachiMVC.BO.Student;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Student {
        
    private String name;
    private String username;
    private String firstname;
    private String lastname;
    private String fathername;
    private String password;
    private String confirmpassword;
    private int studentId;
    private String email;
    private String gender;
    private String month;
    private String day;
    private String year;
    private String address;
    private String city;
    private String country;
    private String mobile;
    private String status;
    private String ssc;
    private String hsc;
    private String school;
    private String college;
    private String schoolPassingYear;
    private String collegePassingYear;
    private String matricMarks;
    private String matricMarksTotal;
    private String interMarks;
    private String interMarksTotal;
    private String preference1;
    private String preference2;
    private String preference3;
    private String selecteduniversity;
    private String about;
    private String essay;
    private String sendmsg;
    private String ask;
    private String reply;
    private List<SelectedUniversities> universities;
    
    
    private String readAsk;
    
    private List<String> selecteduniversityList;
    
    public List<SelectedUniversities> getUniversities() {
        return universities;
    }

    public void setUniversities(List<SelectedUniversities> universities) {
        this.universities = universities;
    }
    
    public String getName(){
    
        return name;
    }
    public void setName(String firstname){
    
        this.name= firstname;
    }            
     public String getUsername() {
      
         return username;
    }
    
    public void setUsername(String username) {
        
        this.username=username;
    }
    
    public String getFirstName(){
    
        return firstname;
    }
    public void setFirstName(String firstname){
    
        this.firstname= firstname;
    }    
    public String getLastName(){
    
        return lastname;
    }    
    public void setLastName(String lastname){
    
        this.lastname= lastname;
    }
    public String getFatherName(){
    
        return fathername;
    }    
    public void setFatherName(String fathername){
    
        this.fathername= fathername;
    }
    public void setPassword(String password){
    
        this.password = password;
    }
    public String getPassword(){
        
           return password;
    }
    public void setconfirmPassword(String confirmpassword){
    
        this.confirmpassword = confirmpassword;
    }
    public String getConfirmPassword(){
    
        return confirmpassword;
    }
    public int getStudentId(){
    
        return studentId;
    }
    public void setStudentId(int Id){
    
        this.studentId=Id;
    }
    public String getEmail(){
    
        return email;
    }
    public void setEmail(String e){
    
        this.email=e;
    }
    public String getGender() {
        return gender;
    }
    
    public void setGender (String gender) {
        this.gender = gender;
    }  
    public String getMonth(){
    
        return month;
    }
    public void setMonth(String month){
    
        this.month=month;
    }
    
    public String getDay(){
    
        return day;
    }
    public void setDay(String day){
    
        this.day=day;
    }
    public String getYear(){
        
        return year;
    }
    public void setYear(String year){
    
        this.year=year;
    }
    public String getAddress(){
    
        return address;
    }
    public void setAddress(String address){
    
        this.address=address;
    }
    public String getCity(){
    
        return city;
    }
    public void setCity(String city){
    
        this.city=city;
    }
    public String getCountry(){
    
        return country;
    }
    public void setCountry(String country){
    
        this.country=country;
    }    
    public String getMobile(){
    
        return mobile;
    }
    public void setMobile(String mobile){
    
        this.mobile=mobile;
    }
    public String getStatus(){
    
        return status;
    }
    public void setStatus(String status){
    
        this.status=status;
    }  
    public String getSSC(){
    
        return ssc;
    }
    public void setSSC(String ssc){
    
        this.ssc=ssc;
    }
    public String getHSC(){
    
        return hsc;
    }
    public void setHSC(String hsc){
    
        this.hsc=hsc;
    }    
    public String getSchool(){
    
        return school;
    }
    public void setSchool(String school){
    
        this.school=school;
    } 
    public String getCollege(){
    
        return college;
    }
    public void setCollege(String college){
    
        this.college=college;
    }
    public String getSchoolPassingYear(){
    
        return schoolPassingYear;
    }
    public void setSchoolPassingYear(String schoolyear){
    
        this.schoolPassingYear=schoolyear;
    }
    public String getCollegePassingYear(){
    
        return collegePassingYear;
    }
    public void setCollegePassingYear(String collegeyear){
    
        this.collegePassingYear=collegeyear;
    }    
    public String getMatricMarks(){
    
        return matricMarks;
    }
    public void setMatricMarks(String matricmarks){
    
        this.matricMarks=matricmarks;
    }
    public String getMatricMarksTotal(){
    
        return matricMarksTotal;
    }
    public void setMatricMarksTotal(String matricmarkstotal){
    
        this.matricMarksTotal=matricmarkstotal;
    }
    public String getInterMarks(){
    
        return interMarks;
    }
    public void setInterMarks(String intermarks){
    
        this.interMarks=intermarks;
    }        
    public String getInterMarksTotal(){
    
        return interMarksTotal;
    }
    public void setInterMarksTotal(String intermarkstotal){
    
        this.interMarksTotal=intermarkstotal;
    }
    public String getPreference1(){
        return preference1;
    }
    public void setPreference1(String preference1){
        this.preference1=preference1;
    }
    public String getPreference2(){
        return preference2;
    }
    public void setPreference2(String preference2){
        this.preference2=preference2;
    }
    public String getPreference3(){
        return preference3;
    }
    public void setPreference3(String preference3){
        this.preference3=preference3;
    }        
    public List<String> getSelectedUniversityList(){
    
           return selecteduniversityList;
    }
    public void setSelectedUniversityList(List<String> selecteduniversityList){
        this.selecteduniversityList=selecteduniversityList;
    }    
    public String getAbout(){
    
        return about;
    }
    public void setAbout(String about){
    
        this.about=about;
    }
    public String getEssay(){
    
        return essay;
    }
    public void setEssay(String essay){
    
        this.essay=essay;
    }    
    public String getSendMsg(){
    
        return sendmsg;
    }
    public void setSendMsg(String sendMsg){
    
        this.sendmsg=sendMsg;
    }
    public  String getAsk(){
    
        return ask;
    }
    public void setAsk(String ask){
    
        this.ask=ask;
    }
    public  String getreadAsk(){
    
        return readAsk;
    }
    public void setreadAsk(String readAsk){
    
        this.readAsk=readAsk;
    }
    public String getReply(){
    
        return reply;
    }
    public void setReply(String reply){
    
        this.reply=reply;
    }

}

