package com.mycompany.validadorsenha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class ValidadorSenha {

    public boolean senhaValida(String senha){
        
        if(senha.length()<8)
            return false;
        
        return true;
    }
}
