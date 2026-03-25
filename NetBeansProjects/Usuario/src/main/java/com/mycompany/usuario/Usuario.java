package com.mycompany.usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class Usuario {

    private String nome;
    private int idade;
    
    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public boolean maiorDeIdade(){
        return idade >=18;
    }
    
    public String getNome(){
        return nome;
    }
}
