package atividade02.parte2;

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
public class UsuarioValidatorTest {
    
    SenhaValidator senhaValidator = Mockito.mock(SenhaValidator.class);
    UsuarioDAO usuarioDAO = Mockito.mock(UsuarioDAO.class);
    UsuarioValidator usuarioValidator = new UsuarioValidator(usuarioDAO);
    Usuario usuario = new Usuario();
    
    public UsuarioValidatorTest() {
        
        this.usuarioDAO = mock(UsuarioDAO.class);
        this.senhaValidator = mock(SenhaValidator.class);
        this.usuario = new Usuario();
        this.usuarioValidator = new UsuarioValidator(usuarioDAO);
        usuarioValidator.setSenhaValidator(senhaValidator);
   
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
     * Test01 - Testar nome de usuário com menos de 5 caracteres.
     */
    @Test(expected = Exception.class)
    public void test01() throws Exception {
        
        usuarioValidator.setSenhaValidator(senhaValidator);
        usuario.setNome("Luiz");
        usuarioValidator.ehUsuarioValido(usuario);
       
    }
    
    /**
     * Test02 - Testar para confirmação de senha não confere com senha.
     */
    @Test(expected = Exception.class)
    public void test02() throws Exception {
        
        usuarioValidator.setSenhaValidator(senhaValidator);
        usuario.setNome("Jonata");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201702");
        usuarioValidator.ehUsuarioValido(usuario);
       
    }
    
    /**
     * Test03 - Testar para se senha inválida.
     */
    @Test(expected = Exception.class)
    public void test03() throws Exception {
        
        Mockito.when(senhaValidator.verificar("201802")).thenReturn(true);
        usuarioValidator.setSenhaValidator(senhaValidator);
        usuario.setNome("Jonata");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201802");
        usuarioValidator.ehUsuarioValido(usuario);  
       
    }
    
    /**
     * Test04 - Testar para usuário inválido (nome com números).
     */
    @Test
    public void test04() throws Exception {
        
        usuarioValidator.setSenhaValidator(senhaValidator);
        Mockito.when(senhaValidator.verificar("201802")).thenReturn(false);
        usuario.setNome("Jonata2018");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201802");
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
        
    }
    
    /**
     * Test05 - Testar para usuário com nome inválido.
     */
    @Test
    public void test05() throws Exception {
        
        Mockito.when(senhaValidator.verificar("201802")).thenReturn(false);
        usuario.setNome(" Jonata");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201802");
        assertFalse(usuarioValidator.ehUsuarioValido(usuario));
        
    }
    
    /**
     * Test06 - Testar para usuário já existe
     */
    @Test(expected = Exception.class)
    public void test06() throws Exception{
        
        Mockito.when(senhaValidator.verificar("201802")).thenReturn(false);
        Mockito.when(usuarioDAO.getByName("Jonata")).thenReturn(usuario);
        usuario.setNome("Jonata");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201802");
        usuarioValidator.ehUsuarioValido(usuario);
        
    } 
    
    /**
     * Test07 - Testar para usuário válido.
     */
    @Test
    public void test07() throws Exception {
        
        usuarioValidator.setSenhaValidator(senhaValidator);
        Mockito.when(senhaValidator.verificar("201802")).thenReturn(false);
        Mockito.when(usuarioDAO.getByName("Jonata")).thenReturn(null);
        usuario.setNome("Jonata");
        usuario.setSenha("201802");
        usuario.setSenhaConfirmada("201802");
        assertTrue(usuarioValidator.ehUsuarioValido(usuario));
        
    }
    
}
