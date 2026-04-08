/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha_exp1;

/**
 *
 * @author 2155007129
 */

import javax.swing.JOptionPane;
class no_pilha{
    int valor;
    no_pilha proximo;
    
    no_pilha(){
        valor = 0;
        proximo = null;
                
    }

}
class pilha{
    private no_pilha topo;
    
    public void push(){
        no_pilha temp_no = new no_pilha();
        
        if(temp_no !=null){
            
            temp_no.valor =  Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor: "));
            
            temp_no.proximo = topo;
            
            topo = temp_no;
        }
        else{
            JOptionPane.showMessageDialog(null,"Não foi possível inserir...");
        }
    }
    
    public void pop(){
        if (topo != null){
            JOptionPane.showMessageDialog(null,"\n Valor removido: "+topo.valor);
            
            topo = topo.proximo;
        }
        else{
            JOptionPane.showMessageDialog(null,"Pilha vazia...");
        }
    }
    
    public void printall(){
        if(topo == null){
            JOptionPane.showMessageDialog(null,"Pilha vazia ...");
            return;
        }
        
        no_pilha temp_no = topo;
        String str = "Pilha:\n;";
        
        while(temp_no != null){
            str += temp_no.valor +"\n";
            temp_no = temp_no.proximo;
        }
        JOptionPane.showMessageDialog(null,str);
    }

}

public class Pilha_exp1 {

    public static void main(String[] args) {
        pilha aPilha = new pilha();
        int op;
        do{
            op=menu();
            switch(op){
                case 1: aPilha.push(); break;
                
                case 2: aPilha.pop(); break;
                
                case 3: aPilha.printall();
            }
        }while(op!= 4);
    }
    
    public static int menu(){
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Empilhar\n2 - Desenpilhar\n3 - Imprimir\n 4 Sair\n\n Opcao:"));
        }while(op<1||op>4);
        return(op);
    }
}

