/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroceroynueve;

/**
 *
 * @author danu
 */
import java.io.*;
import java.util.*;
public class NumeroCeroyNueve {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char Num1;
        System.out.print("Ingrese un número: ");
        Num1 =(char)System.in.read();
        
        if(Num1>='0' && Num1<='9')
            System.out.println(Num1 + " Es un número, esta bien");
        else
            System.out.println(Num1 + " No es un número");
     }
    
}
