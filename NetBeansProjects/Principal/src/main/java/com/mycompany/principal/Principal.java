/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author 2155007129
 */
import javax.swing.JOptionPane;

public class Principal {
      
        static Pessoa[] pessoa = new Pessoa[10];
        static int contador = 0;
        
       public static void main(String [] args){
           int opcao;
           
           do{
               String menu ="""
                            ===MENU===
                            1 - Inserir Pessoa
                            2 - Listar Pessoas
                            3- Sair
                            """;
               
               opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
           
                switch(opcao){
                    case 1:
                        inserirPessoa();
                    break;
                    case 2 :
                        listarPessoas();
                    break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"Encerrando sistema...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção invalida!");
                }
            }while (opcao !=0);
        }
       public static void inserirPessoa(){
           if(contador<pessoas.length){
               String nome = JOptionPane.showInputDialog("Nome: ");
               int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
               String endereco = JOptionPane.showInputDialog("Endereço: ");
               double salario = Double.parseDouble( JOptionPane.showInputDialog("Salário: "));
               
               
               pessoa[contador] = new Pessoa(nome,idade,endereco,salario);
               contador++;
               
               JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
           }else{
               JOptionPane.showMessageDialog(null, "Vetor cheio!");
           }
       }
       
       public static void listarPessoas(){
           if(contador == 0 ){
               JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada.");
               return;
           }
           String lista ="===LISTA DE PESSOAS+===\n\n";
           
           for (int i=0; i< contador; i++){
               lista += "INDICE:"+i+"\n";
               lista += pessoa[i].exibirDados();
               lista += "\n--------------\n";
           }
           JOptionPane.showMessageDialog(null,lista);
       }
}
