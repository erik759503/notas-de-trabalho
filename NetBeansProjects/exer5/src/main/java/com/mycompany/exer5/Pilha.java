/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer5;

import javax.swing.JOptionPane;

/**
 *
 * @author 2155007129
 */
public class Pilha {
    private int tamanho;
    private char [] pilha;
    private char [] pilhaux;
    private int topo;
    
    Pilha(int x){
        tamanho = x;
        
        pilha = new char[tamanho];
        pilhaux = pilha;
        
        topo = -1;
    }
    void push(){
        String temp = JOptionPane.showInputDialog("Entre com a palavra para empilhar: ");
        for (topo++;topo < temp.length();topo++){
            pilha[topo]=temp.charAt(topo);
        }
    }
    void pop(){
        int i = 0;
        if(topo == -1){
            JOptionPane.showMessageDialog(null,"Pilha vazia.");
            return;
        }
        
        String str="";
        for(topo--;topo>=0;topo--){
       
            str+=pilha[topo]+ " ";
        }
        JOptionPane.showMessageDialog(null,"Palavra desempiulhada" + str);
        JOptionPane.showMessageDialog(null,"Palavra empiulhada" + pilhaux);
    }
    
}
