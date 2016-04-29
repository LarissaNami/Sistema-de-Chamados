/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.persistenciaTest;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }
    @Test
    public void criandoClienteTest(){
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        
        
    }
}
