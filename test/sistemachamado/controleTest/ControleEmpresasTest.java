/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.controleTest;

import Persistencia.EmpresaDAO;
import entidade.Empresa;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ControleEmpresasTest {
    
    public ControleEmpresasTest() {
    }
    @Test
    public void criandoControleEmpresasTest(){
        Empresa e = new Empresa(1234, "Informatica");
        EmpresaDAO edao = new EmpresaDAO();
        edao.put(e);
        edao.persit();
        edao.getEmpresas();
        
    }
}
