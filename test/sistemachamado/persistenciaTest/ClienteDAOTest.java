/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.persistenciaTest;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ClienteDAOTest {
    private ClienteDAO cdao;
    private HashMap<Long, ClienteEmpresa>cm;
    public ClienteDAOTest() {
    }
//    @Test
//    public void criandoClienteDAOTest(){
//        Empresa e = new Empresa(4567, "Informatica");
//        ClienteEmpresa cm1 = new ClienteEmpresa(12, e, 14587963,"larissa", 12345678);
//        cdao.persit();
//        //cdao.validarCPF(cm1.getCpf());
//        Assert.assertEquals(null, cdao);
//    }
}
