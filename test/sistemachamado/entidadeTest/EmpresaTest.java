/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Nelson
 */
public class EmpresaTest {
    
    public EmpresaTest() {
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

    @Test
    public void criandoEmpresaTest(){
        Empresa e = new Empresa(1234,"Informatica");
        assertEquals("Informatica", e.getNomeEmpresa());
        assertEquals(1234, e.getNumeroContrato());
    }
    
    @Test
    public void numeroContratoInvalidoTest(){
        Empresa e1 = new Empresa(-1234,"Informatica");
        e1.setNumeroContrato(1234);
        assertEquals(1234, e1.getNumeroContrato());
    }
    
    @Test
    public void nomesEmpresasIguaisTest(){
        Empresa e2 = new Empresa(4567, "Informatica");
        Empresa e22 = new Empresa(456, "Informatica");
        assertEquals(e2.getNomeEmpresa(), e22.getNomeEmpresa());
        assertEquals(e2.getNumeroContrato(), e22.getNumeroContrato());
//        assertEquals("Informatica", e2.getNomeEmpresa());
//        assertEquals(4567, e2.getNumeroContrato());
    }
    
    
}
