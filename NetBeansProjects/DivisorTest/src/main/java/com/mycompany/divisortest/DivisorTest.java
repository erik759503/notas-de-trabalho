/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisortest;

/**
 *
 * @author 2155007129
 */
public class DivisorTest {


    public static double dividir(int numerador,int denominador){
        if(denominador == 0){
            return -1.0;
        }
        return(double)numerador / denominador;
    }   
    
    public static void main(String[] args) {
        
        System.out.println("10/2=" + dividir(10,2));
        System.out.println("10/0=" + dividir(10,0));
        System.out.println("-7/3=" + dividir(-7,3));
        System.out.println("100/5=" + dividir(100,50));
    }
}
