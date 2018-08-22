/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonatawilliam
 */
public class Calculadora {
    public float calcular(Funcionario funcionario) {
        float salarioLiquido = 0; 
        
        if(funcionario.getCargo().equals("Desevolvedor")) 
            if (funcionario.getSalarioBase() >= 3000.00f) {    
                salarioLiquido = funcionario.getSalarioBase() * 0.80f;
            }
            else {
                salarioLiquido = funcionario.getSalarioBase() * 0.90f;
            }
        
        if(funcionario.getCargo().equals("Dba") || funcionario.getCargo().equals("Testador"))
            if (funcionario.getSalarioBase() >= 2000.00f) {
                salarioLiquido = funcionario.getSalarioBase() * 0.75f;
            }
            else {
                salarioLiquido = funcionario.getSalarioBase() * 0.85f;
            }
        
        if(funcionario.getCargo().equals("Gerente"))
            if (funcionario.getSalarioBase() >= 5000.00f) {
                salarioLiquido = funcionario.getSalarioBase() * 0.70f;
            }
            else {
                salarioLiquido = funcionario.getSalarioBase() * 0.80f;
            }
       
        
        return salarioLiquido;
    }
    
}
