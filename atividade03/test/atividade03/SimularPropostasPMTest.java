/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonatawilliam
 */
public class SimularPropostasPMTest {

    @Test
    public void testeTodosCamposVazio() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("");
        pm.setSalario(0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("nome vazio\nsalario vazio\nidade vazia\nvalor vazio\n", pm.getMsgDeErro());
        
    }
    
    @Test
    public void testeIdadeVazio() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("João da Silva");
        pm.setSalario(100.00f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(1000.00f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("idade vazia\n", pm.getMsgDeErro());
        
    }
    
    @Test
    public void testeDadosCorretos() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("João da Silva");
        pm.setSalario(800.00f);
        pm.setIdade(25);
        pm.setValorDoEmprestimo(1000.00f);
        MostrarPropostasPM mostrarPm = pm.pressionarBotaoElaborar();
        assertEquals("", pm.getMsgDeErro());
        assertEquals(2, mostrarPm.getPropostas().size());
        
    }
    
}
