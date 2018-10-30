/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.pasienHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.glassfish.hk2.utilities.reflection.Logger;
import pojos.Pasien;

/**
 *
 * @author Yoseph
 */
public class tsetpasienadd {
    public static void main(String[] args) throws ParseException {
        try{
            
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date=format.parse("19741231");
        String noRm="1212";
        String nama="makiki";
        String alamat="jl.usus buntu";
         String kelamin="laki-laki";
        pasienHelper helper=new pasienHelper();
        helper.addNewPasien(noRm,nama,alamat,noRm,date,kelamin);
        
        }catch(ParseException ex){
            
        }
        
    }
}
