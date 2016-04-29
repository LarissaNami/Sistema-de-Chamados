/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nelson
 */
public class RegistroChamadoTest {
    
    public RegistroChamadoTest() {
    }
    
    @Test
    public void criandoRegistroChamadoTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        RegistroChamado rc = new RegistroChamado("insercao do banco de dados da empresa", c, t);
        assertEquals(t.getNome(), rc.getTecnico().getNome());
        assertEquals("insercao do banco de dados da empresa", rc.getAssunto());
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("mysql", c.getBancoDeDados());
        
    }
    @Test
    public void mudandoRegistroChamadoTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        t.setNome("mauricio");
        t.setTelefone(78945612);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("funcionamento", "o banco de dados nao esta mais funcionando", 5, t, cm, "windows", "7", "mysql");
        RegistroChamado rc = new RegistroChamado("funcionamento do banco de dados", c, t);
        assertEquals(t.getNome(), rc.getTecnico().getNome());
        assertEquals(t.getTelefone(), rc.getTecnico().getTelefone());
        assertEquals("funcionamento do banco de dados", rc.getAssunto());
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("mysql", c.getBancoDeDados());
        
    }
}
