/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nelson
 */
public class ClienteEmpresaTest {

    public ClienteEmpresaTest() {
    }

    @Test
    public void criandoClienteEmpresaTest() {
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        assertEquals(e.getNomeEmpresa(), cm.getEmpresa().getNomeEmpresa());
        assertEquals(e.getNumeroContrato(), cm.getEmpresa().getNumeroContrato());
        assertEquals("larissa", cm.getNome());
        assertEquals(123456789, cm.getCpf());
        assertEquals(12345678, cm.getTelefone());
        
    }

    @Test
    public void mudandoInformacaoClienteEmpresaTest() {
        Empresa e1 = new Empresa(1234, "Informatica");
        e1.setNomeEmpresa("Samsung");
        ClienteEmpresa cm1 = new ClienteEmpresa(12, e1, 123456789, "larissa", 12345678);
        cm1.setNome("mauricio");
        cm1.setTelefone(98745612);
        cm1.setCpf(874561234);
        assertEquals(e1.getNomeEmpresa(), cm1.getEmpresa().getNomeEmpresa());
        assertEquals(e1.getNumeroContrato(), cm1.getEmpresa().getNumeroContrato());
        assertEquals("mauricio", cm1.getNome());
        assertEquals(874561234, cm1.getCpf());
        assertEquals(98745612, cm1.getTelefone());
    }
    
    
}
