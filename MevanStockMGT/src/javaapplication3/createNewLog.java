package javaapplication3;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Induwara Jayalath
 */
public class createNewLog {

    public static void createNewLogMethod(String args) throws FileNotFoundException, UnsupportedEncodingException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_____HH_mm_ss");
        Date date = new Date();
        String dateString = dateFormat.format(date);
        try (PrintWriter writer = new PrintWriter("F:\\JOOMLA\\" + dateString + ".txt", "UTF-8")) {
            writer.println("This log was created on \n\n" + dateString+"\n\n");
            writer.println();
            writer.println(args);
        }
    }

}
