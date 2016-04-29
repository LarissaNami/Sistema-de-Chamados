/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.controleTest;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ControleClientesTest {

    

    public ControleClientesTest() {
    }

    @Test
    public void criandoControleClientesTest() {
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
//        Assert.assertEquals(12345678, cm.getCpf());
        
        ClienteDAO cdao = new ClienteDAO();
        cdao.put(cm);
        cdao.persit();
    }
}
