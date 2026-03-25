/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verspilha;

/**
 *
 * @author 2155007129
 */
import javax.swing.JOptionPane;

public class Verspilha {

    public static void main(String[] args) {
        Pilha  aPilha = new Pilha (20);
        int op;
        do{
            op=menu();
            switch(op){
                case 1 : aPilha.push();break;
                case 2 : aPilha.pop();
            }
        }while(op!=3);
    }
    static int menu()
    {
        int op ;
        do{
            op=Integer.parseInt (JOptionPane.showInputDialog("1 - Ler palavra e empilhar\n2 - Desempilhar e imprimir\n3 - Sair\n Opcao: "));
        }while (op<1 || op>3);
        return op;
    }
    
}
