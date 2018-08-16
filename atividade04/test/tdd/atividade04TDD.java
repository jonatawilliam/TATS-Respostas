/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;


import atividade04.Funcionario;
import java.util.List;
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
        assertNull(funcionario.salvar());
        assertEquals("Nome vazio\nE-mail vazio\nCargo vazia\nSalario Base vazio\n", funcionario.getMensagemErro());
    }
    
}
