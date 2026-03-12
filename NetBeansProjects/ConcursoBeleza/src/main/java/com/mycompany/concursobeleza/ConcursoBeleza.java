/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concursobeleza;

/**
 *
 * @author 2155007129
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ConcursoBeleza {

    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        ArrayList<Integer> listaInscricao = new ArrayList<>();
        ArrayList<Double>  listaAltura    = new ArrayList<>();
        ArrayList<Double>  listaPeso      = new ArrayList<>();
        ArrayList<Double>  listaIMC       = new ArrayList<>();
 
        System.out.println("=============================================");
        System.out.println("  SISTEMA DE INSCRIÇÃO - CONCURSO DE BELEZA");
        System.out.println("=============================================");
        System.out.println("Digite 0 no número de inscrição para encerrar.\n");
 
        while (true) {
            System.out.print("Número de inscrição (0 para sair): ");
            int inscricao = sc.nextInt();
 
            if (inscricao == 0) { // FLAG de encerramento
                break;
            }
 
            System.out.print("Altura (em metros, ex: 1.70): ");
            double altura = sc.nextDouble();
 
            System.out.print("Peso (em kg, ex: 55.0): ");
            double peso = sc.nextDouble();
 
            // Cálculo do IMC = peso / altura²
            double imc = peso / (altura * altura);
 
            System.out.printf("  → IMC: %.2f", imc);
 
            if (imc < 18) {
                System.out.println(" ✓ APROVADA\n");
                listaInscricao.add(inscricao);
                listaAltura.add(altura);
                listaPeso.add(peso);
                listaIMC.add(imc);
            } else {
                System.out.println(" ✗ Nao aprovada\n");
            }
        }
 
        // Resultado final
        System.out.println("\n=============================================");
        System.out.println("          RESULTADO DO CONCURSO");
        System.out.println("  Criterio: IMC = Peso / Altura²  (IMC < 18)");
        System.out.println("=============================================");
 
        if (!listaInscricao.isEmpty()) {
            System.out.printf("Total de aprovadas: %d%n%n", listaInscricao.size());
            System.out.printf("%-12s %8s %8s %8s%n", "Inscricao", "Altura", "Peso", "IMC");
            System.out.println("--------------------------------------------");
 
            for (int i = 0; i < listaInscricao.size(); i++) {
                System.out.printf("%-12d %6.2fm %6.1fkg %7.2f%n",
                    listaInscricao.get(i),
                    listaAltura.get(i),
                    listaPeso.get(i),
                    listaIMC.get(i));
            }
        } else {
            System.out.println("Nenhuma candidata foi aprovada.");
        }
 
        System.out.println("=============================================");
        sc.close();
    }
    
}
