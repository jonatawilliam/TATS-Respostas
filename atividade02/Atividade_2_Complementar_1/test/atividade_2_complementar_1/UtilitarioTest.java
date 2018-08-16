/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2_complementar_1;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonatawilliam
 */
public class UtilitarioTest {
    
    Utilitario utilitario;
    
    public UtilitarioTest() {
        
        this.utilitario = new Utilitario();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test 01 - um vetor {1, 2, 3, 4, 5, 6}
     */
    @Test
    public void test01() throws Exception {
        
        int[] vetor = {1, 2, 3, 4, 5, 6};
        Extremos comparador = new Extremos(1, 0, 6, 5);
        Extremos resultado = utilitario.acharExtremos(vetor);
        
        assertEquals(comparador.indiceMaior, resultado.indiceMaior);
        assertEquals(comparador.indiceMenor, resultado.indiceMenor);
        assertEquals(comparador.maior, resultado.maior);
        assertEquals(comparador.menor, resultado.menor);
    
    }
    
    /**
     * Test 02 - um vetor {1, 99, 3, -5, 8}
     */
    @Test
    public void test02() throws Exception {
        
        int[] vetor = {1, 99, 3, -5, 8};
        Extremos comparador = new Extremos(-5, 3, 99, 1);
        Extremos resultado = utilitario.acharExtremos(vetor);
        
        assertEquals(comparador.indiceMaior, resultado.indiceMaior);
        assertEquals(comparador.indiceMenor, resultado.indiceMenor);
        assertEquals(comparador.maior, resultado.maior);
        assertEquals(comparador.menor, resultado.menor);
    
    }
    
    /**
     * Test 03 - um vetor vazio
     */
    @Test(expected = Exception.class)
    public void test03() throws Exception {
        
        int[] vetor = {};
        Extremos resultado = utilitario.acharExtremos(vetor);
        
    }
    
    /**
     * Test 04 - um vetor nulo
     */
    @Test(expected = Exception.class)
    public void test04() throws Exception {
        
        int[] vetor = null;
        Extremos resultado = utilitario.acharExtremos(vetor);
        
    }
    
}
