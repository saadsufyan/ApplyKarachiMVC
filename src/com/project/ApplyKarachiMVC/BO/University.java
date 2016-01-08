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
public class University {
       
    private String name;
    private String username;
    private String profile;
    private String password;
    private String confirmpassword;
    private String selecteduniversity;
    
    private int rank;
    
    public String getName(){
    
        return name;
    }
    public void setName(String firstname){
    
        this.name= firstname;
    }           
    public String getUsername(){
    
        return username;
    } 
    public void setUsername(String username){
    
        this.username= username;
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
    public void setUniversityProfile(String profile){
    
        this.profile=profile;
    }
    public String getUniversityProfile(){
    
        return profile;
    }
    public void setUniversityRank(int rank){
    
        this.rank=rank;
    }
    public int getUniversityRank(){
        
        return rank;
    }

}

