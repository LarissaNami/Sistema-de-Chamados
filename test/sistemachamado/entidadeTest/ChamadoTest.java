/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidadeTest;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Nelson
 * Integer codigo, String titulo, String descricao, int prioridade, Tecnico tecnico,
            ClienteEmpresa cliente, String sistemaOperacional, String versaoSO, String tipoConexao, String enderecoRede
 */
public class ChamadoTest {

    public ChamadoTest() {
    }
    @Test
    public void criandoChamdoBancoDeDadosTest(){

        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("mysql", c.getBancoDeDados());
         
    }
    @Test
    public void mudacaDeTecnicoTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        t.setNome("mauro");
        t.setTelefone(98745612);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("mysql", c.getBancoDeDados());
    }
    @Test
    public void mudacaDeEmpresaTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        e.setNomeEmpresa("Samsung");
        e.setNumeroContrato(7894);
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("mysql", c.getBancoDeDados());
    }
    @Test
    public void mudacaDeBancoDeDadosTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        c.setBancoDeDados("Oracle");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("Oracle", c.getBancoDeDados());
    }
    @Test
    public void criandoChamdoProblemaDeRedeTest(){

        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado(12, "wifi", "erro na conexao do wifi", 5, t, cm, "windows", "7", "vivo fibra", "172.16.0.10");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("wifi", c.getTitulo());
        assertEquals("vivo fibra", c.getTipoConexao());
        assertEquals("172.16.0.10", c.getEnderecoRede());
         
    }
    @Test
    public void mudacaDeSistemaOperacionalTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado(12, "wifi", "erro na conexao do wifi", 5, t, cm, "windows", "7", "vivo fibra", "172.16.0.10");
        c.setSistemaOperacional("Linux");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("Linux", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("wifi", c.getTitulo());
        assertEquals("vivo fibra", c.getTipoConexao());
        assertEquals("172.16.0.10", c.getEnderecoRede());
    }
    @Test
    public void mudacaDeEnderecoRedeTest(){
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado(12, "wifi", "erro na conexao do wifi", 5, t, cm, "windows", "7", "vivo fibra", "172.16.0.10");
        c.setEnderecoRede("172.16.0.18");
        assertEquals(5, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("vivo fibra", c.getTipoConexao());
        assertEquals("172.16.0.18", c.getEnderecoRede());
    }
    @Test
    public void criandoChamdoProblemaDeDesempenhoTest(){

        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("lento", "computador esta rodando lentamente ", 3, t, cm, "windows", "7", "formatar", 3.3);
        assertEquals(3, c.getPrioridade());
        assertEquals(t.getNome(), c.getTecnico().getNome());
        assertEquals(cm.getEmpresa(), c.getCliente().getEmpresa());
        assertEquals("windows", c.getSistemaOperacional());
        assertEquals("7", c.getVersaoSO());
        assertEquals("lento", c.getTitulo());
        assertEquals("formatar", c.getOperacao());
//        assertEquals("3.3", c.getDuracaoOperacao());
         
    }
}
