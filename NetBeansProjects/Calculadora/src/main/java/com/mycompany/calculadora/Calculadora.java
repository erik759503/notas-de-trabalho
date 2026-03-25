/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author 2155007129
 */
public class Calculadora {
    
    public static int dividir(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return a / b;
    }
    public static int maiorNumero(int a, int b, int c){
        int maior = a;
        if(b>maior){
            maior=b;
        }
        if(c>maior){
            maior=c;
        }
        return maior;
    }
    
    public static boolean numeroEhPar(int n){
        return n%2 == 0;
    }

    public static void main(String[] args) {
        
        System.out.println("dividir 10/2 = " + dividir(10,2)+ "Sucesso!");
        //System.out.println("Dividir 10/0 = " + dividir(10,0) + "Falha!");
        
        System.out.println("Maior de 3 numero 15,2 e 10 = " + maiorNumero(15,2,10) + "Sucesso! Maior A");
        System.out.println ("Maior de 3 numeros -1,20 e 10 = " + maiorNumero(-1,20,10) + "Sucesso! Maior B");
        System.out.println("Maior de 3 numeros -10,-6 e -5 = " + maiorNumero(-10,-6,-5) + "Sucesso! Maior C");
        System.out.println("Maior de 3 numero 2,2 e 2 =" + maiorNumero(2,2,2)+ "Sucesso! Todos iguais");
        
        
        System.out.println("Teste se o numero e par ou nao, numero 2 =" + numeroEhPar(2));
        System.out.println("Teste se o numero e par ou nao, numero 0 =" + numeroEhPar(0));
        System.out.println("Teste se o numero e par ou nao, numero -4 =" + numeroEhPar(-4));
        System.out.println("Teste se o numero e par ou nao, numero -137 =" + numeroEhPar(-137));
    }
}
