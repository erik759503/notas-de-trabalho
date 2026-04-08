package com.mycompany.conta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class Conta {

    private double saldo;
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    
    public void sacar(double valor){
        saldo -=valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
