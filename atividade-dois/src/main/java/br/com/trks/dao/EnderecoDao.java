package br.com.trks.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.trks.dominio.Endereco;

@Stateless
public class EnderecoDao {
	
	@PersistenceContext(unitName="dac")
	EntityManager em;
	
	public void salvar(Endereco endereco) {
		em.persist(endereco);
	}
	
	public void atualizar(Endereco endereco) {
		em.merge(endereco);
	}
	
	public Endereco buscar(Integer id) {
		return em.find(Endereco.class, id);
	}
	
	public List<Endereco> listar() {
		return em.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
	}
	
	

}
