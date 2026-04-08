package com.mycompany.conta1;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class Conta1 {

     private double saldo;
     
     public void sacar(double valor){
         if(valor>saldo){
             throw new RuntimeException("Saldo insuficiente");
         }
         saldo -=valor;
     }
     
     public void depositar(double valor){
         saldo += valor;
     }
     
     public double getSaldo(){
         return saldo;
     }
     
}
