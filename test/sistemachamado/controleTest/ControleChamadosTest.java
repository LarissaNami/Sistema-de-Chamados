/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.controleTest;

import Persistencia.ChamadoDAO;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import org.junit.Test;

/**
 *
 * @author Nelson
 */
public class ControleChamadosTest {
    
    public ControleChamadosTest() {
    }
    @Test
    public void criandoControleChamadosBancoDeDadosTest(){
        ChamadoDAO cdao = new ChamadoDAO();
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("erro", "insercao nao funcionando", 5, t, cm, "windows", "7", "mysql");
        
        cdao.put(c);
        //cdao.persit();
        cdao.getChamados();
        cdao.getRegistros();
    }
    @Test
    public void criandoControleChamadosProblemaDeRedeTest(){
        ChamadoDAO cdao = new ChamadoDAO();
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado(12, "wifi", "erro na conexao do wifi", 5, t, cm, "windows", "7", "vivo fibra", "172.16.0.10");
        
        cdao.put(c);
        //cdao.persit();
        cdao.getChamados();
        cdao.getRegistros();
    }
    @Test
    public void criandoControleChamadosProblemaDeDesempenhoTest(){
        ChamadoDAO cdao = new ChamadoDAO();
        Tecnico t = new Tecnico("larissa", 1234578);
        Empresa e = new Empresa(1234, "Informatica");
        ClienteEmpresa cm = new ClienteEmpresa(12, e, 123456789, "larissa", 12345678);
        Chamado c = new Chamado("lento", "computador esta rodando lentamente ", 3, t, cm, "windows", "7", "formatar", 3.3);
        
        cdao.put(c);
        //cdao.persit();
        cdao.getChamados();
        cdao.getRegistros();
    }
   
}
