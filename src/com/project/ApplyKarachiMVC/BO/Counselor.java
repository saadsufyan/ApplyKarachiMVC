/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.BO;

/**
 *
 * @author Administrator
 */
public class Counselor {
        
    private String name;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String confirmpassword;
    private String counselorID;
    private String email;
    private String gender;
    private String month;
    private String  day;
    private String  year;
    private String search;
    private String sendmsg;
    private String reply;
    private String readAsk;

    public String getName(){
    
        return name;
    }
    public void setName(String firstname){
    
        this.name= firstname;
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
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username=username;
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
    public String getcounselorId(){
    
        return counselorID;
    }
    public void setCounselorId(String id){
    
        this.counselorID=id;
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
    public String getSearch(){
    
        return search;
    }
    public void setSearch(String search){
    
        this.search=search;
    }
    public String getSendMsg(){
    
        return sendmsg;
    }
    public void setSendMsg(String sendMsg){
    
        this.sendmsg=sendMsg;
    }
    public String getReply(){
    
        return reply;
    }
    public void setReply(String reply){
    
        this.reply=reply;
    }    
    
    public  String getreadAsk(){
    
        return readAsk;
    }
    public void setreadAsk(String readAsk){
    
        this.readAsk=readAsk;
    }
}
