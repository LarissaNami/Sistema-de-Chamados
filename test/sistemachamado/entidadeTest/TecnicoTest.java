/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nelson
 */
public class TecnicoTest {

    public TecnicoTest() {
    }

    @Test
    public void criandoTecnicoTest() {
        Tecnico t = new Tecnico("mauricio", 12345678);
        assertEquals("mauricio", t.getNome());
    }
    @Test
    public void nomesIguaisTest(){
        Tecnico t1 = new Tecnico("mauricio", 12345678);
        Tecnico t11 = new Tecnico("mauricio", 98745612);
        assertEquals(t1.getNome(), t11.getNome());
        assertEquals(12345678, t1.getTelefone());
        assertEquals(98745612, t11.getTelefone());
    }
    @Test
    public void numeroTelefoneIguaisTest(){
        Tecnico t1 = new Tecnico("mauro", 98745612);
        Tecnico t11 = new Tecnico("mauricio", 98745612);
//        assertEquals(t1.getTelefone(), t11.getTelefone());
        assertEquals(98745612, t1.getTelefone());
        assertEquals(98745613, t11.getTelefone());
    }
}
