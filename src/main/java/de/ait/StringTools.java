package de.ait;

public abstract class StringTools {



    public static String firstToUpperCase(String str){
       return str.substring(0,1).toUpperCase()+str.substring(1);

    }

    public static boolean isStartingFromCapital(String str){
        //return str.substring(0, 1).equals(str.substring(0, 1).toUpperCase());
        return Character.isUpperCase(str.charAt(0));
    }

}
