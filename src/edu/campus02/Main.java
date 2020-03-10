package edu.campus02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //schauen wir uns ein altbekanntes array an:
        int []feld = new int [] {1, 2, 3};

        //es gibt ein hilfsmethode die ein array ausgibt:
        System.out.println(Arrays.toString(feld));
        System.out.println("----------");


        // 2 dimensionsales array (array in arry)
        int [][] feld2dim = new int [3][4];


        //einem elemnet etwas zuweisen
        feld2dim[1][2] = 42;
        System.out.println(Arrays.toString(feld2dim)); // zeigt arrays in arrays
        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));


        //andere initialisierung:
        int [][] feld2dim2 = new int [][] {{1, 2, 3,}, {4, 5, 6,}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));

        //ganz kurz strings:

        String str = "Hallo ZAM";
        System.out.println(str.length());
        // strings dürfen nicht mit 'ist gleich verglichen werden' macht was anderes.
        // aber equals kann verwendet werden
        System.out.println(str.equals("Hallo ZAM"));


    }
}

