/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistemachamado.entidade.Pessoa;

/**
 *
 * @author 41414268
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    @Test
    public void getNomeTelefoneTest(){
        Pessoa p = new Pessoa("larissa", 12345678);
        assertEquals("larissa", p.getNome());
        assertEquals(12345678, p.getTelefone());
    }
    
    @Test
    public void setNomeTelefoneTest(){
        Pessoa p1 = new Pessoa("larissa", 12345678);
        assertEquals("larissa", p1.getNome());
        assertEquals(12345678, p1.getTelefone());
        p1.setNome("natalia");
        p1.setTelefone(23456789);
        assertEquals("natalia", p1.getNome());
        assertEquals(23456789, p1.getTelefone());
    }
    
}
