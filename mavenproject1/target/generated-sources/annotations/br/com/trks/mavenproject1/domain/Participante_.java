package br.com.trks.mavenproject1.domain;

import br.com.trks.mavenproject1.domain.Artigo;
import br.com.trks.mavenproject1.domain.Contato;
import br.com.trks.mavenproject1.domain.Endereco;
import br.com.trks.mavenproject1.domain.Inscricao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T20:47:43")
@StaticMetamodel(Participante.class)
public class Participante_ { 

    public static volatile ListAttribute<Participante, Inscricao> inscricoes;
    public static volatile SingularAttribute<Participante, Endereco> endereco;
    public static volatile SingularAttribute<Participante, String> instituicao;
    public static volatile SingularAttribute<Participante, String> cpf;
    public static volatile SingularAttribute<Participante, String> profissao;
    public static volatile SingularAttribute<Participante, String> nome;
    public static volatile SingularAttribute<Participante, String> tipoUsuario;
    public static volatile SingularAttribute<Participante, Integer> id;
    public static volatile SingularAttribute<Participante, Contato> contato;
    public static volatile ListAttribute<Participante, Artigo> artigos;
    public static volatile SingularAttribute<Participante, String> email;

}