package br.com.trks.mavenproject1.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T20:47:43")
@StaticMetamodel(Inscricao.class)
public class Inscricao_ { 

    public static volatile SingularAttribute<Inscricao, Double> preco;
    public static volatile SingularAttribute<Inscricao, String> tipoEvento;
    public static volatile SingularAttribute<Inscricao, Date> dataInscricao;
    public static volatile SingularAttribute<Inscricao, Integer> id;
    public static volatile SingularAttribute<Inscricao, String> tipoParticipante;
    public static volatile SingularAttribute<Inscricao, String> status;

}