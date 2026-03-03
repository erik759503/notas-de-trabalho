/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroalunos;

/**
 *
 * @author 2155007129
 */
public class Aluno {
    int matricula;
    String nome;
    double nota;
    
    public Aluno(int matricula, String nome, double nota){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    
    public void mostrar(){
        System.out.println("Matricula "+ matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("---------------------------");
    }
    
}
