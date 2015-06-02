package com.bonitasoft.custom;

import java.util.logging.Logger;

/**
 * Created by Fabrice.R on 20/05/2015.
 */
public class ConnectorLib {

    private static final Logger uilLogger = Logger.getLogger("com.bonitasoft.groovy");

    public static void trace(String message){
        try {
            uilLogger.info(message);
            System.out.println(message);
        }catch (Exception e) {
            uilLogger.severe("trace - Error : " + e.getMessage());
        }
    }

    public static String getDateTimeStr(){
        try {
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            java.sql.Date dateReturn = new java.sql.Date(currentDate.getTime());
            SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
            return formater.format(dateReturn);
        }catch (Exception ex) {
            trace("getDateTimeStr - Error : " + ex);
            return null;
        }
    }

    public static String sayHello(String who){
        String retour = "";
        try {
            retour = "Hello " + who;

            return retour;
        }catch (Exception e) {
            trace("sayHello - Exception : " + e.getMessage());
            return null;
        }
    }
}