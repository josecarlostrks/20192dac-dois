import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.trks.dao.*;
import br.com.trks.dominio.*;

@RunWith(Arquillian.class)
public class JpaTest {

	@Inject
	ParticipanteDao participanteDao;
	

	@Deployment
	public static JavaArchive criarArquivoTeste() {
		return ShrinkWrap.create(JavaArchive.class)
				.addPackage(ParticipanteDao.class.getPackage())
				.addPackage(Participante.class.getPackage())
				.addAsResource("META-INF/persistence.xml");
	}

	@Test
	@InSequence(1)
	public void testeSalvarParticipante() {
		Participante p1 = new Participante();
		p1.setNome("carlos");
		p1.setEmail("carlostrks@gmail.com");
		p1.setContato(new Contato("35314215","998138927",""));
		participanteDao.salvar(p1);

		Participante p2 = new Participante();
		p2.setNome("josé");
		p2.setEmail("jctrks@gmail.com");
		p2.setContato(new Contato("35217787","991228374",""));
		participanteDao.salvar(p2);
	}
	
	@Test
	@InSequence(2)
	@Ignore
	public void participanteComEndereco() {
		Participante p1 = new Participante();
		p1.setNome("vanessa");
		p1.setEmail("vanessa@gmail.com");
		p1.setContato(new Contato("35314215","998138927",""));
		Endereco end = new Endereco("rua do meio","300","jardim oasis","cajazeiras",
				"paraiba","58900000");
		p1.setEndereco(end);
		participanteDao.salvar(p1);
	}	
	
	
}
