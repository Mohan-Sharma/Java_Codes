package org.msharma;


/**
 * @author Mohan Sharma Created on 26/04/17.
 */
public class ManipulateTextFile{
    public static void main(String[] args)  throws Exception{
        String textToFilter = "dhjfgvd jkgv %^$#^W#*E(@#)E&E#(*{{}}}((7t8nmvj))375893175*&E%^($@E&%$";
        String filteredTeext = textToFilter.replaceAll("[\\W_&&[^.]]+", "");
        System.out.println(filteredTeext);
    }
}
