
package com.project.ApplyKarachiMVC.DAL;

import com.project.ApplyKarachiMVC.BO.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadASKDAL 
{
    public void ReadAsk(Student student)
    {
        FileReader fr = null;
        try {
            fr = new FileReader(student.getUsername() + "Ask.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                student.setreadAsk( br.readLine());
            } catch (IOException ex) {
                Logger.getLogger(ReadASKDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadASKDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadASKDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
