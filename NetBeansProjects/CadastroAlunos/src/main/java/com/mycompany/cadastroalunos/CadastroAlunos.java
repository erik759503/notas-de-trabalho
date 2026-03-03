/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroalunos;

/**
 *
 * @author 2155007129
 */

import java.util.Scanner;
public class CadastroAlunos {
    
    static Aluno[] alunos = new Aluno[10];
    static int tamanho = 0;
    
    public static void inserir(Scanner sc){
        
        if(tamanho>=10){
            System.out.println("Vetor cheio!");
            return;
        }
        System.out.print("Matricula: ");
        int matricula= sc.nextInt();
        
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        
        alunos[tamanho] = new Aluno(matricula,nome,nota);
        tamanho++;
        
        System.out.println("Aluno cadastro com sucesso!");
    }
    
    public static void listar(){
        for(int i = 0; i< tamanho; i++){
            alunos[i].mostrar();
        }
    }
    
    public static void buscar(int matricula){
        for(int i=0; i<tamanho;i++){
            if(alunos[i].matricula == matricula){
                alunos[i].mostrar();
                return;
            }
        }
        System.out.println("Alluno não encontrado!");
    }
    public static void mediaTurma(){
        double soma = 0;
        
        for(int i = 0;i<tamanho;i++){
            soma+=alunos[i].nota;
        }
        
        if(tamanho>0){
            System.out.println("Media da turma: " + (soma/tamanho));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("1=inserir aluno");
            System.out.println("2-listar alunos");
            System.out.println("3-Buscar por matricula");
            System.out.println("4-Media da turma");
            System.out.println("0-sair");
            System.out.print("opcao: ");
            op=sc.nextInt();
            
            switch(op){
                case 1:
                    inserir(sc);
                    break;
                    
                case 2:
                    listar();
                    break;
                    
                case 3:
                    System.out.print("Digite a matricula: ");
                    buscar(sc.nextInt());
                    
                case 4:
                    mediaTurma();
                    break;
            }
        }while (op !=0 );
        
        sc.close();
    }
}
