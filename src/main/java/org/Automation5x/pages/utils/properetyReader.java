package org.Automation5x.pages.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properetyReader {


    public properetyReader() {

    }
    String user =System.getProperty("user.dir");

    public static String readkey(String key)  {
        FileInputStream fileInputStream = null ;
        Properties p = null;
        try {

            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\testLoginPage_Postive.properties");
      p = new Properties();
      p.load(fileInputStream);

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try {


                fileInputStream.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

            }




        return p.getProperty(key);
    }



}
