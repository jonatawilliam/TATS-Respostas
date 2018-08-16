/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2_complementar_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

/**
 *
 * @author jonatawilliam
 */
public class TurmaControllerTest {
    
    VerificadorDeCodigos verificador = Mockito.mock(VerificadorDeCodigos.class);
    TurmaDAO turmaDAO = Mockito.mock(TurmaDAO.class);
    TurmaController turmaController = new TurmaController(turmaDAO);
    Turma turma = new Turma();
    Turma turmaB = new Turma();
    
    public TurmaControllerTest() {
       
       turmaController.setVerificador(verificador);
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
     * Test01 - código da disciplina inválido.
     */
    @Test
    public void test01() throws Exception {
        
        Mockito.when(verificador.verificarCodigoDisciplina("PDF")).thenReturn(false);
        turma.setCodDisciplina("PDF");
        String resultado = turmaController.cadastrarTurma(turma);
        Mockito.verify(verificador).verificarCodigoDisciplina("PDF");
        assertEquals("codigo disciplina invalido", resultado);

    }
    
    /**
     * Test02 - código da turma inválido.
     */
    @Test
    public void test02() throws Exception {
        
        Mockito.when(verificador.verificarCodigoDisciplina(Mockito.any())).thenReturn(true);
        turma.setCodTurma("ES81A");
        Mockito.when(verificador.verificarCodigoTurma("ES81A")).thenReturn(false);
        String resultado = turmaController.cadastrarTurma(turma);
        Mockito.verify(verificador).verificarCodigoTurma("ES81A");
        assertEquals("codigo turma invalido", resultado);


    }
    
    /**
     * Test03 - turma ja existe.
     */
    @Test
    public void test03() throws Exception {
        
        Mockito.when(verificador.verificarCodigoDisciplina(Mockito.any())).thenReturn(true);
        Mockito.when(verificador.verificarCodigoTurma(Mockito.any())).thenReturn(true);
        Mockito.when(turmaDAO.existe(Mockito.any())).thenReturn(true);
        String resultado = turmaController.cadastrarTurma(turma);
        assertEquals("turma ja existe", resultado);
    }
    
    /**
     * Test04 - turma salva com sucesso.
     */
    @Test
    public void test04() throws Exception {
        
        Mockito.when(verificador.verificarCodigoDisciplina(Mockito.any())).thenReturn(true);
        Mockito.when(verificador.verificarCodigoTurma(Mockito.any())).thenReturn(true);
        Mockito.when(turmaDAO.existe(Mockito.any())).thenReturn(false);
        Mockito.when(turmaDAO.salvar(Mockito.any())).thenReturn(true);
        String resultado = turmaController.cadastrarTurma(turma);
        assertEquals("turma salva com sucesso", resultado);

    }
    
     /**
     * Test05 - turma nao salva. Erro no BD
     */
    @Test
    public void test05() throws Exception {
        
        Mockito.when(verificador.verificarCodigoDisciplina(Mockito.any())).thenReturn(true);
        Mockito.when(verificador.verificarCodigoTurma(Mockito.any())).thenReturn(true);
        Mockito.when(turmaDAO.existe(Mockito.any())).thenReturn(false);
        Mockito.when(turmaDAO.salvar(Mockito.any())).thenReturn(false);
        String resultado = turmaController.cadastrarTurma(turma);
        assertEquals("turma nao salva. Erro no BD", resultado);
        

    }

    
    
}
