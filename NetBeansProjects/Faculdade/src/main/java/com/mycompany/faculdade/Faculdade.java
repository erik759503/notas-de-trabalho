/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faculdade;

/**
 *
 * @author 2155007129
 */

import java.util.ArrayList;
import java.util.Scanner;
 
public class Faculdade {
 
    static Scanner sc = new Scanner(System.in);
 
    static String status(double media) {
        if (media >= 7.0) return "APROVADO";
        if (media >= 5.0) return "EXAME";
        return "REPROVADO";
    }
 
    static void imprimirCabecalho() {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-6s %8s %8s %8s %-10s%n",
            "Matricula", "Sexo", "Nota 1", "Nota 2", "Media", "Situacao");
        System.out.println("------------------------------------------------------------");
    }
 
    static void imprimirAluno(Aluno a) {
        System.out.printf("%-10d %-6c %8.2f %8.2f %8.2f %-10s%n",
            a.matricula,
            Character.toUpperCase(a.sexo),
            a.nota1,
            a.nota2,
            a.media,
            status(a.media));
    }
 
    static ArrayList<Aluno> lerAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
 
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║     CADASTRO DE ALUNOS               ║");
        System.out.println("║  (digite matricula 0 para encerrar)  ║");
        System.out.println("╚══════════════════════════════════════╝\n");
 
        while (true) {
            System.out.print("Matricula (0 para sair): ");
            int matricula = sc.nextInt();
 
            if (matricula == 0) break;
 
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
 
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
 
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
 
            Aluno novoAluno = new Aluno(matricula, sexo, nota1, nota2);
            alunos.add(novoAluno);
 
            System.out.printf("  -> Media: %.2f  |  %s%n%n", novoAluno.media, status(novoAluno.media));
        }
 
        return alunos;
    }
 
    static void imprimirAprovados(ArrayList<Aluno> alunos) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║        ALUNOS APROVADOS (>= 7)       ║");
        System.out.println("╚══════════════════════════════════════╝");
        imprimirCabecalho();
 
        int count = 0;
        for (Aluno a : alunos) {
            if (a.media >= 7.0) { imprimirAluno(a); count++; }
        }
 
        if (count == 0) System.out.println("  Nenhum aluno aprovado.");
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total de aprovados: %d%n", count);
    }
 
    static void imprimirExame(ArrayList<Aluno> alunos) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║       ALUNOS EM EXAME (5 a 6.9)      ║");
        System.out.println("╚══════════════════════════════════════╝");
        imprimirCabecalho();
 
        int count = 0;
        for (Aluno a : alunos) {
            if (a.media >= 5.0 && a.media < 7.0) { imprimirAluno(a); count++; }
        }
 
        if (count == 0) System.out.println("  Nenhum aluno em exame.");
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total em exame: %d%n", count);
    }
 
    static void imprimirMelhorPior(ArrayList<Aluno> alunos) {
        if (alunos.isEmpty()) { System.out.println("\nNenhum aluno cadastrado."); return; }
 
        Aluno melhor = alunos.get(0);
        Aluno pior   = alunos.get(0);
 
        for (Aluno a : alunos) {
            if (a.media > melhor.media) melhor = a;
            if (a.media < pior.media)   pior   = a;
        }
 
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║      DESTAQUES DA TURMA              ║");
        System.out.println("╚══════════════════════════════════════╝");
 
        System.out.println("\nMELHOR ALUNO:");
        imprimirCabecalho();
        imprimirAluno(melhor);
 
        System.out.println("\nALUNO COM MENOR MEDIA:");
        imprimirCabecalho();
        imprimirAluno(pior);
    }
 
    static void listarTodos(ArrayList<Aluno> alunos) {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║        TODOS OS ALUNOS               ║");
        System.out.println("╚══════════════════════════════════════╝");
 
        if (alunos.isEmpty()) { System.out.println("  Nenhum aluno cadastrado ainda."); return; }
 
        imprimirCabecalho();
        for (Aluno a : alunos) imprimirAluno(a);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total de alunos: %d%n", alunos.size());
    }
 
    static void exibirMenu() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║         SISTEMA UNIVERSITARIO        ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1. Cadastrar alunos                 ║");
        System.out.println("║  2. Listar aprovados                 ║");
        System.out.println("║  3. Listar alunos em exame           ║");
        System.out.println("║  4. Melhor e pior aluno              ║");
        System.out.println("║  5. Listar todos os alunos           ║");
        System.out.println("║  0. Sair                             ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print("Escolha uma opcao: ");
    }
 
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao;
 
        do {
            exibirMenu();
            opcao = sc.nextInt();
 
            switch (opcao) {
                case 1:
                    alunos = lerAlunos();
                    System.out.printf("\n%d aluno(s) cadastrado(s) com sucesso!%n", alunos.size());
                    break;
                case 2:
                    if (alunos.isEmpty()) { System.out.println("\nCadastre alunos primeiro (opcao 1)."); break; }
                    imprimirAprovados(alunos);
                    break;
                case 3:
                    if (alunos.isEmpty()) { System.out.println("\nCadastre alunos primeiro (opcao 1)."); break; }
                    imprimirExame(alunos);
                    break;
                case 4:
                    if (alunos.isEmpty()) { System.out.println("\nCadastre alunos primeiro (opcao 1)."); break; }
                    imprimirMelhorPior(alunos);
                    break;
                case 5:
                    listarTodos(alunos);
                    break;
                case 0:
                    System.out.println("\nEncerrando o sistema. Ate logo!");
                    break;
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
            }
 
        } while (opcao != 0);
 
        sc.close();
    }
}
