/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisadornotas;

/**
 *
 * @author 2155007129
 */

import java.util.Scanner;

public class AnalisadorNotas {
    
    
    public String calcularConceito(double[] notas){
        if(notas == null || notas.length == 0){
            throw new IllegalArgumentException("Lista de notas invalidas.");
        }
        
        double soma =0 ;
        for (double n:notas){
            if(n<0|| n>10){
                throw new IllegalArgumentException("Notas fora do intervalo 0-10.");
            }
            soma += n;
        }
        
        double media = soma / notas.length;
        
        if(media>=9){
            return "A";
        }else if(media>=7){
            return "B";
        }else if(media>=5){
            return "C";
        }else{
            return "D";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AnalisadorNotas analisador = new AnalisadorNotas();
        
        try{
            System.out.print("Quantas notas voce deseja inserir? ");
            int qtd = sc.nextInt();
            
            if(qtd<= 0){
                System.out.print("Quantidade invalida.");
                return;
            }
            double[] notas = new double[qtd];
            for(int i=0;i<qtd;i++){
                System.out.print("Digite a nota" + (i+1) + ":");
                notas[i] = sc.nextDouble();
            }
            String conceito = analisador.calcularConceito(notas);
            System.out.println("\nConceito final:" + conceito);
        }catch(IllegalArgumentException e){
            System.out.print("Erro:" + e.getMessage());
        }catch(Exception e){
            System.out.println("Erro inseperado: " + e.getMessage());
        }finally
        {sc.close();  
        }
    } 
}
