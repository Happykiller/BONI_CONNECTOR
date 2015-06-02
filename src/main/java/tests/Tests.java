package tests;

import com.bonitasoft.custom.ConnectorLib;

/**
 * Created by Fabrice.R on 19/01/2015.
 */
public class Tests {
    public static void main(String [ ] args){
        ConnectorLib.trace("===== Mes tests ======");
        testSayHello();
    }

    public static void testSayHello(){
        String attendu = "Hello you";

        String retour = ConnectorLib.sayHello("you");

        ConnectorLib.trace("Test testSayHello : " + attendu.equals(retour));
    }
}