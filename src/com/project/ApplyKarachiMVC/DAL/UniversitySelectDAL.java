/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.project.ApplyKarachiMVC.DAL;

import com.project.ApplyKarachiMVC.BO.SelectedUniversities;
import com.project.ApplyKarachiMVC.BO.Student;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class UniversitySelectDAL {
 
        public boolean saveUniversities(Student student){
        boolean success = false;
        
        try {
                FileWriter selectUniversityFileWriter = new FileWriter(student.getUsername() + ".txt");
                List<SelectedUniversities> universities = student.getUniversities();
                PrintWriter selectUniversityFileBuffWriter = new PrintWriter(selectUniversityFileWriter);
                selectUniversityFileBuffWriter.println(universities.size());
                for(int j=0; j<universities.size(); j++){
                    selectUniversityFileBuffWriter.println(universities.get(j).getNed());
                    selectUniversityFileBuffWriter.println(universities.get(j).getSSUET());
                    selectUniversityFileBuffWriter.println(universities.get(j).getNust());
                    selectUniversityFileBuffWriter.println(universities.get(j).getFast());
                    selectUniversityFileBuffWriter.println(universities.get(j).getSuffa());
                    selectUniversityFileBuffWriter.println(universities.get(j).getIndus());
                    selectUniversityFileBuffWriter.println(universities.get(j).getIqra());
                    selectUniversityFileBuffWriter.println(universities.get(j).getBahria());
                    selectUniversityFileBuffWriter.println(universities.get(j).getCBM());
                    selectUniversityFileBuffWriter.println(universities.get(j).getSzabist());
                    selectUniversityFileBuffWriter.println(universities.get(j).getMaju());
                    selectUniversityFileBuffWriter.println(universities.get(j).getKU());
                    selectUniversityFileBuffWriter.println(universities.get(j).getIBA());
                    selectUniversityFileBuffWriter.println(universities.get(j).getDOW());
                    selectUniversityFileBuffWriter.println(universities.get(j).getGreenwich());
                    selectUniversityFileBuffWriter.println(universities.get(j).getSMDC());
                    selectUniversityFileBuffWriter.println(universities.get(j).getAghakhan());
                    selectUniversityFileBuffWriter.println(universities.get(j).getFUUAST());
                    selectUniversityFileBuffWriter.println(universities.get(j).getKANUPP());
                    selectUniversityFileBuffWriter.println(universities.get(j).getPreston());                    
                    selectUniversityFileBuffWriter.println(universities.get(j).getIndusValley());
                    selectUniversityFileBuffWriter.println(universities.get(j).getHamdard());
                    selectUniversityFileBuffWriter.println(universities.get(j).getBIZTEK());
                    selectUniversityFileBuffWriter.println(universities.get(j).getIIEE());
                    selectUniversityFileBuffWriter.println(universities.get(j).getDawood());
                    selectUniversityFileBuffWriter.println(universities.get(j).getZiaUddin());
                    selectUniversityFileBuffWriter.println(universities.get(j).getBaqai());
                    selectUniversityFileBuffWriter.println(universities.get(j).getKSA());                   
                    selectUniversityFileBuffWriter.println(universities.get(j).getJinnahWomen());                    
                    selectUniversityFileBuffWriter.println(universities.get(j).getUsman());
                    selectUniversityFileBuffWriter.println(universities.get(j).getKAZBIT());
                    selectUniversityFileBuffWriter.println(universities.get(j).getKSBL());
                    selectUniversityFileBuffWriter.println(universities.get(j).getTextileInstitute());
                    selectUniversityFileBuffWriter.println(universities.get(j).getPAF());
                    selectUniversityFileBuffWriter.println(universities.get(j).getSMI());
                    selectUniversityFileBuffWriter.println(universities.get(j).getCHE());
                }
                selectUniversityFileWriter.close();
                success = true;
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
            ex.printStackTrace();
        } 
        catch (Exception ex) {
            System.err.println("Exception occured: ContactsDAL::saveContact !");
            ex.printStackTrace();
        }
        return success;
    }
}
