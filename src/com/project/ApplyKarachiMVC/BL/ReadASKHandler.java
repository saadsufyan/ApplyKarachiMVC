package com.project.ApplyKarachiMVC.BL;

import com.project.ApplyKarachiMVC.BO.Student;
import com.project.ApplyKarachiMVC.DAL.ReadASKDAL;

public class ReadASKHandler 
{
    public void ReadAsk(Student student)
    {
        ReadASKDAL readASKDAL= new ReadASKDAL();
        readASKDAL.ReadAsk(student);
    }
}
