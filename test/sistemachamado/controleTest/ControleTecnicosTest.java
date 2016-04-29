/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.controleTest;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ControleTecnicosTest {
    private TecnicoDAO tdao;
    public ControleTecnicosTest() {
    }
    @Test
    public void criandoControleTecnicosTest(){
        Tecnico t = new Tecnico("larissa", 12345678);
//        tdao.put(t);
//        tdao.persit();
        Assert.assertEquals("larissa", t.getNome());
        Assert.assertEquals(12345678, t.getTelefone());
    }
}
