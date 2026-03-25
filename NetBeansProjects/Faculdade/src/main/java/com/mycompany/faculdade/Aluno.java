/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculdade;

/**
 *
 * @author 2155007129
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    
    int    matricula;
    char   sexo;
    double nota1;
    double nota2;
    double media;   // calculada automaticamente
 
    // Construtor (equivale à "alocação + inicialização")
    public Aluno(int matricula, char sexo, double nota1, double nota2) {
        this.matricula = matricula;
        this.sexo      = sexo;
        this.nota1     = nota1;
        this.nota2     = nota2;
        this.media     = (nota1 + nota2)/2.0;
    }
    
}
