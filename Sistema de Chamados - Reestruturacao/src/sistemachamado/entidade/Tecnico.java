/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemachamado.entidade;

import java.io.Serializable;

/**
 *
 * @author 41414268
 */
public class Tecnico extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tecnico(String nome, long telefone) {
        super(nome, telefone);
    }

    @Override
    public String toString() {
        return this.getNome();
    }

}