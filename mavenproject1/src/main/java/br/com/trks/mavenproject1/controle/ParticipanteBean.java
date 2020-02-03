/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.p
 */
package br.com.trks.mavenproject1.controle;

import br.com.trks.mavenproject1.dao.ParticipanteDao;
import br.com.trks.mavenproject1.domain.Participante;
import javax.ejb.EJB;
import javax.inject.Named;

/**
 *
 * @author carlos
 */

@Named
public class ParticipanteBean {
    
    private String nome;
    private String cpf;
    
    @EJB
    private ParticipanteDao service;
    
    public void salvar(){
        Participante p = new Participante();
        p.setNome(nome);
        p.setCpf(cpf);
        service.salvar(p);
    }
    
}
