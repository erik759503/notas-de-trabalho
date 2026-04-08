/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.j_ii_exerc1;

/**
 *
 * @author 2155007129
 */

import java.io.*;
        
class J_Leitura {
    public String Ler(){
        DataInputStream dado;
        String valor = "0";
        try{
            dado = new DataInputStream(System.in);
        valor = dado.readUTF();
        }
        catch (Exception e){
            System.out.println("Entrada Invalida");
            valor = "0";
        }
        return(valor.trim());
    }
    public int Ler_int(){
        DataInputStream dado;
        String valor="0";
        int teste;
        
        do{
            try{
                dado=new DataInputStream(System.in);
                valor=dado.readUTF();
                teste = Integer.parseInt(valor);
                return teste;
            }
            catch(Exception e){
                System.out.print("Entrada invalida! Digite novamente: ");
                teste =0;
            }
        }while(teste<= 0 && teste != -1);//-1usado para Flag
        return teste;
    }
    public float LER_float(){
        DataInputStream dado;
        String valor = "0";
        float teste;
        
        do{
            try{
                dado = new DataInputStream(System.in);
                valor = dado.readUTF();
                teste = Float.parseFloat(valor);
                return teste;
            }
            catch (Exception e){
                System.out.println("Entrada invalida! Digite novamente: ");
                teste = 0;
            }
        }while(teste<=0);
        return teste;
    }
    
    public void Pause(int segundos){
        try{
            Thread.sleep(segundos*1000);
        }
        catch(Exception e){
            System.out.println("Continuando...");
        }
    }
    
    public void Limpa_tela(){
        for(int i=0;i<24;i++)
            System.out.println();
    }
}

