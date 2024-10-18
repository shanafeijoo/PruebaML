/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebaml;

import java.util.*;

/**
 *
 * @author Lab5
 */
public class PruebaML {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Integer> ci=new ArrayList<Integer>();
        
        ci.add(4695378);
        
        System.out.println("Cedula ingresada: "+ ci.get(0));
        Scanner tec=new Scanner(System.in);
        int cedula;
        for(int i=0;i<5;i++){
            System.out.println("Ingrese Cedula");
            cedula=tec.nextInt();
            ci.add(cedula);
        }
        for(int i=0;i<ci.size();i++){
            System.out.println(" Cedula");
            System.out.println("Cedula ingresada: "+ ci.get(i));

        }
        
        
        
        
    }
}
