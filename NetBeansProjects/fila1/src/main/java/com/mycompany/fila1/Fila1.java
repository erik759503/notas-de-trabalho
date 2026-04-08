/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila1;

/**
 *
 * @author 2155007129
 */
class Exerc1{
    private int tamanho;
    private String[] fila;
    private int qtde;
    J_Leitura in = new J_Leitura();
    
    public Exerc1(int x){
        tamanho = x;
        fila = new String[tamanho];
        qtde = -1;
    }
    
    public void push(){}
    
    public void printall(){}
    
}



public class Fila1 {

    public static void main(String[] args) {
       Fila1 aFila = new Fila1(4);
       int op;
       do{
           op = menu();
           switch (op){
               case 1: aFila.push(); break;
           }
       } while (op!=2);
    }
    
    static int menu(){
        int op;
        do{
            System.out.println("1 - inserir");
            System.out.println("2 - Sair\n");
            System.out.print("Opcao: ");
            op = in.Ler_int();
        }while(op<1 || op>2);
        return (op);
    }
}
