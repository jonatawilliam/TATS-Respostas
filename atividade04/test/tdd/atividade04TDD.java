/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;


import atividade04.Calculadora;
import atividade04.Funcionario;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonatawilliam
 */
public class atividade04TDD {
    
    @Test
    public void testeCamposVazio() throws Exception {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("");
        funcionario.setEmail("");
        funcionario.setCargo("");
        funcionario.setSalarioBase(0f);
        assertFalse(funcionario.salvar());
        assertEquals("Nome vazio\nE-mail vazio\nCargo vazio\nSalario Base vazio\n", funcionario.getMensagemErro());
    }
    
    @Test
    public void testeSalarioLiquidoGerenteMaior5000() throws Exception {
        
        Funcionario funcionario = new Funcionario();
        Calculadora calculadora = new Calculadora();
        funcionario.setNome("José Silva");
        funcionario.setEmail("jose@utpr.com");
        funcionario.setCargo("Gerente");
        funcionario.setSalarioBase(10000.00f);
        assertTrue(funcionario.salvar());
        assertEquals("", funcionario.getMensagemErro());
        assertNotNull(calculadora.calcular(funcionario));
        Assert.assertEquals(7000.00f, calculadora.calcular(funcionario), 0.1);
    }
    
    @Test
    public void testeCargoNaoExiste() throws Exception {
        
        Funcionario funcionario = new Funcionario();
        Calculadora calculadora = new Calculadora();
        funcionario.setNome("Lucas Alves");
        funcionario.setEmail("lucas@utpr.com");
        funcionario.setCargo("Financeiro");
        funcionario.setSalarioBase(2600.00f);
        assertTrue(funcionario.salvar());
        assertEquals("Cargo não existe\n", funcionario.getMensagemCargoVazio());
    }
    
}
