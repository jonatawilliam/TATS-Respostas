/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author jonatawilliam
 */
public class Main {
    
    public static void main(String[] args) {
	System.out.println("Sistema de RH - Empresa XYZ\n\n");
        Calculadora calculadora = new Calculadora();
    
	Funcionario funcionarioA = new Funcionario();
	funcionarioA.setNome("João Silva");
        funcionarioA.setEmail("joao.silva@xyz.com");
        funcionarioA.setCargo("Desenvolvedor");
        funcionarioA.setSalarioBase(5000.00f);
        System.out.println("Nome: " + funcionarioA.getNome());
        System.out.println("E-mail: "+ funcionarioA.getEmail());
        System.out.println("Cargo: " + funcionarioA.getCargo());
        System.out.println("Salário Base: "+ funcionarioA.getSalarioBase());
        System.out.println("Salário liquido: "+ calculadora.calcular(funcionarioA) + "\n\n");
            
        Funcionario funcionarioB = new Funcionario();
	funcionarioB.setNome("Lucas Alves");
        funcionarioB.setEmail("lucas.alves@xyz.com");
        funcionarioB.setCargo("Gerente");
        funcionarioB.setSalarioBase(2500.00f);
        System.out.println("Nome: " + funcionarioB.getNome());
        System.out.println("E-mail: "+ funcionarioB.getEmail());
        System.out.println("Cargo: " + funcionarioB.getCargo());
        System.out.println("Salário Base: "+ funcionarioB.getSalarioBase());
        System.out.println("Salário liquido: "+ calculadora.calcular(funcionarioB) + "\n\n");
        
        Funcionario funcionarioC = new Funcionario();
	funcionarioC.setNome("Alberto Lima");
        funcionarioC.setEmail("alberto.lima@xyz.com");
        funcionarioC.setCargo("Testador");
        funcionarioC.setSalarioBase(550.00f);
        System.out.println("Nome: " + funcionarioC.getNome());
        System.out.println("E-mail: "+ funcionarioC.getEmail());
        System.out.println("Cargo: " + funcionarioC.getCargo());
        System.out.println("Salário Base: "+ funcionarioC.getSalarioBase());
        System.out.println("Salário liquido: "+ calculadora.calcular(funcionarioC) + "\n\n");
        
    }
}
